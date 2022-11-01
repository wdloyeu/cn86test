package com.cn86trading.trading.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.model
 * @ClassName : Reader.java
 * @createTime : 2022/10/31 17:53
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Reader implements Serializable {
    private static final long serialVersionUID = -5783608282150408515L;
    private String name;
    private Integer age;
}
