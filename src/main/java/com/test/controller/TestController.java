package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luckylala on 2017/6/1.
 */
@RestController
@RequestMapping(value = "/")
public class TestController {

    @RequestMapping("first")
    public String login(){
        return "hahahaliyhua";
    }

}
