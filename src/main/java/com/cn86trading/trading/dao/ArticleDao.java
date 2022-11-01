package com.cn86trading.trading.dao;

import com.cn86trading.trading.model.Article;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.dao
 * @ClassName : ArticleDao.java
 * @createTime : 2022/11/1 15:05
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@Repository
public class ArticleDao {

    @Resource
    private JdbcTemplate primaryJdbcTemplate;

    public void saveArticle(Article article, JdbcTemplate jdbcTemplate) {
        if (jdbcTemplate == null) {
            jdbcTemplate = primaryJdbcTemplate;
        }
        jdbcTemplate.update("INSERT INTO article(author, title, content, create_time) VALUES(?, ?, ?, ?)",
            article.getAuthor(),
            article.getTitle(),
            article.getContent(),
            article.getCreateTime());
    }

    public void updateArticle(Article article, JdbcTemplate jdbcTemplate) {
        if (jdbcTemplate == null) {
            jdbcTemplate = primaryJdbcTemplate;
        }
        jdbcTemplate.update("update article set author=?, title=?, content=?, create_time=? where id=?",
            article.getAuthor(),
            article.getTitle(),
            article.getContent(),
            article.getCreateTime(),
            article.getId());
    }

    public void deleteArticle(Long id, JdbcTemplate jdbcTemplate) {
        if (jdbcTemplate == null) {
            jdbcTemplate = primaryJdbcTemplate;
        }
        jdbcTemplate.update("delete from article where id=?",
                id);
    }

    public Article getArticle(Long id, JdbcTemplate jdbcTemplate) {
        if (jdbcTemplate == null) {
            jdbcTemplate = primaryJdbcTemplate;
        }
//        return (Article) jdbcTemplate.queryForObject("SELECT * FROM article WHERE id=?",
//                new Object[]{id},new BeanPropertyRowMapper<>(Article.class));
        Article article = jdbcTemplate.queryForObject("SELECT * FROM article WHERE id=?", new BeanPropertyRowMapper<>(Article.class), id);
        return article;
    }

    public List<Article> getArticleList(JdbcTemplate jdbcTemplate) {
        if (jdbcTemplate == null) {
            jdbcTemplate = primaryJdbcTemplate;
        }
        return jdbcTemplate.query("select * from article", new BeanPropertyRowMapper<>(Article.class));
    }
}
