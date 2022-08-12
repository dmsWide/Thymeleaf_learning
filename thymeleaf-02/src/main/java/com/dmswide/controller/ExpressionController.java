package com.dmswide.controller;

import com.dmswide.entity.School;
import com.dmswide.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExpressionController {
    @RequestMapping("/expression-var")
    public String expressionVariable(Model model){
        //添加基本类型的数据
        model.addAttribute("myname","孙悟空");
        model.addAttribute("myage",20);

        Student student = new Student();
        student.setId(1);
        student.setName("李向");
        student.setAge(25);
        student.setEmail("lixiang@163.com");
        student.gender = "male";
        School school = new School();
        school.setSchoolName("yucai School");
        school.setSchoolAddress("ShiJiaZhuang");
        student.setSchool(school);
        model.addAttribute("student",student);

        return "expression";
    }
}
