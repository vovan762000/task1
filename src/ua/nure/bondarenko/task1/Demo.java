package ua.nure.bondarenko.task1;

public class Demo {
    public static void main(String[] args) {
        System.out.println(Part1.getSum(new String[]{"2","3","5"}));
        System.out.println(Part2.getReverseOrder(new String[]{"2","3","5"}));
        Part3.printGcdLcm(new String[]{"18","12"});
        System.out.println(Part4.getSumAllDigits(new String[]{"asdf123","4gh56 jk","11","2f"}));
        Part5.printPrimeNumbers(new String[]{"10"});
        System.out.println();
        Part6.printPrimeFactors(new String[]{"360"});
        Part7.printSimpleDigitsWithNaxSum(new String[]{"15"});
        Part8.printPascal(Part8.pascal(5));
        Part9.printPrimeNumbers(new String[]{"37"});
    }
}
