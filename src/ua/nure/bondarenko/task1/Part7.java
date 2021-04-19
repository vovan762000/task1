package ua.nure.bondarenko.task1;

import java.util.ArrayList;
import java.util.List;

import static ua.nure.bondarenko.task1.Util.checkInputLikeDigit;

public class Part7 {

    public static void printSimpleDigitsWithNaxSum(String[] array) {
        List<String> simpleList = new ArrayList<>();
        int numberOfPrimeDigits = Integer.parseInt(array[0]);
        int nextNumber = 2;
        while (simpleList.size() < numberOfPrimeDigits) {
            if (Part5.isPrime(nextNumber)) {
                simpleList.add(String.valueOf(nextNumber));
            }
            nextNumber++;
        }
        int maxSum = 0;
        int tmp ;
        int count = 1;
        for (String primeNumber : simpleList) {
            tmp = Part1.getSum(primeNumber.split(""));
            if (tmp > maxSum) {
                maxSum = tmp;
                count = 1;
            } else if (tmp == maxSum) {
                count++;
            }
        }
        System.out.println(maxSum + " " + count);
    }

    public static void main(String[] args) {
        if (checkInputLikeDigit(args)) {
            printSimpleDigitsWithNaxSum(args);
        }
    }
}
