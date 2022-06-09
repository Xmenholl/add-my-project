package com.sun.spring.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
    
	@RequestMapping("/handleclientRequest")
    public void helloController() {
        System.out.println("from helloController");
    }
}