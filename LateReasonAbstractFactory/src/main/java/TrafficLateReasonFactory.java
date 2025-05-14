/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-04-28 下午5:21
 */

public class TrafficLateReasonFactory implements LateReasonFactory{
    @Override
    public LateReason getLateReason() {
        return new OnWayReason();
    }
}
