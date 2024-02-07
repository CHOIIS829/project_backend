package com.example.backend.domain.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class LoginRequestDto {
    private String id;
    private String pwd;

}
