/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-04-28 下午5:22
 */

public class PersonalLateReasonFactory implements LateReasonFactory{
    @Override
    public LateReason getLateReason() {
        return new ToiletReason();
    }
}
