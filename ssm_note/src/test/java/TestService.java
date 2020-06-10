import com.xiaohe.service.IBooksService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {




    @Test
    public void  t(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    //   IUserService userService = (IUserService) applicationContext.getBean("userServiceImpl");
         IBooksService booksService = (IBooksService) applicationContext.getBean("booksServiceImpl");
         booksService.findAll();
        System.out.println(booksService.findAll());
    }

    @Test
    public void delene(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //   IUserService userService = (IUserService) applicationContext.getBean("userServiceImpl");
        IBooksService booksService = (IBooksService) applicationContext.getBean("booksServiceImpl");
        System.out.println( booksService.deleteBook(5));
    }
}
