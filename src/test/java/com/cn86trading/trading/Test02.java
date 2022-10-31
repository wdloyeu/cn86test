package com.cn86trading.trading;

import org.junit.jupiter.api.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading
 * @ClassName : Test02.java
 * @createTime : 2022/10/28 17:54
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
public class Test02 {

    interface Printer{
        int printer(String val);
    }

    int Printer(String val, Printer printer) {
        return printer.printer(val);
    }

    public static void main(String[] args) {
        Test02 test02 = new Test02();
        Printer printer = new Printer() {
            @Override
            public int printer(String val) {
                System.out.println(val);
                return 1;
            }
        };

        String str = "你好吗";
        System.out.println(test02.Printer(str, printer));

        Printer printer1 = val -> {System.out.println(val); return 1; };

        int i = test02.Printer(str, (val) -> { System.out.println(val); return 1;} );
        //System.out.println();
    }


}
