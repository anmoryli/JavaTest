package com.anmory.langchain4jspring.controller;

import com.anmory.langchain4jspring.config.CommonConfiguration;
import dev.langchain4j.community.model.dashscope.QwenStreamingChatModel;
import dev.langchain4j.model.chat.response.ChatResponse;
import dev.langchain4j.model.chat.response.StreamingChatResponseHandler;
import dev.langchain4j.service.TokenStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-04-16 下午9:45
 */

@RestController
@RequestMapping("/ai")
public class ChatController {
    @Autowired
    QwenStreamingChatModel qwenStreamingChatModel;
    @RequestMapping(value = "/chat", produces = "text/stream;charset=utf-8")
    public Flux<String> chat(@RequestParam(defaultValue = "你是谁") String question) {
        Flux<String> flux = Flux.create(sink -> qwenStreamingChatModel.chat(question, new StreamingChatResponseHandler() {
            @Override
            public void onPartialResponse(String s) {
                sink.next(s);
            }

            @Override
            public void onCompleteResponse(ChatResponse chatResponse) {
                sink.complete();
            }

            @Override
            public void onError(Throwable throwable) {
                sink.error(throwable);
            }
        }));
        return flux;
    }

    @Autowired
    CommonConfiguration.Assistant assistant;

    @RequestMapping(value = "/memory_stream", produces = "text/stream;charset=utf-8")
    public Flux<String> memoryStream(@RequestParam(defaultValue = "你是谁") String question) {
        TokenStream stream = assistant.stream(question);

        return Flux.create(sink-> {
            stream.onPartialResponse(
                            sink::next
            )
                    .onCompleteResponse(c -> sink.complete())
                    .onError(sink::error)
                    .start();
        });
    }

    @Autowired
    CommonConfiguration.AssistantUnique assistantUnique;
    @RequestMapping(value = "/memory_unique_stream", produces = "text/stream;charset=utf-8")
    public Flux<String> memoryUniqueStream(Integer memoryId,@RequestParam(defaultValue = "你是谁") String question) {
        TokenStream stream = assistantUnique.stream(memoryId,question);

        return Flux.create(sink-> {
            stream.onPartialResponse(
                            sink::next
            )
                    .onCompleteResponse(c -> sink.complete())
                    .onError(sink::error)
                    .start();
        });
    }
}
