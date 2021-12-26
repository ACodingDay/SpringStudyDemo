package lambdaTest;

/**
 * @author yyt
 * @date 2021年12月26日 17:55
 */
public class Function3Test {
    public static void main(String[] args) {
        Function3Test test3 = new Function3Test();
        /**
         * 在 Lambda 表达式中使用对象的方法时，[对象名::方法名]
         * 原写法：Example exam = (num1, num2) -> test3.compare(num1, num2);
         */
        Example2 exam = test3::compare;
        int result = exam.compareOperation(10, 20);
        System.out.println(result);
    }

    @FunctionalInterface
    interface Example2 {
        int compareOperation(int num1, int num2);
    }

    public int compare(Integer o1, Integer o2) {
        // 小于--负整数；等于--零；大于--正整数
        return o1.compareTo(o2);
    }
}
