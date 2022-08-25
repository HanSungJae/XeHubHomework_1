package com.xehub.java.jstlpractice.service;

import com.xehub.java.jstlpractice.dto.ChatDto;
import com.xehub.java.jstlpractice.dto.FAQDto;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Service;

@Service
public class MockChatService implements ChatService {

    public List<ChatDto> getChatList() {
        List<ChatDto> dataList = new ArrayList<>();
        dataList.add(new ChatDto(
            "Hi! Do you have any questions about HelloSign?",
            (new DateFormatter("YYYY-mm-dd HH:mm:ss")).print(new Date(), Locale.KOREA)
        ));
        dataList.add(new ChatDto(
            null,
            (new DateFormatter("YYYY-mm-dd HH:mm:ss")).print(new Date(), Locale.KOREA)
        ));

        return dataList;
    }

}
