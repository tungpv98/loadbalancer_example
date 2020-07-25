package net.javaguides.springboot.tutorial.controller;

import net.javaguides.springboot.tutorial.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class IndexController {

    @GetMapping
    public String showSignUpForm(Student student) {
        return "index";
    }
}
