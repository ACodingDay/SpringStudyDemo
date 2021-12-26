package com.study.scope;

/**
 * @author yyt
 * @date 2021年12月05日 18:39
 * Java的基础知识：作用域
 */
public class ScopeReviewDemo {
    // 类级别成员
    private static String classVariable = "静态变量c";

    // 对象级别成员
    private String objectVariable = "非静态变量o";

    public static void main(String[] args) throws Exception {
        // 方法级别的成员变量
        String methodVariable = "m";
        for (int i = 0; i < args.length; i++) {
            // 循环体中的局部变量，只在循环体中有用
            String partVariable = args[i];
            // 此处能访问哪些变量？
            System.out.println(partVariable);
            System.out.println(methodVariable);
            System.out.println(classVariable);
            staticTest();
            // 注意：main()方法是静态方法，不能直接调用非静态成员属性和成员方法
        }
        // 此处能访问哪些变量？
        System.out.println(methodVariable);
        System.out.println(classVariable);
        staticTest();
    }

    public void test() {
        // 此处能访问哪些变量？
        System.out.println("这是一个非静态方法");
        System.out.println(classVariable);
        System.out.println(objectVariable);
        staticTest();
    }

    public static void staticTest() {
        // 此处能访问哪些变量？
        System.out.println("这是一个静态方法");
        System.out.println(classVariable);
    }
}
