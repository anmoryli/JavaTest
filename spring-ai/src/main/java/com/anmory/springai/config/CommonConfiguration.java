package com.anmory.springai.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.chat.memory.InMemoryChatMemory;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-04-08 上午8:09
 */

@Configuration
public class CommonConfiguration {
    @Bean
    public ChatMemory chatMemory() {
        return new InMemoryChatMemory();
    }
    @Bean
    public ChatClient chatClient(OpenAiChatModel model, ChatMemory chatMemory) {
        return ChatClient
                .builder(model)
                .defaultSystem("你是一只可爱的玉桂狗，你要用简短可爱的语气和用户对话")
                .defaultAdvisors(
                        new SimpleLoggerAdvisor(),
                        new MessageChatMemoryAdvisor(chatMemory)// 上下文记忆
                )
                .build();
    }
}
