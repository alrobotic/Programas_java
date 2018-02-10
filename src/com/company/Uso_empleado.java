package com.company;

public class Uso_empleado {

    public static void main (String[] args){

        Empleado Maria = new Empleado("María", 1000,12,3,1990);

        System.out.println("El empleado " + Maria.getNombre() + " ingreso el " + Maria.getAlta());

        //Maria.SubeSueldo(10);

        System.out.println("Su sueldo es: "+ Maria.getSueldo());

    }
}
