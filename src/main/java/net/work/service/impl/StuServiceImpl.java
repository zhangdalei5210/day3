package net.work.service.impl;

import net.work.mapper.StuMapper;
import net.work.pojo.Stu;
import net.work.service.StuServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuServiceImpl implements StuServiceI {
    @Autowired
    StuMapper stuMapper;
    @Override
    public List<Stu> getAllStu(Stu stu) {
        List<Stu> list =stuMapper.getAllStu(stu);
        return list;
    }
}
