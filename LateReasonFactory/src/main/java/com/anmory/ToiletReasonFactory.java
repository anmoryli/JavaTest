package com.anmory;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-04-28 下午3:55
 */

public class ToiletReasonFactory extends LateReasonFactory{
    @Override
    public LateReason getLateReason() {
        System.out.println("正在编写去厕所迟到理由");
        return new ToiletReason();
    }
}
