package com.test.helloworld;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/index")
public class IndexController {
    private static final Logger logger = LogManager.getLogger(IndexController.class);

    @RequestMapping("/")
    public String say(ModelMap model) {
        model.addAttribute("title", "this is title");
        model.addAttribute("end", "the end");
        logger.error("this is error log");
        logger.info("this is info log");
        logger.warn("this is info log");
        logger.trace("this trace log");
        logger.debug("this debug log");
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
