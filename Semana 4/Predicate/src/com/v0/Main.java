package com.v0;

import com.interfaces.PredicadoEmpleado;
import com.pojo.Empleado;

import java.util.ArrayList;
import java.util.List;

class empleadoMayor20 implements PredicadoEmpleado {
    @Override
    public boolean probar(Empleado e) {
        return e.getEdad() > 20;
    }
}

class empleadoSueldoMenor43 implements PredicadoEmpleado {
    @Override
    public boolean probar(Empleado e) {
        return e.getSalario() < 43;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("v0");
        List<Empleado> listEmpleado = new ArrayList<>();
        listEmpleado.add(new Empleado("Eduardo", 24, 45.67));
        listEmpleado.add(new Empleado("Gustavo", 35, 56.67));
        listEmpleado.add(new Empleado("Sandra", 19, 40.50));
        listEmpleado.add(new Empleado("Oscar", 17, 10.09));
        listEmpleado.add(new Empleado("Misael", 21, 19.03));

        mostrarEmpleado(listEmpleado);
    }

    static void mostrarEmpleado(List<Empleado> lista) {
        empleadoMayor20 condicion1 = new empleadoMayor20();
        empleadoSueldoMenor43 condicion2 = new empleadoSueldoMenor43();

        System.out.println("Edad mayor a 20");
        for (Empleado emp : lista) {
            if (condicion1.probar(emp))
                System.out.println(emp);
        }

        System.out.println("Sueldo menor a 43");
        for (Empleado emp : lista) {
            if (condicion2.probar(emp))
                System.out.println(emp);
        }

        System.out.println("Ambas condiciones, edad mayor a 20 y sueldo menor a 43");
        for (Empleado emp : lista) {
            if (condicion1.probar(emp) && condicion2.probar(emp))
                System.out.println(emp);
        }
    }
}
