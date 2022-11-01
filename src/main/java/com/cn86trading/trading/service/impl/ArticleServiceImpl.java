package com.cn86trading.trading.service.impl;

import com.cn86trading.trading.dao.ArticleDao;
import com.cn86trading.trading.model.Article;
import com.cn86trading.trading.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
    private ArticleDao articleDao;

    @Override
    public void saveArticle(Article article) {
        articleDao.saveArticle(article);
    }

    @Override
    public void updateArticle(Article article) {
        articleDao.updateArticle(article);
    }

    @Override
    public void deleteArticle(Long id) {
        articleDao.deleteArticle(id);
    }

    @Override
    public Article getArticle(Long id) {
        return articleDao.getArticle(id);
    }

    @Override
    public List<Article> getArticleList() {
        return articleDao.getArticleList();
    }
}
