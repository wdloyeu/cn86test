package com.cn86trading.trading;

import com.cn86trading.trading.dao.ArticleDao;
import com.cn86trading.trading.model.Article;
import com.cn86trading.trading.model.ArticleVo;
import com.cn86trading.trading.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading
 * @ClassName : SpringJdbcTest.java
 * @createTime : 2022/11/1 17:08
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@Slf4j
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class SpringJdbcTest {

    @Resource
    private ArticleDao articleDao;

    @Resource
    private JdbcTemplate primaryJdbcTemplate;

    @Resource
    private JdbcTemplate secondaryJdbcTemplate;

    @Resource
    private ArticleService articleService;

    @Test
    public void testJdbc() {
        log.info("testJdbc" + primaryJdbcTemplate);
        articleDao.saveArticle(Article.builder()
                .author("zimug").title("primaryJdbcTemplate").content("ceshi").createTime(new Date())
                .build(), primaryJdbcTemplate);

        articleDao.saveArticle(Article.builder()
                .author("zimug").title("secondaryJdbcTemplate").content("sdsdlf").createTime(new Date())
                .build(), secondaryJdbcTemplate);

    }

    @Test
    public void testServiceJdbc() {
        articleService.saveArticle(ArticleVo.builder()
                .author("士大33夫").title("开33裆裤").content("受到了开dd始了").createTime(new Date())
                .build());
    }
}
