package cn.edu.hbuas.admin.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello, world!";
    }
}
