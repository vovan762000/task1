package ua.nure.bondarenko.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Part2 {
    public static String printReverseOrder(String[] array){
        List<String> listFromArray = Arrays.asList(array);
        Collections.reverse(listFromArray);
        return listFromArray.stream().collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(printReverseOrder(args));
    }
}
