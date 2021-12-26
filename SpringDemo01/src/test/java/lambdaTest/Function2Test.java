package lambdaTest;

/**
 * @author yyt
 * @date 2021年12月26日 16:49
 */
public class Function2Test {
    public static void main(String[] args) {
        /**
         * 引用静态方法，格式为[类名::方法名]
         * 原写法：Example exam = a -> addTenOpreration(a);
         * 引用了一个已经实现的 addTenOperation() 方法
         */
        Example exam = Function2Test::addTenOperation;
        int result = exam.addTenOperation(10);
        System.out.println(result);

        /**
         * 一个参数，无返回值的情况
         * 原写法：lambdaTest.OneParamButNoReturn opbnr = name -> System.out.println(name);
         */
        OneParamButNoReturn opbnr = System.out::println;
        opbnr.sayHello("666");
    }

    @FunctionalInterface
    interface Example {
        int addTenOperation(int num);
    }

    public static int addTenOperation(int num) {
        // 执行加 10 操作
        return num + 10;
    }
}
