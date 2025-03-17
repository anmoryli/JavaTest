package student;

public class Main {
    public static void main(String[] args) {
        Student.addr = "Beijing";

        Student s1 = new Student("anmory");
        System.out.println(s1.getName() + Student.addr);
    }
}
