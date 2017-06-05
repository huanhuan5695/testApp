package com.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luckylala on 2017/6/2.
 */
@RestController
@RequestMapping(value = "/")
public class BootController {

    private static Logger LOGGER = LoggerFactory.getLogger(BootController.class);

    @RequestMapping(value = "/")
    public String startServer(){
        LOGGER.info("Start server successfull!");
        return "Start server successfull!";
    }
}

