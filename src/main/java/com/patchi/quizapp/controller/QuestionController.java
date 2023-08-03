package com.patchi.quizapp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patchi.quizapp.Question;
import com.patchi.quizapp.service.QuestionService;

/* this is the Controller Layer which simply accepts requests and passes it to the Service Layer, which will then do the
 * processing for said request. The Controller Layer does NOT do any logic/processing
 */

// making this as a RestController makes it accept requests
// requests that are coming from the path "question" will be handled by QuestinController
@RestController
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

    // @PathVariable allows the mapping of {category} to the argument name String category. If the two names are different
    // however, you must specify the target String inside the {}. E.g ...(@PathVariable("cat") String category) if {cat}
    @GetMapping("category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category) {
        return questionService.getQuestionsByCategory(category);
    }
}
