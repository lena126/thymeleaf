package com.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by linayang on 2019/9/3
 */
@Controller
public class pageController {

    /**
     * 首页
     * @return
     */
    @RequestMapping("/")
    public String page(){
        return "system/index";
    }


    /**
     * 跳转
     * @return
     */
    @RequestMapping("/redirect")
    public String page2(){
        return "redirect/redirect";
    }


    /**
     *视图
     * @param model
     * @return
     */
    @RequestMapping("/mainpage")
    public String page3(Model model){
        model.addAttribute("name","thymeleaf");
        return "hello";
    }
}
