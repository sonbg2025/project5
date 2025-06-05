package com.example.demo.StackOverflow.Controller;

import com.example.demo.StackOverflow.Service.StackOverflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stackoverflow")
public class StackOverflowController {

    @Autowired
    private StackOverflowService stackOverflowService;

    @GetMapping("/questions")
    public Object getQuestions(@RequestParam String tag) {
        return stackOverflowService.fetchLatestQuestions(tag);
    }

    @PostMapping("/fetch")
    public String fetchQuestions() {
        stackOverflowService.saveQuestions();
        return "Saved Stack Overflow questions to MongoDB.";
    }
}
