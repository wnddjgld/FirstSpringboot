package kr.ac.kopo.wnddjgld.firstspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/test")
public class Example03Controller {
    @GetMapping(value = "/exam04")
    public String requestMethod() {
        return "requestTest";
    }
}
