package com.cgi.cns.refapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController
{
    @RequestMapping("/")
    public String AccountName(){
        return "Test Account Name";
    }
}
