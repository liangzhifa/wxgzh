package com.zhifa.wxgzh.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class PageController {
    @RequestMapping("/wx/me")
    public String toMe(){
        return  "redirect:/index.html";
    }
    @RequestMapping("/")
    public String toIndex(){
        return  "redirect:/index.html";
    }
}
