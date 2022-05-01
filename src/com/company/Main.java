package com.company;

import java.util.Random;

public class Main {
    public static String canWalk(int age, int temperature){
        if(age>=20 && age<45 && temperature>=20 && temperature<30){
            return "mojno idti gulat age "+age+", temperature "+temperature;
        }else if (age<20 && temperature>=0 &temperature<28){
            return "mojno idti gulat age "+age+", temperature "+temperature;
        }else if (age>45 && temperature>=-10 &&temperature<25){
            return "mojno idti gulat age "+age+", temperature "+temperature;
        }else {
            return "ostavaites doma age "+age+", temperature "+temperature;
        }
    }

    public static void main(String[] args) {
        System.out.println(canWalk(22,25));
        System.out.println(canWalk(19,-20));
        System.out.println(canWalk(27,10));
        System.out.println(canWalk(37,25));
        System.out.println(canWalk(47,35));

        System.out.println();
        System.out.println(canWalk(generateRandomAge(),generateRandomTemperature() ));
        System.out.println(canWalk(generateRandomAge(),generateRandomTemperature() ));
        System.out.println(canWalk(generateRandomAge(),generateRandomTemperature() ));
        System.out.println(canWalk(generateRandomAge(),generateRandomTemperature() ));
        System.out.println(canWalk(generateRandomAge(),generateRandomTemperature() ));

    }
    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100)+1;
    }
    public static int generateRandomTemperature () {
        Random random = new Random();
        return  random.nextInt(40)-20;
    }
}
