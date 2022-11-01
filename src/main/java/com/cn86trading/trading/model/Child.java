package com.cn86trading.trading.model;

import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.model
 * @ClassName : Child.java
 * @createTime : 2022/10/31 21:22
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@Data
public class Child {
    private String name;
    private Integer age;
    private List<Friend> friends;

}
