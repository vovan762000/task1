package ua.nure.bondarenko.task1;

import java.util.ArrayList;
import java.util.List;

public class Part5 {
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] getPrimeNumbers(int n) {
        List<Integer> simpleList = new ArrayList<>();
        int nextNumber = 2;
        int counter = 0;
        while (counter < n) {
            if (isPrime(nextNumber)) {
                simpleList.add(nextNumber);
                counter++;
            }
            nextNumber++;
        }
        return simpleList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int digitsNumber = 0;
        try {
            digitsNumber = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Input correct data");
        }
        int[] simpleArray = getPrimeNumbers(digitsNumber);
        for (int i = 0; i < simpleArray.length; i++) {
            System.out.print(simpleArray[i] + (i == simpleArray.length - 1 ? "" : " "));
        }
    }
}
