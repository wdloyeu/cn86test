package com.cn86trading.trading.service;

import com.cn86trading.trading.model.Article;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.service
 * @ClassName : ArticleService .java
 * @createTime : 2022/11/1 15:09
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
public interface ArticleService {

    void saveArticle(Article article);

    void updateArticle(Article article);

    void deleteArticle(Long id);

    Article getArticle(Long id);

    List<Article> getArticleList();
}
