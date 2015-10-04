package com.incipience.sporol.base.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Vivek Tripathi on 04/10/15.
 */

@Controller
public class BaseController {

    private static final Logger log = LoggerFactory.getLogger(BaseController.class);

    @RequestMapping(value="/sporol/home", method={RequestMethod.GET, RequestMethod.POST})
    public String prepareHomePage(){
        log.info("Request receive in home controller.");
        String retVal=null;
        retVal = "Home";

        return retVal;
    }
}
