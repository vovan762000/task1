package ua.nure.bondarenko.task1;

import java.util.Arrays;
import static ua.nure.bondarenko.task1.Util.*;

public class Part1 {
    public static int getSum(String[] array) {
            return Arrays.stream(array)
                    .mapToInt(Integer::parseInt)
                    .sum();
    }

    public static void main(String[] args) {
        if (checkInputLikeDigit(args)) {
            System.out.println(getSum(args));
        }
    }
}
