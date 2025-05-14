package com.anmory.springaitest.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import static org.apache.commons.lang3.function.Failable.call;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-04-17 下午2:49
 */

@RestController
@RequestMapping("/ai")
public class MyController {
    private final ChatClient chatClient;

    public MyController(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    @Autowired
    OpenAiChatModel openAiChatModel;

    @GetMapping("/chat")
    public String generation(@RequestParam(value = "message",defaultValue = "你是谁") String message) {
        return this.chatClient.prompt()
                .user(message)
                .call()
                .content();
    }

    @GetMapping(value = "/stream",produces = "text/stream;charset=utf-8")
    public Flux<String> stream(@RequestParam(value = "message",defaultValue = "你是谁") String message) {
        return openAiChatModel.stream(message);
    }
}
