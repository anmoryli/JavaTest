package com.anmory;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-04-28 下午3:56
 */

public class OnWayReasonFactory extends LateReasonFactory{
    @Override
    public LateReason getLateReason() {
        System.out.println("正在编写正在赶往目的地迟到理由");
        return new OnWayReason();
    }
}
