package lambdaTest;

/**
 * @author yyt
 * @date 2021年12月26日 15:52
 * 多个参数，无返回值
 */
@FunctionalInterface
public interface MultiParamButNoReturn {
    void sayHello(String name, int age);
}
