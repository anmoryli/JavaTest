package com.anmory.langchain4jspring.config;

import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.StreamingChatLanguageModel;
import dev.langchain4j.service.AiServices;
import dev.langchain4j.service.TokenStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-04-17 上午8:41
 */

@Configuration
public class CommonConfiguration {
    public interface Assistant {
        String chat(String question);
        TokenStream stream(String question);
    }

    @Bean
    public Assistant assistant(
                               StreamingChatLanguageModel qwenStreamingChatModel) {
        ChatMemory chatMemory = MessageWindowChatMemory.withMaxMessages(1000);

        return AiServices.builder(Assistant.class)
//                .chatLanguageModel(qwenChatModel)
                .streamingChatLanguageModel(qwenStreamingChatModel)
                .chatMemory(chatMemory)
                .build();
    }
}
