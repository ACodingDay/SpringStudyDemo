package lambdaTest;

/**
 * @author yyt
 * @date 2021年12月26日 15:53
 * 多个参数，有返回值
 */
@FunctionalInterface
public interface MultiParamAndReturn {
   String sayHello(String name, int age);
}
