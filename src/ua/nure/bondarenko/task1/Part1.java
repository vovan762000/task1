package ua.nure.bondarenko.task1;

import java.util.Arrays;
import static ua.nure.bondarenko.task1.Util.*;

public class Part1 {
    public static int getSum(String[] array) {
        try {
            return Arrays.stream(array)
                    .mapToInt(Integer::parseInt)
                    .sum();
        } catch (NumberFormatException e) {
            System.out.println("Input correct sequence");
        }
        return 0;
    }

    public static void main(String[] args) {
        if (checkInputLikeDigit(args)) {
            System.out.println(getSum(args));
        }
    }
}
