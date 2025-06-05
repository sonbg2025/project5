package com.example.demo.Mongodb.Repository;

import com.example.demo.Mongodb.Model.Question;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuestionRepository extends MongoRepository<Question, String> {
}