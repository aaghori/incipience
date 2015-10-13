package com.incipience.web.ui.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Vivek Tripathi on 04/10/15.
 */

@Controller
public class BaseController {

    private static final Logger log = LoggerFactory.getLogger(BaseController.class);

    @RequestMapping(value="/web/{extName}/home", method={RequestMethod.GET, RequestMethod.POST})
    public String prepareHomePage(@PathVariable("extName")String extensionName){
        log.info("Request received in home controller.");
        String retVal=null;
        retVal = "Home";
        log.debug("Extension Name = " + extensionName);
        return retVal;
    }
}
