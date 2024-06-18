package com.exam.examserver.Services;

import com.exam.examserver.Entity.Exam.Category;
import com.exam.examserver.Entity.Exam.Quiz;

import java.util.List;
import java.util.Set;

public interface QuizService {

    public Quiz addQuiz(Quiz quiz);
    public Quiz updateQuiz(Quiz quiz);
    public Set<Quiz> getAllQuiz();
    public Quiz getQuiz(Long id);
    public void deleteQuiz(Long id);


    List<Quiz> getQuizesOfCategory(Category category);
}
