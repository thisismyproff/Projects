package com.exam.examserver.Controller;



import com.exam.examserver.Entity.Exam.Quiz;
import com.exam.examserver.Services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@CrossOrigin("*")
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;


    @PostMapping("/")
    public ResponseEntity<Quiz> addQuiz(@RequestBody Quiz quiz) {
        return ResponseEntity.ok(this.quizService.addQuiz(quiz));
    }

    @PutMapping("/")
    public ResponseEntity<Quiz> updateQuiz(@RequestBody Quiz quiz) {
        return ResponseEntity.ok(this.quizService.updateQuiz(quiz));
    }

    @GetMapping("/")
    public Set<Quiz> getQuizzes() {
        return this.quizService.getAllQuiz();
    }


    @DeleteMapping("/{quizId}")
    public void deleteQuiz(@PathVariable("quizId") Long id) {
        this.quizService.deleteQuiz(id);
    }

    @GetMapping("/{quizId}")
    public Quiz getQuiz(@PathVariable("quizId") Long id) {
        return this.quizService.getQuiz(id);
    }



}
