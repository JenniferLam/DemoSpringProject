package com.example.demo.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
   @RequestMapping("/")
    public String getIndexPage() {
        return "index";
    }

    @RequestMapping("/register")
    public String getRegisterPage() {
       return "registerAccount";
    }
}
