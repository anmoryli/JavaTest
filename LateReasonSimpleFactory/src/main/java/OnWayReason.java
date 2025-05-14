/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-04-28 下午4:49
 */

public class OnWayReason implements LateReason{
    @Override
    public void getLateReason() {
        System.out.println("在路上迟到");
    }
}
