package com.exam.examserver.Entity.Exam;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QuizResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long quizResponseId;
    private Long userId;
    private Long quizId;
    private String quizTitle;
    private String categoryTitle;
    private int percentageObtained;

    public QuizResponse(Long userId, Long quizId, String quizTitle, String categoryTitle, int percentageObtained) {
        this.userId = userId;
        this.quizId = quizId;
        this.quizTitle = quizTitle;
        this.categoryTitle = categoryTitle;
        this.percentageObtained = percentageObtained;
    }


}
