package ua.nure.bondarenko.task1;

import java.util.*;
import static ua.nure.bondarenko.task1.Util.checkInputLikeDigit;

public class Part6 {
    public static int nextPrime(int x) {
        boolean isPrime = false;
        while (true) {
            x++;
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    isPrime = false;
                    break;
                }
                isPrime = true;
            }
            if (isPrime) {
                break;
            } else {
                continue;
            }
        }
        return x;
    }

    public static Map<Integer,Integer> primeFactors(int number) {
        Map<Integer,Integer> primeFactorsMap = new HashMap<>();
        final int NUM_OF_OCCUR = 1;
        int copyOfInput = number;
        for (int i = 2; i <= copyOfInput; i++) {
            if (copyOfInput % i == 0) {
                primeFactorsMap.merge(i,NUM_OF_OCCUR,(oldval,newVal) ->oldval+newVal);
                copyOfInput /= i;
                i--;
            }
        }
        return primeFactorsMap;
    }

    public static void main(String[] args) {
        if (checkInputLikeDigit(args)) {
            StringBuilder output = new StringBuilder(args + " =");
            for (Map.Entry<Integer, Integer> entry : primeFactors(360).entrySet()) {
                output.append(" " + entry.getKey() + "^" + entry.getValue());
            }
            System.out.println(output);
        }
    }
}
