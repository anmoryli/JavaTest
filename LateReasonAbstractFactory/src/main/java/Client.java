/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-04-28 下午5:22
 */

public class Client {
    public static void main(String[] args) {
        LateReasonFactory lateReasonFactory1 = new FamilyLateReasonFactory();
        LateReasonFactory lateReasonFactory2 = new PersonalLateReasonFactory();
        LateReasonFactory lateReasonFactory3 = new TrafficLateReasonFactory();

        lateReasonFactory1.getLateReason().getLateReason();
        lateReasonFactory2.getLateReason().getLateReason();
        lateReasonFactory3.getLateReason().getLateReason();
    }
}
