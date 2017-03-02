package com.vendavo.cloud.restapitest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Root {
    @RequestMapping(method = RequestMethod.GET, value = "/", produces = "application/json; charset=UTF-8")
    public String test() {
        return "OK";
    }
}
