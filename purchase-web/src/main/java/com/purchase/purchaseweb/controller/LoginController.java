package com.purchase.purchaseweb.controller;

import com.cqnu.purchasedao.mapper.StudentMapper;
import com.cqnu.purchasedao.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class LoginController {
    @Autowired(required = false)
    private StudentMapper studentMapper;
    @RequestMapping(value = "/login")
    public String login() {
        List<Student> stuList=studentMapper.queryStuList();
        for (Student student:stuList){
            System.out.println(student);
        }
        return "views/login";
    }
}
