package com.cn86trading.trading;

import lombok.Data;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading
 * @ClassName : Test01.java
 * @createTime : 2022/10/27 11:47
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@Data
public class Test01 {
    public static void main(String[] args) throws Exception {
//        Random random = new Random();
//        System.out.println(random.nextInt());
//
//
//
//        System.out.println(10/2);
//
//        Scanner scanner = new Scanner(System.in);
//        int ss = scanner.nextInt();
//        System.out.println(ss);
//
//        new Jisuan().mul(new Compute(){
//            @Override
//            public int mul(int x, int y) {
//                return x * y;
//            }
//        }, 100, 200);
        System.out.println(m());

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "zhangsan");
        map.put(2, "lisi");
        map.put(3, "zhaoliu");
        map.put(4, "wangwu");

        map.remove(2);

        Set<Integer> key = map.keySet();
        Iterator<Integer> iterator = key.iterator();
        while (iterator.hasNext()) {
            String value = map.get(iterator.next());
            System.out.println(value);
        }

        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it2 = set.iterator();
        while (it2.hasNext()) {
            Map.Entry<Integer, String> map2 = it2.next();
            System.out.println(map2.getKey() + "=" + map2.getValue());
        }

        PrintStream ps = System.out;
        ps.println("dsfldsjflsfs");
        ps.println("dkfjsljfdlkjslf");
        ps.println("d--------------------");

        PrintStream ps2 = new PrintStream(new FileOutputStream("ssss"));
        System.setOut(ps2);
        ps2.println("djflsjflss");
        ps2.println("dkfjsldjfsd");
        ps2.println("--------------------");
        System.out.println("000000000000000000");
    }

    public static int m() {
        int i= 100;
        try {
            return i;
        } finally {
            ++i;
        }
    }
}


interface Compute {
    int mul(int x, int y);
}

class Jisuan {
    public void mul(Compute c, int x, int y) {
        int resultVue = c.mul(x, y);
        System.out.println(x + "*" + y + "=" + resultVue);
    }
}