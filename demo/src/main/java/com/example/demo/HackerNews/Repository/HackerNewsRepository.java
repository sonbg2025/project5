package com.example.demo.HackerNews.Repository;

import com.example.demo.HackerNews.DTO.HackerNewsItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HackerNewsRepository extends MongoRepository<HackerNewsItem, Long> {
}