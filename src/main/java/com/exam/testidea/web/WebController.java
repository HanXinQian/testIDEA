package com.exam.testidea.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("web")
public class WebController {
    //
    @RequestMapping("send")
    public String sendString(){
        return "git与idea测试。";
    }
}
