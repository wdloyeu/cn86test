package com.cn86trading.trading;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading
 * @ClassName : Test04.java
 * @createTime : 2022/10/29 10:52
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
public class Test04 {

    public static void main(String[] args) {
        Haman haman = new HamanImp();
        Haman ja = (Haman) DomainProxy.getInstance(haman);
        ja.aihao("上的六十六");
        ja.xxx();
    }
}

interface Haman {
    String aihao(String name);

    void xxx();
}

class HamanImp implements Haman {

    @Override
    public String aihao(String name) {
        System.out.println("你好：" + name);
        return "天涯";
    }

    @Override
    public void xxx() {
        System.out.println("xxxxxx==========");
    }
}

class DomainProxy {

    public static Object getInstance(Object obj) {

        MyHandler myHandler = new MyHandler();
        myHandler.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), myHandler);
    }
}

class MyHandler implements InvocationHandler {

    private Object object;

    public void bind(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object returnValue = method.invoke(this.object, args);
        return returnValue;
    }
}