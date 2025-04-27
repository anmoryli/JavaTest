package com.anmory;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-04-27 下午4:13
 */

public class Client {
    public static void main(String[] args) {
        People people1 = Nvwa.createPeople("W");
        people1.create();

        People people2 = Nvwa.createPeople("M");
        people2.create();

        People people3 = Nvwa.createPeople("R");
        people3.create();
    }
}
