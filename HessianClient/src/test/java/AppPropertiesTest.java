import com.hessian.demo.client.AppProperties;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ZhangQingrong on 2017/1/18.
 */
public class AppPropertiesTest {

    private AppProperties appProperties;

    @Before
    public void init(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/springHessian-client.xml");
        appProperties = applicationContext.getBean(AppProperties.class);
    }

    @Test
    public void test1(){
        System.out.println(appProperties.getValue1());
        System.out.println(AppProperties.value2);
        System.out.println(appProperties.getValue3());
        System.out.println(AppProperties.value4);
    }

    @Test
    public void test2(){
        AppProperties appProperties = new AppProperties();
    }
}
