/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-04-28 下午4:50
 */

public class Client {
    public static void main(String[] args) {
        LateReason lateReason1 = LateReasonFactory.getLateReason("去厕所");
        lateReason1.getLateReason();

        LateReason lateReason2 = LateReasonFactory.getLateReason("在路上");
        lateReason2.getLateReason();

        LateReason lateReason3 = LateReasonFactory.getLateReason("回家");
        lateReason3.getLateReason();
    }
}
