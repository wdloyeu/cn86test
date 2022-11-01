package com.cn86trading.trading.service.impl;

import com.cn86trading.trading.dao.ArticleDao;
import com.cn86trading.trading.dao.ArticleMapper;
import com.cn86trading.trading.model.Article;
import com.cn86trading.trading.service.ArticleService;
import com.cn86trading.trading.utils.DozerUtils;
import com.github.dozermapper.core.Mapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.service.impl
 * @ClassName : ArticleServiceImpl.java
 * @createTime : 2022/11/1 15:11
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleMapper articleMapper;

    @Resource
    private Mapper dozerMapper;

    @Resource
    private ArticleDao articleDao;

//    @Resource
//    private JdbcTemplate secondaryJdbcTemplate;

    @Override
    @Transactional
    public void saveArticle(Article article) {
//        articleDao.saveArticle(article, null);
//        articleDao.saveArticle(article, secondaryJdbcTemplate);
//        int a=1/0;
        com.cn86trading.trading.entity.Article article1 = dozerMapper.map(articleDao, com.cn86trading.trading.entity.Article.class);
        articleMapper.insertSelective(article1);

    }

    @Override
    public void updateArticle(Article article) {
//        articleDao.updateArticle(article, secondaryJdbcTemplate);
        com.cn86trading.trading.entity.Article article1 = dozerMapper.map(articleDao, com.cn86trading.trading.entity.Article.class);
        articleMapper.updateByPrimaryKeySelective(article1);
    }

    @Override
    public void deleteArticle(Long id) {
//        articleDao.deleteArticle(id, secondaryJdbcTemplate);
        articleMapper.deleteByPrimaryKey(id.intValue());
    }

    @Override
    public Article getArticle(Long id) {
//        return articleDao.getArticle(id, secondaryJdbcTemplate);
        return dozerMapper.map(articleMapper.selectByPrimaryKey(id.intValue()), Article.class);
    }

    @Override
    public List<Article> getArticleList() {
        List<com.cn86trading.trading.entity.Article> articles = articleMapper.selectByExample(null);
        return DozerUtils.mapList(articles, Article.class);
//        return articleDao.getArticleList(secondaryJdbcTemplate);
    }

}
