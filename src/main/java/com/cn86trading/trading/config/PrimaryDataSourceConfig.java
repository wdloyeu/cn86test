package com.cn86trading.trading.config;

import com.atomikos.jdbc.AtomikosDataSourceBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.config
 * @ClassName : PrimaryDataSourceConfig.java
 * @createTime : 2022/11/2 8:19
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@Configuration
//数据源primary-testdb库接口存放目录
@MapperScan(basePackages = "com.cn86trading.**.test",
        sqlSessionTemplateRef = "primarySqlSessionTemplate")
public class PrimaryDataSourceConfig {

    @Bean(name = "primaryDataSource")
    @ConfigurationProperties(prefix = "primarydb")   //数据源primary配置
    @Primary
    public DataSource primaryDataSource() {
        return new AtomikosDataSourceBean();
    }

    @Bean(name = "primarySqlSessionFactory")
    @Primary
    public SqlSessionFactory primarySqlSessionFactory(
            @Qualifier("primaryDataSource") DataSource dataSource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        //设置XML文件存放位置
        bean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath:generator/test/*.xml")); //注意这里test目录
        return bean.getObject();
    }

    @Bean(name = "primarySqlSessionTemplate")
    @Primary
    public SqlSessionTemplate primarySqlSessionTemplate(
            @Qualifier("primarySqlSessionFactory") SqlSessionFactory sqlSessionFactory)
            throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
