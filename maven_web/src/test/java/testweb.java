import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testweb {
    @Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-web.xml");
        ItemsService bean = ac.getBean(ItemsService.class);
        Items byId = bean.findById(1);
        System.out.println(byId);
    }
}
