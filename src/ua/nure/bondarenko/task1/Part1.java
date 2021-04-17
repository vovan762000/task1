package ua.nure.bondarenko.task1;

import java.util.Arrays;

class Part1 {
    public static int getSun(String[] array){
        return Arrays.stream(array)
                .mapToInt(Integer::parseInt)
                .sum();
    }
    public static void main(String[] args) {
        System.out.println(getSun(args));
    }
}
