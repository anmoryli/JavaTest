public class Test {
    public static void main(String[] args) {
        String ret = concat("anmory","alice","alan");
        System.out.println(ret);
    }

    public static String concat(String...str) {
        String ret = "";
        for(int i = 0; i < str.length; i++) {
            ret += str[i];
            ret += ',';
        }
        return ret;
    }
}
