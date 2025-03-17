import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("=====================================");
            System.out.println("||        欢迎来到学生管理系统        ||");
            System.out.println("||    1.添加学生    2.删除学生       ||");
            System.out.println("||    3.修改学生    4.查询学生       ||");
            System.out.println("||    5.显示信息    0.退出系统       ||");
            System.out.println("=====================================");
            System.out.print("请选择功能:>");
            int choose = sc.nextInt();
            switch(choose) {
                case 1:
                    Management.addStudent();
                    break;
                case 2:
                    Management.deleteStudent();
                    break;
                case  3:
                    Management.modifyStudent();
                    break;
                case 4:
                    Management.findStudent();
                    break;
                case 5:
                    Management.showStudent();
                    break;
                case 0:
                    System.out.println("退出系统!!!");
                    break;
            }
            if(choose == 0) break;
        }
    }

}
