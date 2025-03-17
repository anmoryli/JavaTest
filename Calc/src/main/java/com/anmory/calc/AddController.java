package com.anmory.calc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-02-21 上午6:56
 */


@RestController
public class AddController {
    @RequestMapping("/sum")
    public String sum(Integer add1, Integer add2) {
        if(add1 != null && add2 != null) {
            Integer sum = add1 + add2;
            return "<h1>计算结果是: " + sum + "</h1>";
        }
        else {
            return "你妈";
        }
    }
}
