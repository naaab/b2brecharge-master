package com.paraservices.security.config;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 3/11/17.
 */
@RestController
public class TestRest {

    @RequestMapping(path = "/validate", method = RequestMethod.GET)
    public static String authenticate() {
        return "NABRAJ";
    }

}
