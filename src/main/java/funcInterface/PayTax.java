package main.java.funcInterface;

import java.util.List;

@FunctionalInterface
public interface PayTax {
void afterTax(List<Integer> name);
}
