package main.java.funcInterface;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300);
        PayTax payTax = name -> name.stream().map(cost -> 1.19 * cost).forEach(System.out::println);
        payTax.afterTax(costBeforeTax);
    }
}
