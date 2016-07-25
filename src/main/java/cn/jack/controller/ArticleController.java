package cn.jack.controller;

import cn.jack.domain.Article;
import cn.jack.interfaces.IArticle;
import cn.jack.interfaces.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2016/7/26 0026.
 */
@Controller
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private IArticle iArticle;

    @RequestMapping("/list")
    public ModelAndView listAllArticle(HttpServletRequest request,HttpServletResponse response){
        List<Article> articleList = iArticle.getArticlesByUserId(1);
        ModelAndView model = new ModelAndView("list");
        model.addObject("articels",articleList);
        return model;
    }
}
