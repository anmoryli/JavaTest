package bigInt1;

import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("1111111111111111111111111111111111111111111111111111111111");
        BigInteger b2 = new BigInteger("1111111111111111111111111111111111111111111111111111");
        System.out.println(b1.add(b2));
        System.out.println(b1.divide(b2));
        System.out.println(b1.multiply(b2));

    }
}
