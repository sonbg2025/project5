package com.example.demo.StackOverflow.Repository;

import com.example.demo.StackOverflow.DTO.StackOverflowQuestion;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StackOverflowQuestionRepository extends MongoRepository<StackOverflowQuestion, Long> {
}
