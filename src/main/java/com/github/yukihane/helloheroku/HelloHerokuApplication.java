package com.github.yukihane.helloheroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class HelloHerokuApplication {

    public static void main(final String[] args) {
        SpringApplication.run(HelloHerokuApplication.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

}
