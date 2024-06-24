package com.exam.examserver.Controller;


import com.exam.examserver.Entity.Exam.QuizResponse;
import com.exam.examserver.Services.QuizResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/quizResponse")
@CrossOrigin("*")
public class QuizResponseController {
    @Autowired
    private QuizResponseService quizResponseService;


    @GetMapping("/")
    public List<QuizResponse> getALlQuizResponse() {
        return this.quizResponseService.getQuizResponse();
    }
}
