package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
    @RequestMapping("/Blog")
    public String blog(){
        return "Home";
    }

    @RequestMapping("/BootCamp")
    public String bootcamp(){
        return "AboutTheBootCamp";
    }

    @RequestMapping("/Blogger")
    public String blogger() {
        return "AboutTheBlogger";
    }

    @RequestMapping("/Github")
    public String github() {
        return "github";
    }
}
