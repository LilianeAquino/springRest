package com.vogella.spring.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootUriController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
}