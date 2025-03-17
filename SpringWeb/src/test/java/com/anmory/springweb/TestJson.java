package com.anmory.springweb;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-02-18 下午11:15
 */

public class TestJson {
    @Test
    void testObject2Json() throws JsonProcessingException {
        UserInfo user = new UserInfo();
        user.setName("anmory");
        user.setAge(19);
        user.setEmail("anmory@qq.com");
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(user);
        System.out.println(s);
    }

    @Test
    void testJson2Object() throws JsonProcessingException {
        String json = "{\"name\":\"anmory\",\"gender\":null,\"age\":19,\"email\":\"anmory@qq.com\"}";
        ObjectMapper mapper = new ObjectMapper();
        UserInfo user = mapper.readValue(json, UserInfo.class);
        System.out.println(user.toString());
    }
}
