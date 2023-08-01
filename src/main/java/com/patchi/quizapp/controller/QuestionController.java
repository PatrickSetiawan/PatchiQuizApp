package com.patchi.quizapp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patchi.quizapp.Question;
import com.patchi.quizapp.service.QuestionService;

/* this is the Controller Layer which simply accepts requests and passes it to the Service Layer, which will then do the
 * processing for said request. The Controller Layer does NOT do any logic/processing
 */

// making this as a RestController makes it accept requests
@RestController

// requests that are coming from the path "question" will be handled by QuestinController
@RequestMapping("question")
public class QuestionController {

    // autowired omits the use of getters, constructors and setter, allowing for shorter code
    @Autowired
    QuestionService questionService;

    // if there are requests coming from "question/allQuestions", run the method below
    @GetMapping("allQuestions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }
}
