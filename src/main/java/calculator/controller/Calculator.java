package calculator.controller;

import java.util.List;

public class Calculator {
    public static Integer add(List<Integer> operations) {
        return operations.stream().mapToInt(Integer::intValue).sum();
    }
}
