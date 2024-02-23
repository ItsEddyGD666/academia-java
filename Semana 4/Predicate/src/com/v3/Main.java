package com.v3;

import com.interfaces.Predicado;
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
        /* USANDO LAMBDAS Y GENERICS*/
        System.out.println("v3");
        List<Empleado> listEmpleado = new ArrayList<>();
        listEmpleado.add(new Empleado("Eduardo", 24, 45.67));
        listEmpleado.add(new Empleado("Gustavo", 35, 56.67));
        listEmpleado.add(new Empleado("Sandra", 19, 40.50));
        listEmpleado.add(new Empleado("Oscar", 17, 10.09));
        listEmpleado.add(new Empleado("Misael", 21, 19.03));
        mostrarEmpleado(listEmpleado);

        List<String> listNombres = new ArrayList<>();
        listNombres.add("Eduardo");
        listNombres.add("Gustavo");
        listNombres.add("Sandra");
        listNombres.add("Oscar");
        listNombres.add("Misael");
        mostrarNombre(listNombres);
    }

    static void mostrarNombre(List<String> lista) {
        System.out.println("***Nombre con longitud mayor a 6");
        Predicado<String> condicion3 = e -> e.length() > 6;
        for (String s : lista) {
            if (condicion3.probar(s))
                System.out.println(s);
        }
    }

    static void mostrarEmpleado(List<Empleado> lista) {
        PredicadoEmpleado condicion1 = e -> e.getEdad() > 20;
        PredicadoEmpleado condicion2 = x -> x.getSalario() < 43;

        System.out.println("***Edad mayor a 20");
        for (Empleado emp : lista) {
            if (condicion1.probar(emp))
                System.out.println(emp);
        }

        System.out.println("***Sueldo menor a 43");
        for (Empleado emp : lista) {
            if (condicion2.probar(emp))
                System.out.println(emp);
        }

        System.out.println("***Ambas condiciones, edad mayor a 20 y sueldo menor a 43");
        for (Empleado emp : lista) {
            if (condicion1.probar(emp) && condicion2.probar(emp))
                System.out.println(emp);
        }
    }
}
