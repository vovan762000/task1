package ua.nure.bondarenko.task1;

import static ua.nure.bondarenko.task1.Util.checkInputLikeDigit;

public class Part8 {
    public static int[][] pascal(int n) {
        int[][] triangle = new int[n + 1][n + 1];
        for (int i = 0; i < n; i++) {
            triangle[i][0] = triangle[i][i] = 1;
            for (int k = 1; k < i; k++) {
                triangle[i][k] = triangle[i - 1][k - 1] + triangle[i - 1][k];
            }
        }
        return triangle;
    }

    public static void printPascal(int[][] triangle) {
        int row = triangle.length - 1;
        for (int i = 0; i < row; i++) {
            int number = triangle[i][i];
            System.out.format("%" + (row - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", number);
                number = number * (i - j) / (j + 1);

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        if (checkInputLikeDigit(args)) {
            int arraySize = Integer.parseInt(args[0]);
            printPascal(pascal(arraySize));
        }
    }
}
