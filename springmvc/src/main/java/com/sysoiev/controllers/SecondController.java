package com.sysoiev.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondController {
    @RequestMapping("/second")
    public String display() {
        return "page2.jsp";
    }
}
