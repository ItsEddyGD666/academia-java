package com.streams;

/*
 *
 * Filtrar empleados con salario menor a 400
 *
 **/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static Employee[] arrayEmp = {
            new Employee(0, "Empleado1", 100.0),
            new Employee(1, "Empleado2", 200.0),
            new Employee(2, "Empleado3", 300.0),
            new Employee(3, "Empleado4", 400.0),
            new Employee(4, "Empleado5", 500.0),
    };

    public static void main(String[] args) {
        List<Employee> listaEmpleados = Arrays.asList(arrayEmp);
        List<Employee> filteredEmployee = getEmpleyeeWithSalaryLessThan(listaEmpleados, 400.0);

        //empleados filtrados
        for (Employee emp : filteredEmployee) {
            System.out.println(emp);
        }

    }

    //metodo para filtrar empleados con salario menor a 400
    public static List<Employee> getEmpleyeeWithSalaryLessThan(List<Employee> empleyee, double salary) {
        List<Employee> filteredList = new ArrayList<>();
        for (Employee emp : empleyee) {
            if (emp.getSalary() < salary)
                filteredList.add(emp);
        }
        return filteredList;
    }
}
