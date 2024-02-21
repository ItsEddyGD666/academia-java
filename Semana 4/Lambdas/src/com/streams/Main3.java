package com.streams;

/*
 *
 * Filtrar empleados con salario menor a 400
 * Despues de filtrar a los empleados, le incrementamos el salario en 200
 * Filtrar empleados con nombre mayor a 6
 * Ordenar por nombre
 **/

import java.util.*;

public class Main3 {
    private static Employee[] arrayEmp = {
            new Employee(0, "Rodrigo", 100.0),
            new Employee(1, "Eduardo", 200.0),
            new Employee(2, "Fernanda", 300.0),
            new Employee(5, "Ana", 350.0),
            new Employee(3, "Marco", 400.0),
            new Employee(4, "Susana", 500.0),
    };

    public static void main(String[] args) {
        List<Employee> listaEmpleados = Arrays.asList(arrayEmp);
        //filtro de empleados
        List<Employee> filteredEmployee = getEmpleyeeWithSalaryLessThan(listaEmpleados, 400.0);
        //aumento de salario
        increaseSalary(filteredEmployee, 200.0);
        //filtrar empleados
        List<Employee> employeesLongName = getEmployeesWithNameLength(filteredEmployee, 6);
        //ordenar empleados
        sortEmpleyeeByName(employeesLongName);

        //empleados filtrados
        for (Employee emp : employeesLongName) {
            System.out.println(emp);
        }

    }

    //metodo para filtrar empleados con salario menor a 400
    public static List<Employee> getEmpleyeeWithSalaryLessThan(List<Employee> employee, double salary) {
        List<Employee> filteredList = new ArrayList<>();
        for (Employee emp : employee) {
            if (emp.getSalary() < salary)
                filteredList.add(emp);
        }
        return filteredList;
    }

    //aumentar salario en 200
    public static void increaseSalary(List<Employee> employee, double increaseAmount) {
        for (Employee emp : employee) {
            emp.setSalary(emp.getSalary() + increaseAmount);
        }
    }

    //filtrar nombre
    public static List<Employee> getEmployeesWithNameLength (List<Employee> employees, int nameLength) {
        List<Employee> filteredList = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getName().length() > nameLength)
                filteredList.add(emp);
        }
        return filteredList;
    }

    //ordenar por nombre
    public static void sortEmpleyeeByName(List<Employee> employee) {
        /*employee.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });*/

        Collections.sort(employee, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
