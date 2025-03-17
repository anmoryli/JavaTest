package myclass;

public class Person {
    private String name;
    private String city;
    private int age;
    public Person(String name) {
        this.name = name;
        System.out.println("我是一个人，我的名字叫" + name);
    }

    public Person() {

    }

    public void eat() {
        System.out.println("我会吃东西");
    }
}
