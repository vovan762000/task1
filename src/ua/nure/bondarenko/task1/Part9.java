package ua.nure.bondarenko.task1;

import java.util.ArrayList;
import java.util.List;

import static ua.nure.bondarenko.task1.Util.checkInputLikeDigit;

public class Part9 {
    public static List<Integer> getAllPrimeNumbers(String[] args) {
        int maxNumber = Integer.parseInt(args[0]);
        List<Integer> primeList = new ArrayList<>();
        for (int i = 2; i <= maxNumber; i++) {
            if (Part5.isPrime(i)) {
                primeList.add(i);
            }
        }
        return primeList;
    }

    public static void printPrimeNumbers(String[] args) {
        int[] simpleArray = getAllPrimeNumbers(args).stream().mapToInt(Integer::intValue).toArray();
        for (int i = 0; i < simpleArray.length; i++) {
            System.out.print(simpleArray[i] + (i == simpleArray.length - 1 ? "" : " "));
        }
    }

    public static void main(String[] args) {
        if (checkInputLikeDigit(args)) {
            printPrimeNumbers(args);
        }
    }
}
