package ua.nure.bondarenko.task1;

public class Part4 {
    public static int getSumAllDigits(String[] array) {
        int sum = 0;
        String stringFromArray = String.join("", array);
        for (int i = 0; i < stringFromArray.length(); i++) {
            if (Character.isDigit(stringFromArray.charAt(i))) {
                sum += Character.getNumericValue(stringFromArray.charAt(i));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getSumAllDigits(args));
    }
}
