package com.cn86trading.trading.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 小黑
 * @version : 1.0
 * @Project : CN86
 * @Package : com.cn86trading.trading.model
 * @ClassName : Airticle.java
 * @createTime : 2022/10/31 17:52
 * @Email : 747731461@qq.com
 * @公众号 : 小黑侠
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
@Data
@Slf4j
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleVo implements Serializable {
    private static final long serialVersionUID = -6436306198021099501L;
    private Long  id;
    @JsonProperty("aothor")
    private String author;
    private String title;
    @NotEmpty(message = "文章内容不能为空！")
    private String content;
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Reader> reader;
}
