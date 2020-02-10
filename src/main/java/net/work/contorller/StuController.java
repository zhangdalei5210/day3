package net.work.contorller;

import net.work.pojo.Stu;
import net.work.service.StuServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/students")
public class StuController {

    @Autowired
    StuServiceI stuServiceI;

    @RequestMapping("queryAllStu")
    public String queryAllStu(Map map,Stu stu){
        List<Stu> list = stuServiceI.getAllStu(stu);
        map.put("list",list);
        System.out.println(list);
        return "list";
    }
}
