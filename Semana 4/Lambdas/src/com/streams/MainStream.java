package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainStream {
    private static Employee[] arrayEmp = {
            new Employee(0, "Rodrigo", 100.0),
            new Employee(1, "Eduardo", 200.0),
            new Employee(2, "Fernanda", 300.0),
            new Employee(5, "Ana", 350.0),
            new Employee(3, "Marco", 400.0),
            new Employee(4, "Susana", 500.0),
    };

    public static void main(String[] args) {
        List<Employee> listaEmp = Arrays.asList(arrayEmp);
        List<String> nombres = listaEmp.stream()
                .filter(x -> x.getSalary() < 400)
                .peek(y -> y.setSalary(y.getSalary() + 200))
                .filter(z -> z.getName().length() > 6)
                .peek(System.out::println)
                .sorted(Comparator.comparing(Employee::getName))
                .map(x -> x.getName())
                .collect(Collectors.toList());
    }
}
