package org.example.chatbot.config;

import dev.langchain4j.model.ollama.OllamaChatModel;
import dev.langchain4j.service.AiServices;
import org.example.chatbot.service.AiServiceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChatConfig {

    @Bean
    OllamaChatModel ollamaChatModel(){
        return OllamaChatModel.builder()
                .baseUrl("http://localhost:11434/")
                .modelName("qwen3.5:397b-cloud")
                .build();
    }

    @Bean
    AiServiceConfig configServicw(OllamaChatModel ollamaChatModel){
            return AiServices.builder(AiServiceConfig.class)
                    .chatModel(ollamaChatModel)
                    .build();
    }

}
