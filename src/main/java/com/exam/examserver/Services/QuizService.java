package com.exam.examserver.Services;

import com.exam.examserver.Entity.Exam.Quiz;

import java.util.Set;

public interface QuizService {

    public Quiz addQuiz(Quiz quiz);
    public Quiz updateQuiz(Quiz quiz);
    public Set<Quiz> getAllQuiz();
    public Quiz getQuiz(Long id);
    public void deleteQuiz(Long id);
}
