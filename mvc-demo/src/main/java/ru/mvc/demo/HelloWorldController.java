package ru.mvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Controller
public class HelloWorldController {
    @RequestMapping("/")
    public String toMainMenu() {
        return "main-menu";
    }

    @RequestMapping(value = "/showForm", method = RequestMethod.GET)
    public String showForm() {
        return "helloworld-form";
    }
    @RequestMapping(value = "/processForm", method = RequestMethod.GET)
    public String processForm() {
        return "helloworld";
    }
}
