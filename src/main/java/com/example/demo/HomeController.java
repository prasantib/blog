package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
    @RequestMapping("/blog")
    public String blog(){
        return "Home";
    }

    @RequestMapping("/bootCamp")
    public String bootcamp(){
        return "AboutTheBootCamp";
    }

    @RequestMapping("/blogger")
    public String blogger() {
        return "AboutTheBlogger";
    }

    @RequestMapping("/github")
    public String github() {
        return "github";
    }

    @RequestMapping("/github2")
    public String github2() {
        return "github2";
    }

    @RequestMapping("/oop")
    public String oop() {
        return "oop";
    }

    @RequestMapping("/oop2")
    public String oop2() {
        return "oop2";
    }

    @RequestMapping("/corejava")
    public String coreJava() {
        return "corejava";
    }

    @RequestMapping("/corejava2")
    public String coreJava2() {
        return "corejava2";
    }
}