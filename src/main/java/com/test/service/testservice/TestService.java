package com.test.service.testservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestService {


    @RequestMapping(method = RequestMethod.GET, path = "/test-service")
    public ResponseBean getTestService()
    {
        return new ResponseBean("Test Service Called..");
    }

}
