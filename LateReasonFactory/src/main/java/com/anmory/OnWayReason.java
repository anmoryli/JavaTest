package com.anmory;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-04-28 下午3:52
 */

public class OnWayReason extends LateReason{
    @Override
    public void getLateReason() {
        System.out.println("正在路上迟到");
    }
}
