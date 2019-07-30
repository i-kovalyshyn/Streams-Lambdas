package main.java.funcInterface;

import java.util.Arrays;
import java.util.List;

public class ImplementInterface {
    public static void runInterface() {
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300);

        PayTax payTax = name -> name.stream().map(cost -> cost * 1.19)
                .forEach(System.out::println);

        payTax.afterTax(costBeforeTax);
    }
}
