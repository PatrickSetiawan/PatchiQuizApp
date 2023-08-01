package com.patchi.quizapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patchi.quizapp.dao.QuestionDao;
import com.patchi.quizapp.Question;

/* this is the Service Layer, which is responsible for the processing and business logic of requests from the Controller layer
 */

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }
}
