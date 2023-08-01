package com.patchi.quizapp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// making this as a RestController makes it accept requests
@RestController

// requests that are coming from the path "question" will be handled by QuestinController
@RequestMapping("question")
public class QuestionController {

    // if there are requests coming from "question/allQuestions", run the method below
    @GetMapping("allQuestions")
    public String getAllQuestions() {
        return "Hi, these are your questions";
    }
}
