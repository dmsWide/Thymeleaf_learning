package com.dmswide.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LinkController {

    @RequestMapping("/link/test")
    public String doLink(Model model){
        model.addAttribute("queryStudent","/query/student");
        model.addAttribute("myname","zhangsan");
        return "link";
    }
}
