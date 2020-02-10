import net.work.pojo.Stu;
import net.work.service.StuServiceI;
import net.work.service.impl.StuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {

//    @Autowired
//    StuServiceI studentService;
    @org.junit.Test
        public void queryAll() {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
        StuServiceI stuservice=ctx.getBean(StuServiceI.class);
        List<Stu> list = stuservice.getAllStu(new Stu());

            System.out.println(list.get(0));


    }
}
