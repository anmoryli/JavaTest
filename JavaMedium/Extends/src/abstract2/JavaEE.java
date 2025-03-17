package abstract2;

public class JavaEE extends Development{
    @Override
    public void work() {
        System.out.println("员工号为" + this.getId() + "的员工正在研发电商网站");
    }
}
