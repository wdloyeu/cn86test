package com.cn86trading.trading.model;

import com.cn86trading.trading.config.MixPropertySourceFactory;
import lombok.Data;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.model
 * @ClassName : Family.java
 * @createTime : 2022/10/31 21:19
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@Data
@Component
@Validated
@ConfigurationProperties(prefix = "family")
@PropertySource(value = "classpath:family.yml", factory = MixPropertySourceFactory.class)
public class Family {
//    @Value("${family.family-name}")
    private String familyName;
    private Father father;
    private Mother mother;
    private Child child;
}
