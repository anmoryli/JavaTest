package com.anmory;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-04-28 下午4:05
 */

public class Client {
    public static void main(String[] args) {
        LateReasonFactory lateReasonFactory1 = new GoHomeReasonFactory();
        LateReasonFactory lateReasonFactory2 = new OnWayReasonFactory();
        LateReasonFactory lateReasonFactory3 = new ToiletReasonFactory();

        lateReasonFactory1.getLateReason().getLateReason();
        lateReasonFactory2.getLateReason().getLateReason();
        lateReasonFactory3.getLateReason().getLateReason();
    }
}
