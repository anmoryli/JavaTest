import java.util.Scanner;
public class Management {
    static Student[] stus = new Student[2];
    static int size = 0;
    static int capacity = 0;
    static Scanner sc = new Scanner(System.in);

    public static void addStudent() {
        if (size == capacity) {
            // 扩展数组容量
            Student[] newStus = new Student[capacity * 2];
            System.arraycopy(stus, 0, newStus, 0, capacity);
            stus = newStus;
            capacity *= 2;
        }

        stus[size] = new Student();
        System.out.print("请输入学生id:>");
        int id = sc.nextInt();
        System.out.print("请输入学生姓名:>");
        String name = sc.next();
        System.out.print("请输入学生年龄:>");
        int age = sc.nextInt();
        System.out.print("请输入学生性别:>");
        String sex = sc.next();

        stus[size].setId(id);
        stus[size].setAge(age);
        stus[size].setName(name);
        stus[size].setSex(sex);
        size++;
        System.out.println("添加信息成功");
    }

    public static void deleteStudent() {
        System.out.print("请输入学生id:>");
        int id = sc.nextInt();
        int ret = findStudentById(id);
        if(ret == -1) return;
        for(int i = ret; i < size - 1; i++) {
            stus[i] = stus[i + 1];
        }
        size--;
    }

    private static int findStudentById(int id) {
        for(int i = 0; i < size; i++) {
            if(id == stus[i].getId()) {
                return i;
            }
        }
        System.out.println("对不起，没有找到该学生");
        return -1;
    }

    public static void modifyStudent() {
        System.out.print("请输入学生id:>");
        int id = sc.nextInt();
        int ret = findStudentById(id);
        if(ret == -1) return;
        System.out.print("请输入学生id:>");
        int newid = sc.nextInt();
        System.out.print("请输入学生姓名:>");
        String name = sc.next();
        System.out.print("请输入学生年龄:>");
        int age = sc.nextInt();
        System.out.print("请输入学生性别:>");
        String sex = sc.next();
        stus[ret].setId(newid);
        stus[ret].setAge(age);
        stus[ret].setName(name);
        stus[ret].setSex(sex);
        System.out.println("修改成功");
    }

    public static void findStudent() {
        System.out.print("请输入学生id:>");
        int id = sc.nextInt();
        for(int i = 0; i < size; i++) {
            if(id == stus[i].getId()) {
                System.out.println("id\t姓名\t年龄\t性别");
                System.out.print(stus[i].getId() + "\t" + stus[i].getName() + "\t" + stus[i].getAge() + "\t" + stus[i].getSex());
                System.out.print("\n");
                break;
            }
        }
        System.out.println("对不起，没有找到该学生");
    }

    public static void showStudent() {
        System.out.println("id\t姓名\t年龄\t性别");
        for(int i = 0; i < size; i++) {
            System.out.print(stus[i].getId() + "\t" + stus[i].getName() + "\t" + stus[i].getAge() + "\t" + stus[i].getSex());
            System.out.print("\n");
        }
    }
}
