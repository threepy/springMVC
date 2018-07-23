package com.test.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hi")
public class HelloController {
    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String say(Model model) {
        model.addAttribute("name", "wormday");
        model.addAttribute("url", "http://www.baidu.com");
        return "say";
    }
}
