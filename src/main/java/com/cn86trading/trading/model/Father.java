package com.cn86trading.trading.model;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.model
 * @ClassName : Father.java
 * @createTime : 2022/10/31 21:21
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@Data
public class Father {

    @NotEmpty
    private String name;

    @Min(18)
    private Integer age;
}
