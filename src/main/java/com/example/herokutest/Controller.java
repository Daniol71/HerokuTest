package com.example.herokutest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class Controller {
    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index.html");
    }
}
