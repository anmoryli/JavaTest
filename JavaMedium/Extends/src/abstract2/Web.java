package abstract2;

public class Web extends Maintaince{
    @Override
    public void work() {
        System.out.println("员工号为" + this.getId() + "的员工正在检查网络是否通畅");
    }
}
