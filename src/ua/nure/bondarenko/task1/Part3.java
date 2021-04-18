package ua.nure.bondarenko.task1;

import java.util.Arrays;
import static ua.nure.bondarenko.task1.Util.*;

public class Part3 {

    private static long getGcd(long a, long b) {
        return b == 0 ? a : getGcd(b, a % b);
    }

    private static long getLcm(long a, long b) {
        return a / getGcd(a, b) * b;
    }

    public static void printGcdLcm(String[] array) {
        int[] arrayOfInt = Arrays.stream(array)
                    .mapToInt(Integer::parseInt)
                    .toArray();
        if (arrayOfInt.length != 2 || arrayOfInt[0] < 0 || arrayOfInt[1] < 0) {
            System.out.println(ERR_MASSAGE);
        }
        System.out.println(getGcd(arrayOfInt[0], arrayOfInt[1]) + " " + getLcm(arrayOfInt[0], arrayOfInt[1]));
    }

    public static void main(String[] args) {
        if (checkInputLikeDigit(args)) {
            printGcdLcm(args);
        }
    }
}
