package com.exam.examserver.Controller;

import com.exam.examserver.Entity.Exam.Questions;
import com.exam.examserver.Entity.Exam.Quiz;
import com.exam.examserver.Services.QuestionsService;
import com.exam.examserver.Services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/questions")
@CrossOrigin("*")
public class QuestionsController {

    @Autowired
    private QuestionsService questionsService;

    @Autowired
    private QuizService quizService;

    @PostMapping("/")
    public ResponseEntity<Questions> addQuestions(@RequestBody Questions questions) {
        return ResponseEntity.ok(this.questionsService.addQuestions(questions));
    }

    @PutMapping("/")
    public ResponseEntity<Questions> updateQuestions(@RequestBody Questions questions) {
        return ResponseEntity.ok(this.questionsService.updateQuestions(questions));
    }

    @GetMapping("/quiz/{quizId}")
    public ResponseEntity<?> getQuestionsofQuiz(@PathVariable("quizId") Long id) {
        Quiz quiz =  this.quizService.getQuiz(id);
        List<Questions> questionsSet= new ArrayList<>(quiz.getQuestions());
        Collections.shuffle(questionsSet);
        if (questionsSet.size()>quiz.getNumberOfQuestions()) {
            questionsSet = questionsSet.subList(0, quiz.getNumberOfQuestions()+1);
        }
        return ResponseEntity.ok(questionsSet);

    }
    @GetMapping("/quiz/all/{quizId}")
    public ResponseEntity<?> getAllQuestionsofQuiz(@PathVariable("quizId") Long id) {
        Quiz quiz=new Quiz();
        quiz.setQuizId(id);
        Set<Questions> questionsSet = this.questionsService.getQuestionsOfQuiz(quiz);
        return ResponseEntity.ok(questionsSet);

    }
    @GetMapping("/{questionId}")
    public ResponseEntity<Questions> getQuestions(@PathVariable("questionId") Long id) {
        return ResponseEntity.ok(this.questionsService.getQuestions(id));
    }

    @DeleteMapping("/{questionId}")
    public void deleteQuestions(@PathVariable("questionId") Long id) {
        this.questionsService.deleteQuestions(id);
    }

}
