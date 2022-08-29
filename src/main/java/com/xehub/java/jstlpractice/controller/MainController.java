package com.xehub.java.jstlpractice.controller;

import com.xehub.java.jstlpractice.service.ChatService;
import com.xehub.java.jstlpractice.service.FAQService;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

//    @GetMapping("")
//    public String main(Model model) {
//
//        model.addAttribute("isLoggedIn", Math.floor(Math.random() * 2) > 0);
//        model.addAttribute("faqList", faqService.getFAQList());
//        model.addAttribute("chatService", chatService.getChatList());
//
//        return "main";
//    }
    @GetMapping("")
    public ModelAndView main(ModelAndView modelAndView) {

        modelAndView.addObject("isLoggedIn", Math.floor(Math.random() * 2) > 0);
        modelAndView.addObject("faqList", faqService.getFAQList());
        modelAndView.addObject("chatService", chatService.getChatList());

        modelAndView.setViewName("main");
        return modelAndView;
    }
}
