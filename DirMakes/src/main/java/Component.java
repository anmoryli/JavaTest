import java.util.List;

/**
 * @author Anmory
 * @description TODO
 * @date 2025-05-14 下午3:03
 */

public abstract class Component {
    private String name;
    public Component(String name) {
        System.out.println("调用父类构造函数");
        this.name = name;
    }

    public abstract void eat();
}
