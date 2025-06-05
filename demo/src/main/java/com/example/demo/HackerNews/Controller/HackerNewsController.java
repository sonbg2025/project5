package com.example.demo.HackerNews.Controller;

import com.example.demo.HackerNews.DTO.HackerNewsItem;
import com.example.demo.HackerNews.Service.HackerNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hackernews")
public class HackerNewsController {

    @Autowired
    private HackerNewsService hackerNewsService;

    @GetMapping("/top")
    public List<HackerNewsItem> getTopStories(@RequestParam(defaultValue = "10") int count) {
        return hackerNewsService.getTopStories(count);
    }

    @GetMapping("/save")
    public void saveTopStoriesToMongo(@RequestParam(defaultValue = "10") int count) {
        hackerNewsService.saveTopStoriesToMongo(count);
    }
}