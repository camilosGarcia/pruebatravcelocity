package com.travelocity.automation.utils;

import java.util.Random;

public class RamdonString {

    public static String getRandomString(){
        Random r = new Random();
        return String.valueOf(((char)(r.nextInt(26) + 'a')));
    }
}
