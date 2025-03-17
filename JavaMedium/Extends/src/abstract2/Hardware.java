package abstract2;

public class Hardware extends Maintaince{
    @Override
    public void work() {
        System.out.println("员工号为" + this.getId() + "的员工正在修复电脑主板");
    }
}
