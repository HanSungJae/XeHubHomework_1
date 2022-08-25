package com.xehub.java.jstlpractice.controller;

import com.xehub.java.jstlpractice.service.ChatService;
import com.xehub.java.jstlpractice.service.FAQService;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MainController {

    @Resource
    FAQService faqService;

    @Resource
    ChatService chatService;

    @GetMapping("")
    public ModelAndView main(ModelAndView modelAndView) {
        modelAndView.setViewName("main");

        modelAndView.addObject("isLoggedIn", Math.floor(Math.random() * 2) > 0);
        modelAndView.addObject("faqList", faqService.getFAQList());
        modelAndView.addObject("chatService", chatService.getChatList());

        return modelAndView;
    }
}
