package extends1;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "陈琳";
        teacher.age = 20;
        System.out.println(teacher.name + "..." + teacher.age);
        teacher.work();

        Manager manager = new Manager();
        manager.name = "周欢";
        manager.age = 20;
        System.out.println(manager.name + "..." + manager.age);
        manager.work();
    }
}
