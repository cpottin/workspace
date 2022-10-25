package com.entertainment;

import com.entertainment.DisplayType;
import com.entertainment.Television;

public class TelevisionClient {
    public static void main(String[] args) {


        Television tv1 = new Television("Samsung", 10);
        // tv1.setDisplay(DisplayType.OLED);
        System.out.println(tv1);

        Television tv5 = new Television(DisplayType.OLED, "Sony", 10);
        System.out.println(tv5);

//        tv1.turnOn();
//        tv1.turnOff();
//        System.out.println(tv1);
//
//        Television tv2 = new Television("Vizio", 101);
//        tv2.turnOn();
//        tv2.turnOff();
//
//        System.out.println(tv2);

//        Television tv3 = new Television();
//        tv3.setVolume(100);
//        System.out.println(tv3);


    }
}


