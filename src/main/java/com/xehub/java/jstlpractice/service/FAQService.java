package com.xehub.java.jstlpractice.service;

import com.xehub.java.jstlpractice.dto.FAQDto;
import java.util.List;
import org.springframework.stereotype.Service;

public interface FAQService {
    List<FAQDto> getFAQList();

}
