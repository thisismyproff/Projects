package com.exam.examserver.Entity.Exam;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long questionId;
    @Column(length = 5000)
    private String content;
    private String image;
    private String option1;
    private String option4;
    private String option3;
    private String option2;
    private String answer;
    @ManyToOne(fetch = FetchType.EAGER)
    private Quiz quiz;
}
