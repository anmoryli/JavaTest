package extends4;

public class Test {
    public static void main(String[] args) {
        OldPhone oldPhone = new OldPhone();
        NewPhone newPhone = new NewPhone();

        oldPhone.call();
        oldPhone.message();
        oldPhone.show();

        newPhone.call();
        newPhone.message();
        newPhone.show();
    }
}
