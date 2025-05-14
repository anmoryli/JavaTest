package com.anmory;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-04-28 下午3:57
 */

public class GoHomeReasonFactory extends LateReasonFactory{
    @Override
    public LateReason getLateReason() {
        System.out.println("正在编写回家迟到理由");
        return new GoHomeReason();
    }
}
