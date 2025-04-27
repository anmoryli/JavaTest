package com.anmory;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-04-27 下午4:05
 */

public class Nvwa {
    public static People createPeople(String type) {
        if (type.equalsIgnoreCase("M")) {
            return new Men();
        }
        else if(type.equalsIgnoreCase("W")) {
            return new Women();
        }
        else if(type.equalsIgnoreCase("R")) {
            return new Robot();
        }
        else {
            return null;
        }
    }
}
