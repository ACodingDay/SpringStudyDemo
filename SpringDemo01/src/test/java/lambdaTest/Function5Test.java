package lambdaTest;

import java.util.*;
import java.util.function.Predicate;

/**
 * @author yyt
 * @date 2021年12月26日 20:34
 */
public class Function5Test {
    public static void main(String[] args) {
        // 1.遍历列表
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7);
        // 使用 Lambda 表达式遍历
        list.forEach(System.out::println);

        // 2.过滤元素
        List<String> lsit2 = Arrays.asList("Java", "PHP", "C++", "Golang", "Python", "Kotlin");
        // Predicate<String> condition = (s) -> s.length() > 5;
        // 使用 Lambda 表达式简化
        filter(lsit2, (s) -> (((String) s).length() > 5));

        // 3.删除满足条件的元素
        List<Product> proList = new ArrayList<Product>() {
            {
                add(new Product(1, "电动牙刷", 230.00));
                add(new Product(2, "品牌文化衫", 99.00));
                add(new Product(3, "无线鼠标", 177.00));
                add(new Product(4, "机械键盘", 418.00));
                add(new Product(5, "除螨仪", 199.00));
            }
        };
        // Predicate<E> filter，使用 Lambda 简化
        proList.removeIf(p -> p.getId() == 3);
        // 输出验证
        System.out.println("删除特定目标后的 ArrayList: " + proList.size());

        // 4.元素排序
        List<Product> proList2 = new ArrayList<Product>() {
            {
                add(new Product(1, "小米平板5", 2299.00));
                add(new Product(2, "米家电动剃须刀", 99.00));
                add(new Product(3, "Redmi路由器AX1800", 229.00));
                add(new Product(4, "小米中性笔", 24.90));
                add(new Product(5, "黑鲨4游戏手机", 2299.00));
                add(new Product(6, "米家加湿器", 99.00));
                add(new Product(7, "米家指甲刀", 9.90));
                add(new Product(8, "Redmi手表", 269.00));
                add(new Product(9, "RedmiK40游戏手机", 2299.00));
            }
        };
        // 自定义排序：先比较价格，再比较 id
//        proList2.sort((s1, s2) -> {
//            if (s1.getPrice() == s2.getPrice()) {
//                return Integer.compare(s1.getId(), s2.getId());
//            } else {
//                return Double.compare(s1.getPrice(), s2.getPrice());
//            }
//        });
        // 使用 Lambda 表达式
        proList2.sort(Comparator.comparing(Product::getPrice).thenComparing(Product::getId));
        // 输出验证
        proList2.forEach(System.out::println);
    }

    // 使用 Predicate 接口
    public static void filter(List<String> list, Predicate condition) {
        for (String content : list) {
            if (condition.test(content)) {
                System.out.println("符合条件的内容：" + content);
            }
        }
        // 可以使用 Lambda 表达式简化
        // list.stream().filter(condition).forEach((content) -> System.out.println("符合条件的内容：" + content));
    }
}
