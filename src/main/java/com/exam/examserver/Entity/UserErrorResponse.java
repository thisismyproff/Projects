package com.exam.examserver.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class UserErrorResponse extends User {
    String error;
    int errorCode;
}
