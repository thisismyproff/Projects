package com.exam.examserver.Services.Implementations;

import com.exam.examserver.Entity.Exam.Questions;
import com.exam.examserver.Entity.Exam.Quiz;
import com.exam.examserver.Repo.QuestionsRepository;
import com.exam.examserver.Services.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class QuestionsServiceImplementation implements QuestionsService {
    @Autowired
    QuestionsRepository questionsRepository;

    @Override
    public Questions addQuestions(Questions questions) {
        return this.questionsRepository.save(questions);
    }

    @Override
    public Questions updateQuestions(Questions questions) {
        return this.questionsRepository.save(questions);
    }

    @Override
    public Set<Questions> getAllQuestions() {
        return new LinkedHashSet<>(this.questionsRepository.findAll());
    }

    @Override
    public Questions getQuestions(Long id) {
        return this.questionsRepository.getOne(id);
    }

    @Override
    public void deleteQuestions(Long id) {
        this.questionsRepository.deleteById(id);
    }

    @Override
    public Set<Questions> getQuestionsOfQuiz(Quiz quiz) {
        return this.questionsRepository.findByQuiz(quiz);
    }
}
