package org.example.chatbot.controller;

import lombok.RequiredArgsConstructor;
import org.example.chatbot.service.AiServiceConfig;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/chat")
@RequiredArgsConstructor
public class ChatController {

    private final AiServiceConfig aiServiceConfig;

    @PostMapping
    public String messageChat(@RequestBody String message){
        return aiServiceConfig.chat(message);
    }

}