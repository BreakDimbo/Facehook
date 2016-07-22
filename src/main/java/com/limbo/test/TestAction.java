package com.limbo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Break.D on 7/22/16.
 */
@Controller
@RequestMapping("/test")
public class TestAction {

    @RequestMapping("/test")
    public String test() {
        System.out.println("springMVC 可以使用");
        return "index";
    }
}
