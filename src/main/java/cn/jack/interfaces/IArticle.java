package cn.jack.interfaces;

import cn.jack.domain.Article;

import java.util.List;

/**
 * Created by Administrator on 2016/7/25.
 */
public interface IArticle {
    public List<Article> getArticlesByUserId(int id);
}
