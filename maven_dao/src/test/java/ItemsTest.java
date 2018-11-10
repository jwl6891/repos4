import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {
    @Test
    public void daoTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-dao.xml");
        ItemsDao dao = ac.getBean(ItemsDao.class);
        Items all = dao.findById(1);
        System.out.println(all.getName());
    }
}
