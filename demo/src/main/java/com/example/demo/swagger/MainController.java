package com.example.demo.swagger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String homePage() {
        return "index.html";
    }
}
