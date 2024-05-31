package com.exam.examserver.Services;

import com.exam.examserver.Entity.Exam.Questions;
import com.exam.examserver.Entity.Exam.Quiz;

import java.util.Set;

public interface QuestionsService {
    public Questions addQuestions(Questions questions);
    public Questions updateQuestions(Questions questions);
    public Set<Questions> getAllQuestions();
    public Questions getQuestions(Long id);
    public void deleteQuestions (Long id);
    public Set<Questions> getQuestionsOfQuiz (Quiz quiz);

}
