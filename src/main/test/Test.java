import cn.jack.domain.Article;
import cn.jack.interfaces.IArticle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/7/25 0025.
 */
public class Test {
    private static ApplicationContext context;
    static{
        context = new ClassPathXmlApplicationContext("/config/applicationContext.xml");
    }
    public static void main(String[] args){

        try{
            IArticle iArticle = (IArticle) context.getBean("articleMapper");

            for(Article article : iArticle.getArticlesByUserId(1)){
                System.out.println(article.getId());
                System.out.println(article.getTitle());
                System.out.println(article.getContent());
                System.out.println(article.getUser().getId());
                System.out.println(article.getUser().getUsername());
                System.out.println(article.getUser().getAge());
                System.out.println(article.getUser().getAddress());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
