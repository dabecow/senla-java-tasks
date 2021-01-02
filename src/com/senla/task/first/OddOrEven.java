package com.senla.task.first;

public class OddOrEven {
    public static boolean isComposite(int num) {

        int k = 2;
        while (k * k <= num && num % k != 0)
            k += 1;
        return k * k <= num;
    }

    public static boolean isEven(int num){
        return num % 2 == 0;
    }

}
