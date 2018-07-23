package com.test.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("test")
public class TestController {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(ModelMap model) {
        return "test";
    }
}
