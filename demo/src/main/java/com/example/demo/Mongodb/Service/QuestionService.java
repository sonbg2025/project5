package com.example.demo.Mongodb.Service;

import com.example.demo.Mongodb.Model.Question;
import com.example.demo.Mongodb.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public Question saveQuestion(Question question) {
        return questionRepository.save(question);
    }
}