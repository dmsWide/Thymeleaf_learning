package com.dmswide.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class StandardExpressionController {
    //文本
    @RequestMapping("/text")
    public String doText(Model model){
        model.addAttribute("lang","java and go");
        model.addAttribute("name1","zhangsan");
        model.addAttribute("name2","lisi");
        return "text";
    }
    //数字

    @GetMapping("/num")
    public String doNum(Model model){
        model.addAttribute("num1",20);
        model.addAttribute("num2",35);
        return "num";
    }

    @GetMapping("/bool")
    public String doBool(Model model){
        model.addAttribute("age",20);
        model.addAttribute("married",true);
        return "bool";
    }

    @GetMapping("/null")
    public String doNull(Model model){
        model.addAttribute("name",null);
        model.addAttribute("myname","");
        return "null";
    }

    @GetMapping("/compare")
    public String doCompare(Model model){
        model.addAttribute("num1",100);
        model.addAttribute("num2",200);
        model.addAttribute("isLogin",true);
        return "compare";
    }

    @GetMapping("/ternary")
    public String doTernary(Model model){
        model.addAttribute("age",25);
        model.addAttribute("isLogin",true);
        return "ternary";
    }
}
