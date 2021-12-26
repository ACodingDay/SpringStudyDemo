package lambdaTest;

/**
 * @author yyt
 * @date 2021年12月26日 19:39
 */
public class Function4Test {
    public static void main(String[] args) {
        /**
         * 通过[类名::new]的方式来实例化对象
         * 原写法：ProductCreator creator = (id, name, price) -> new lambdaTest.Product(id, name, price);
         */
        ProductCreator creator = Product::new;
        Product p1 = creator.getProduct(1, "大棉袄", 365.00);
        System.out.println(p1.toString());
    }

    @FunctionalInterface
    interface ProductCreator {
        Product getProduct(int id, String name, double price);
    }
}
