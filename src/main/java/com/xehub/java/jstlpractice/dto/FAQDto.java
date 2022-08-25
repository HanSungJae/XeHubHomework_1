package com.xehub.java.jstlpractice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FAQDto {
    protected String title;
    protected String content;

    public FAQDto(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
