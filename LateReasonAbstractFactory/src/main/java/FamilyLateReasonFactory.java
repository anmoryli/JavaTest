/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-04-28 下午5:18
 */

public class FamilyLateReasonFactory implements LateReasonFactory{
    @Override
    public LateReason getLateReason() {
        return new GoHomeReason();
    }
}
