package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
    @RequestMapping("/Blog")
    public String bootCamp(){
        return "Home";
    }
    @RequestMapping("/AboutTheBootCamp")
    public String bootcamp(){
        return "AboutTheBootCamp";
    }
    @RequestMapping("/Blogger")
    public String blogger() {
        return "AboutTheBlogger";
    }
}
