package com.dmswide.controller;


import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(/**Model model*/HttpServletRequest request){
        //model.addAttribute("name","姜子牙");
        request.setAttribute("name","杨戬");
        return "hello";
    }
}
