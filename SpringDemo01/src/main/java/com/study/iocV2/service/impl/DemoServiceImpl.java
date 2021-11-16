package com.study.iocV2.service.impl;

import com.study.iocV2.dao.BeanFactory;
import com.study.iocV2.dao.DemoDao;
import com.study.iocV2.dao.impl.DemoDaoImpl;
import com.study.iocV2.service.DemoService;

import java.util.List;

/**
 * @author yyt
 * @date 2021年11月13日 22:01
 * 服务层接口的实现类
 */
public class DemoServiceImpl implements DemoService {

    /**
     * 内部依赖于 DemoDao 接口
     * 【问题2】：需要手动 new 创建，一旦 Dao 改动，这个也需要改
     */
    // private DemoDao dd = new DemoDaoImpl();

    // 【改进2】：不需要手动 new，而是由静态工厂返回
//    DemoDao dd = BeanFactory.getDemoDao();

    // 【改进5】：传入需要获取的指定名称的类
    DemoDao dd = (DemoDao) BeanFactory.getBean("demoDao");

    // 【问题6】：多重构建对象
    public DemoServiceImpl(){
        for (int i = 0; i < 10; i++) {
            // 输出内存地址验证，不是同一个对象
            System.out.println(BeanFactory.getBean("demoDao"));
        }
    }

    @Override
    public List<String> findAll() {
        return dd.findAll();
    }
}
