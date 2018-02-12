package com.company;

import java.util.ArrayList;

public class Uso_empleado {

    public static void main (String[] args){

        Empleado [] trabajador = new Empleado[2];
        trabajador[0] = new Empleado("María", 1000,12,3,1990);
        trabajador[1] = new Empleado("Jorge", 2500,15,10,2000);

        for (int i=0; i<2; i++) {
            System.out.println("El empleado " + trabajador[i].getNombre() + " ingreso el " + trabajador[i].getAlta());

            //Maria.SubeSueldo(10);

            System.out.println("Su sueldo es: " + trabajador[i].getSueldo());
        }

        for (Empleado e: trabajador) e.SubeSueldo(20);

        for (Empleado e: trabajador) System.out.println(" El sueldo mejorado es para "+e.getNombre()+" "+e.getSueldo());
    }
}
