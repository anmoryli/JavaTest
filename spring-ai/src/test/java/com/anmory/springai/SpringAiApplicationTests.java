package com.anmory.springai;

import com.openai.models.ChatModel;
import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.model.chat.ChatLanguageModel;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringAiApplicationTests {

    @Test
    void test01() {
        ChatLanguageModel model = QwenChatModel
                .builder()
                .apiKey("sk-defa3605b5a347c68c684dc2ae4d1263")
                .modelName("qwen-max")
                .build();

        String answer = model.chat("你好,你是谁");
        System.out.println(answer);
    }
}
