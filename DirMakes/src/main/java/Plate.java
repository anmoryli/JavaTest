import java.util.ArrayList;
import java.util.List;

/**
 * @author Anmory
 * @description TODO
 * @date 2025-05-14 下午3:07
 */

public class Plate extends Component{
    String name;
    private List<Component> components = new ArrayList<>();

    public Plate(String name) {
        super(name);
        System.out.println("子类构造函数");
        this.name = name;
    }
    @Override
    public void eat() {
        System.out.println(name);
        for(Component component:components) {
            component.eat();
        }
    }

    protected void add(Component component) {
        components.add(component);
    }

    protected void remove(Component component) {
        components.remove(component);
    }

    protected List<Component> getChild() {
        return components;
    }
}
