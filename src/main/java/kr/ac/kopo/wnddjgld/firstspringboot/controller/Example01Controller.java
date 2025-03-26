package kr.ac.kopo.wnddjgld.firstspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Example01Controller {
    @RequestMapping(value = "/exam01", method = RequestMethod.GET)
    public String requestMethod() {
        return "viewPage01";
    }

    @RequestMapping(value = "/exam03", method = RequestMethod.GET)
    public @ResponseBody String getMessage() {
        return "@RestController getMessage 연습";
    }
}
