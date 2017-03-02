package com.vendavo.cloud.restapitest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NullController {

    @RequestMapping(method = RequestMethod.GET, value = "/null")
    public NullTest nullTest() {
        return new NullTest();
    }
}
