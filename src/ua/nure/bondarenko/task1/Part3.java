package ua.nure.bondarenko.task1;

import java.util.Arrays;

public class Part3 {
    private static final String ERR_MASSAGE = "Input correct data";

    private static long getGcd(long a, long b) {
        return b == 0 ? a : getGcd(b, a % b);
    }

    private static long getLcm(long a, long b) {
        return a / getGcd(a, b) * b;
    }

    public static void printGcdLcm(String[] array) {
        int[] arrayOfInt = null;
        try {
            arrayOfInt = Arrays.stream(array)
                    .mapToInt(Integer::parseInt)
                    .toArray();
        } catch (NumberFormatException e) {
            System.out.println(ERR_MASSAGE);
        }
        if (arrayOfInt == null || arrayOfInt.length != 2 || arrayOfInt[0] < 0 || arrayOfInt[1] < 0) {
            System.out.println(ERR_MASSAGE);
        }
        System.out.println(getGcd(arrayOfInt[0], arrayOfInt[1]) + " " + getLcm(arrayOfInt[0], arrayOfInt[1]));
    }

    public static void main(String[] args) {
        printGcdLcm(args);
    }
}
