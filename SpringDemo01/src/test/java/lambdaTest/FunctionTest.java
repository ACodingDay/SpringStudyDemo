package lambdaTest;

/**
 * @author yyt
 * @date 2021年12月26日 14:41
 * 演示 lambda 表达式的使用
 */
public class FunctionTest {
    public static void main(String[] args) {
        // 1.无参数，无返回值
        NoParamAndNoReturn npnr = () -> System.out.println("Hello, World!");
        npnr.sayHello();

        // 2.无参数，有返回值
        NoParamButReturn npbr = () -> "Hello, 2021!";
        String msg1 = npbr.sayHello();
        System.out.println(msg1);

        // 3.一个参数，无返回值
        OneParamButNoReturn opbnr = name -> System.out.println("你好，你可以叫我" + name);
        opbnr.sayHello("靓仔");

        // 4.一个参数，有返回值
        OneParamAndReturn opar = name -> {
            System.out.println("执行了一个参数，有返回值的方法");
            return name + "，我爱你！";
        };
        String msg2 = opar.sayHello("中国");
        System.out.println(msg2);

        // 5.多个参数，无返回值
        MultiParamButNoReturn mpbnr = (name, age) -> System.out.println("我叫" + name + "，今年" + age + "岁了");
        mpbnr.sayHello("靓仔", 21);

        // 6.多个参数，有返回值
        MultiParamAndReturn mpar = (a, b) -> a + "现在" + (b - 1949) + "岁了";
        String msg3 = mpar.sayHello("新中国", 2021);
        System.out.println(msg3);
    }
}


