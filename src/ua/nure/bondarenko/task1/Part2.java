package ua.nure.bondarenko.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Part2 {
    public static String getReverseOrder(String[] array){
        List<String> listFromArray = Arrays.asList(array);
        Collections.reverse(listFromArray);
        return String.join(" ", listFromArray);
    }

    public static void main(String[] args) {
        System.out.println(getReverseOrder(args));
    }
}
