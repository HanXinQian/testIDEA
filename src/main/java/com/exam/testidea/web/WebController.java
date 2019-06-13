package com.exam.testidea.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("web")
public class WebController {
    //这是什么鬼
    @RequestMapping("send")
    public String sendString(){
        //返回一个什么鬼的东西噢
        return "git与idea测试。";
    }
}
