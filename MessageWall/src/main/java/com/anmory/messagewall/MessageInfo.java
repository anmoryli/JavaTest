package com.anmory.messagewall;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Anmory/李梦杰
 * &#064;description  TODO
 * &#064;date  2025-02-22 上午3:01
 */

//@Getter
//@Setter
//@ToString
public class MessageInfo {
    private String from;
    private String to;
    private String message;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
