/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-04-28 下午4:44
 */

public abstract class LateReasonFactory {
    public static LateReason getLateReason(String type) {
        if("去厕所".equals(type)) {
            return new ToiletReason();
        }
        else if("在路上".equals(type)) {
            return new OnWayReason();
        }
        else if("回家".equals(type)) {
            return new GoHomeLateReason();
        }
        else {
            return null;
        }
    }
}
