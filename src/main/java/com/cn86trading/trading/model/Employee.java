package com.cn86trading.trading.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.model
 * @ClassName : Employee.java
 * @createTime : 2022/11/1 10:11
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@Data
@Configuration
@Component
@PropertySource(value = "classpath:employee.properties",encoding = "utf-8")
@JsonIgnoreProperties(ignoreUnknown = false)
public class Employee {

    @Value("#{'${employee.names}'.split(',')[0]}")
    private List<String> employeeNames;

    @Value("#{${employee.age}}")
    private Map<String, Integer> employeeAge;

    @Value("#{${employee.age}.two}")
    private String employeeAgeTwo;

    @Value("#{${employee.age}['five'] ?: 33}")
    private String ageWithDefaultValue;

    @Value("#{systemProperties['java.home']}")
    private String javaHome;

    @Value("#{systemProperties['user.dir']}")
    private String usrDir;
}
