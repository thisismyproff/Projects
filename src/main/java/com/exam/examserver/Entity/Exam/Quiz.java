package com.exam.examserver.Entity.Exam;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long quizId;
    private String title;
    private String description;
    private Integer maxMarks;
    private Integer numberOfQuestions;
    private boolean active = false;
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    private Category category;
    @OneToMany(mappedBy = "quiz" , fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Questions> questions = new HashSet<>();

}
