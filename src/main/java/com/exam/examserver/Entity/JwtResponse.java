package com.exam.examserver.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JwtResponse {
    String token;

    public JwtResponse() {
    }

    public JwtResponse(String token) {
        this.token = token;
    }
}
