package com.anmory.messagewall;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-02-22 上午3:28
 */

@RequestMapping("/message")
@RestController
public class MessageController {
    // 暂时存储到list中，后续再存储到数据库
    private List<MessageInfo> messageInfoList = new ArrayList<>();
    @RequestMapping(value = "/publish", produces = "application/json")
    public String publish(@RequestBody MessageInfo messageInfo) {// 这里代表接受的是一个json，否则接受的是对象，无法正确接受
        if(!StringUtils.hasLength(messageInfo.getFrom())
                || !StringUtils.hasLength(messageInfo.getTo())
        || !StringUtils.hasLength(messageInfo.getMessage())) {
            return "{\"ok\": 0}";
        }
        messageInfoList.add(messageInfo);
        return "{\"ok\": 1}";
    }

    @RequestMapping("/getList")
    public List<MessageInfo> getList() {
        return messageInfoList;
    }
}
