package com.test.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.logging.Logger;

@Controller
@RequestMapping("/index")
public class IndexController {
    private static final Logger logger = Logger.getLogger(IndexController.class.getName());

    @RequestMapping("/")
    public String say(ModelMap model) {
        model.addAttribute("title", "this is title");
        model.addAttribute("end", "the end");
        logger.info("请求index页面");
        return "index";
    }

    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:finalPage";
    }

    @RequestMapping(value = "/finalPage", method = RequestMethod.GET)
    public String finalPage() {
        return "final";
    }

    @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
    public String redirectStatic() {
        return "redirect:/pages/final.html";
    }
}
