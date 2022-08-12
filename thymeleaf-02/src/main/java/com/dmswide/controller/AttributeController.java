package com.dmswide.controller;

import com.dmswide.entity.PrimarySchoolStudent;
import com.sun.javafx.collections.ImmutableObservableList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
public class AttributeController {
    @GetMapping("/attr")
    public String doAttr(Model model){
        model.addAttribute("action1","/user/login");
        model.addAttribute("text1","请登录");
        return "attr";
    }
    @GetMapping("/boolattr")
    public String doBoolAttr(Model model){
        model.addAttribute("selected",true);
        model.addAttribute("unselected",false);
        return "boolattr";
    }

    @RequestMapping("textattr")
    public String doTextAttr(Model model){
        model.addAttribute("lang","学习<strong>java语言</strong>做开发");
        model.addAttribute("content","做全栈开发");
        return "textattr";
    }

    @GetMapping("/each")
    public String doForEach(Model model){
        List<PrimarySchoolStudent> list = new ArrayList<>();
        list.add(new PrimarySchoolStudent(1,"zhangsan1",20));
        list.add(new PrimarySchoolStudent(2,"zhangsan2",21));
        list.add(new PrimarySchoolStudent(3,"zhangsan3",22));
        list.add(new PrimarySchoolStudent(4,"zhangsan4",23));
        model.addAttribute("students",list);

        Map<String,String> map = new HashMap<>();
        map.put("id","1");
        map.put("name","lisi");
        map.put("age","26");
        map.put("email","lisi@163.com");
        model.addAttribute("map",map);

        List<Map<String,PrimarySchoolStudent>> mapList = new ArrayList<>();
        Map<String,PrimarySchoolStudent> map1 = new HashMap<>();
        map1.put("stu1",new PrimarySchoolStudent(1,"xiaoming",5));
        map1.put("stu2",new PrimarySchoolStudent(2,"xiaohong",6));
        map1.put("stu3",new PrimarySchoolStudent(3,"xiaopeng",6));
        mapList.add(map1);
        map1 = new HashMap<>();
        map1.put("stu1",new PrimarySchoolStudent(1,"xiaohu",5));
        map1.put("stu2",new PrimarySchoolStudent(2,"xiaolong",6));
        map1.put("stu3",new PrimarySchoolStudent(3,"xiaohuang",6));
        mapList.add(map1);

        model.addAttribute("mapList",mapList);

        String[] names = new String[]{"tom","jerry","john"};
        model.addAttribute("names",names);

        Map<String,String> cities = new HashMap<>();
        cities.put("001","beijing");
        cities.put("002","shanghai");
        cities.put("003","guangzhou");
        cities.put("004","shenzhen");
        model.addAttribute("cities",cities);
        model.addAttribute("selected","beijing");

        return "each";
    }

    @RequestMapping("/if")
    public String doIf(Model model){
        model.addAttribute("old",true);
        model.addAttribute("login","login");
        model.addAttribute("num1",10);
        model.addAttribute("num2",-1);
        model.addAttribute("obj",new PrimarySchoolStudent());
        model.addAttribute("str","");
        return "if";
    }

    @RequestMapping("/unless")
    public String doUnless(Model model){
        model.addAttribute("young",false);
        model.addAttribute("login","off");
        model.addAttribute("str1","no");
        model.addAttribute("str2","false");
        model.addAttribute("num1",0);
        model.addAttribute("obj",null);
        return "unless";
    }

    @GetMapping("/template")
    public String doTemplates(Model model){
        model.addAttribute("menuTemplate","menu");
        return "fragment/main";
    }
    @GetMapping("/remove")
    public String doRemove(Model model){
        return "fragment/remove";
    }
    //inline 内联
    @GetMapping("/inline")
    public String doInline(Model model){
        List<PrimarySchoolStudent> list1 = new ArrayList<>();
        list1.add(new PrimarySchoolStudent(1001,"张三",20));
        list1.add(new PrimarySchoolStudent(1002,"李四",21));
        list1.add(new PrimarySchoolStudent(1003,"王五",22));
        list1.add(new PrimarySchoolStudent(1004,"赵六",23));
        model.addAttribute("list1",list1);
        model.addAttribute("hero","heroes");
        model.addAttribute("slogon","I love <strong>China</strong>");
        return "inline";
    }

    @GetMapping("/variable")
    public String doVariable(Model model){
        model.addAttribute("age",20);
        return "variable";
    }
    @GetMapping("/tools")
    public String doTools(Model model){
        model.addAttribute("myname","tom");
        model.addAttribute("mydate",new Date());
        model.addAttribute("price",20.13);
        return "tools";
    }

    @GetMapping(value="/builtinobj")
    public String doBuiltinobj(Model model, HttpSession session){
        model.addAttribute("attr1","request作用域中的数据attr val");
        session.setAttribute("sessionAttr","session中的数据");
        ServletContext context = session.getServletContext();
        context.setAttribute("contextAttr","ServletContext中的数据");
        return "builtinobj";
    }
}
