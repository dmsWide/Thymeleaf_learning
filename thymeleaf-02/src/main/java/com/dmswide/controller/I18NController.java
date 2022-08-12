package com.dmswide.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class I18NController {
    @RequestMapping("/i18n")
    public String i18n(){
        return "login";
    }
}
