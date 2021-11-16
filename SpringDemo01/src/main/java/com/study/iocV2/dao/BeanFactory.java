package com.study.iocV2.dao;

import com.study.iocV2.dao.impl.DemoDaoImpl;
import com.study.iocV2.dao.impl.DemoOracleDdaoImpl;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author yyt
 * @date 2021年11月13日 22:21
 * 【改进1】：静态工厂
 * 返回不同的 Dao 实例，只需要改动这里
 */
public class BeanFactory {

//    public static DemoDao getDemoDao(){
//        // 返回连接 MySQL 数据库的实例
//        // 【问题3】：紧耦合，一旦 DemoDaoImpl 类缺失，就无法通过编译
//        return new DemoDaoImpl();
//        // 返回连接 Oracle 数据库的实例
//        // return new DemoOracleDdaoImpl();
//    }

    // 【改进3】：利用反射创建实例，即使 DemoDaoImpl 类缺失，也不是编译的问题
//    public static DemoDao getDemoDao() {
//        try {
//            /**
//             * 'newInstance()' 已经过时了
//             * 以前的写法：
//             * return (DemoDao) Class.forName("com.study.iocV2.dao.impl.DemoDaoImpl").newInstance();
//             */
//            // 【问题4】：硬编码问题 —— com.study.iocV2.dao.impl.DemoDaoImpl 这个类名是写死的
//            return (DemoDao) Class.forName("com.study.iocV2.dao.impl.DemoDaoImpl").getDeclaredConstructor().newInstance();
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
//            e.printStackTrace();
//            // 抛出种种可能的异常
//            throw new RuntimeException("DemoDao 创建实例化发生异常，原因：" + e.getMessage());
//        }
//    }

    // 【改进4】：引入外部化配置文件，使用 IO 流读取 properties 文件
    private static Properties properties;
    // 在静态化代码块中初始化 properties，加载 factory.properties 文件
    static {
        properties = new Properties();
        try {
            // 必须使用类加载器读取 resource 文件夹下配置文件
            properties.load(BeanFactory.class.getClassLoader().getResourceAsStream("factory.properties"));
        } catch (IOException e) {
            e.printStackTrace();
            // 如果 BeanFactory 类的静态初始化都失败了，就没必要继续执行了
            throw new ExceptionInInitializerError("BeanFactory 类初始化失败，原因：" + e.getMessage());
        }
    }

    // 读取 factory.properties 文件中的特定类，反射构造实例
    public static DemoDao getDemoDao() {
        try {
            // 【问题5】：这里也没必要写死 demoDao
            Class<?> beanClazz = Class.forName(properties.getProperty("demoDao"));
            return (DemoDao) beanClazz.getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("BeanFactory 不存在 [demoDao] ", e);
        } catch (InvocationTargetException | IllegalAccessException | NoSuchMethodException | InstantiationException e) {
            e.printStackTrace();
            // 抛出各种可能的异常
            throw new RuntimeException("[demoDao] 初始化失败！", e);
        }
    }

    // 【改进6】：引入缓存，保存已经创建好的对象
    private static Map<String, Object> beanMap = new HashMap<>();

    // 【改进5】：根据传入的 beanName 反射实例化
    public static Object getBean(String beanName) {
        // 【改进6】：双重锁检查
        if (!beanMap.containsKey(beanName)){
            synchronized(BeanFactory.class){
                if (!beanMap.containsKey(beanName)){
                    // 确实不存在该实例
                    try {
                        Class<?> beanClazz = Class.forName(properties.getProperty(beanName));
                        Object obj = beanClazz.getDeclaredConstructor().newInstance();
                        // 创建后加入缓存区
                        beanMap.put(beanName, obj);
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                        throw new RuntimeException("BeanFactory 不存在 [" + beanName + "] 这个 bean", e);
                    } catch (InvocationTargetException | IllegalAccessException | NoSuchMethodException | InstantiationException e) {
                        e.printStackTrace();
                        // 抛出各种可能的异常
                        throw new RuntimeException("[" + beanName + "] 初始化失败！", e);
                    }
                }
            }
        }
        // 返回
        return beanMap.get(beanName);
    }

}
