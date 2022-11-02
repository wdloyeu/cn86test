package com.cn86trading.trading.controller;

import com.cn86trading.trading.config.ModelView;
import com.cn86trading.trading.exception.CustomException;
import com.cn86trading.trading.exception.CustomExceptionType;
import com.cn86trading.trading.model.AjaxResponse;
import com.cn86trading.trading.model.ArticleVo;
import com.cn86trading.trading.model.Family;
import com.cn86trading.trading.service.ArticleService;
import com.cn86trading.trading.service.TestBeanService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.controller
 * @ClassName : ArticleController.java
 * @createTime : 2022/10/31 17:56
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@Slf4j
@RestController
@RequestMapping("/rest")
public class ArticleController {

    @Resource
    private ArticleService articleService;

    @GetMapping("/articles/{id}")
    public AjaxResponse getArticle(@PathVariable("id") Long id) {
//        Article article = Article.builder()
//                .id(id)
//                .author("wang")
//                .content("spring boo")
//                .createTime(new Date())
//                .title("hello")
//                .build();
//
//        try {
//            log.info("article:" + new ObjectMapper().writeValueAsString(article));
//
//            log.info("object: " + new ObjectMapper().readValue("{\"id\":1,\"title\":\"hello\",\"content\":\"spring boo\",\"createTime\":1667216734418,\"aothor\":\"wang\",\"reader\":[{\"name\":\"zimug\",\"age\":18},{\"name\":\"kobe\",\"age\":37}]}", Article.class));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        return AjaxResponse.success(articleService.getArticle(id));
    }

    @PostMapping("/articles")
    public AjaxResponse saveArticle(@Valid @RequestBody ArticleVo article) {
        articleService.saveArticle(article);
        log.info("saveArticle: " + article);
        return AjaxResponse.success();
    }

    @PutMapping("/articles")
    public AjaxResponse updateArticle(@RequestBody ArticleVo article) {
        if (article.getId() == null) {

        }
        articleService.updateArticle(article);
        log.info("updateArticle: " + article);
        return AjaxResponse.success();
    }

    @DeleteMapping("/articles/{id}")
    public AjaxResponse deleteArticle(@PathVariable("id") Long id) {
        log.info("deleteArticle :" + id);
        articleService.deleteArticle(id);
        return AjaxResponse.success();
    }

    @GetMapping("/articles")
    public AjaxResponse getAll() {
        return AjaxResponse.success(articleService.getArticleList());
    }



    @ModelView
    @GetMapping("/freemarker")
    public String index(Model model) {
        if (1 == 1) {
            throw new CustomException(CustomExceptionType.SYSTEM_ERROR);
        }
        List<ArticleVo> articles = articleService.getArticleList();
        model.addAttribute("articles", articles);
        return "fremarkertemp";
    }
}
