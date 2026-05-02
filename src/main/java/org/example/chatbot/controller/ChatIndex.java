package org.example.chatbot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatIndex {

    @GetMapping("/")
    public String index(){
        return "forward:/index.html";
    }

}
