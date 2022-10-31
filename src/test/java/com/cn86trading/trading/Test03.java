package com.cn86trading.trading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading
 * @ClassName : Test03.java
 * @createTime : 2022/10/28 19:10
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
public class Test03 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("xiaow", "wangyu", "mingke", "xixi", "luky");

        //将list转成set
        //Set<String> set = new HashSet<>(list);

        List<String> list1 = list.stream().filter(s -> s.startsWith("x"))
                .map(String::toUpperCase).
                sorted()
                .collect(Collectors.toList());
        for (String str : list1) {
            System.out.println(str);
        }

        String[] strs = {"xiaow", "wangyu", "mingke", "xixi", "luky"};
        List<String> list2 = Stream.of(strs)
                .filter(s -> s.startsWith("x"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        for (String str : list2) {
            System.out.println(str);
        }

//        try {
//            Stream<String> stringStream = Files.lines(Paths.get("file.txt"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        Stream.of("xiaow", "wangyu", "mingke", "xixi", "luky")
                .limit(2)
                .forEach(System.out::println);

        Stream.of("xiaow", "wangyu", "mingke", "xixi", "luky")
                .sequential()//默认是串行计算
                .parallel()//并行计算
                .skip(2)
                .forEach(System.out::println);

        Stream.of("xiaow", "wangyu", "mingke", "xixi", "luky", "mingke")
                .distinct()
                .forEach(System.out::println);

        Stream.of("xiaow", "wangyu", "mingke", "xixi", "luky", "mingke")
                .sorted()
                .forEach(System.out::println);

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Integer total = integers.stream().reduce(0, (subtotal, element) -> subtotal + element);
        System.out.println(total);
        total = integers.stream().reduce(0, Integer::sum);
        System.out.println(total);

        List<String> letters = Arrays.asList("H", "e", "l", "l", "o", ",", "w", "o", "r", "l", "d");
        String str = letters.stream().reduce("", String::concat);
        System.out.println(str);
    }
}
