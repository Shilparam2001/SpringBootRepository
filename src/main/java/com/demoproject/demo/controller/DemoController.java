package com.demoproject.demo.controller;

import com.demoproject.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/string")
    public String getString(){
        return demoService.getString();
    }
}
