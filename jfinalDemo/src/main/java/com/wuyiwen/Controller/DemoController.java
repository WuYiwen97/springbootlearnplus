package com.wuyiwen.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/jfinal")
public class DemoController {

    @RequestMapping(value = "/data/query", method = RequestMethod.POST)
    public String testBlog() {
        return "1";
    }


}
