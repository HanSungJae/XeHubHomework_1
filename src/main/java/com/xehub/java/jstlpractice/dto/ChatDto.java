package com.xehub.java.jstlpractice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatDto {
    protected String message;
    protected String createdAt;

    public ChatDto(String message, String createdAt) {
        this.message = message;
        this.createdAt = createdAt;
    }
}
