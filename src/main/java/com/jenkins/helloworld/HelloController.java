package com.jenkins.helloworld;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HelloController {
@RequestMapping("/")
@ResponseBody
public String sayHello() {
return "Hello Developer!!!";
}
@RequestMapping("/welcome")
@ResponseBody
public String sayWelcome() {
return "Welcome Developer!!! Jenkins is running on tomcate";
}
}