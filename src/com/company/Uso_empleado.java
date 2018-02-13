package com.company;

import javax.swing.*;
import java.util.ArrayList;

public class Uso_empleado {

    public static void main (String[] args){

        Empleado [] trabajador = new Empleado[3];
        trabajador[0] = new Empleado("María", 1000,12,3,1990);
        trabajador[1] = new Empleado("Jorge", 2500,15,10,2001);
        trabajador[2] = new Empleado("Alicia");

        for (int i=0; i<trabajador.length; i++) {
            System.out.println("El empleado " + trabajador[i].getNombre() + " ingreso el " + trabajador[i].getAlta());

            System.out.println("Sus seccion es: "+ trabajador[i].getSeccion()+ " y su ID: "+trabajador[i].dar_ID());

            System.out.println("Su sueldo es: " + trabajador[i].getSueldo());
        }

        for (Empleado e: trabajador) e.SubeSueldo(20);

        for (Empleado e: trabajador) System.out.println(" El sueldo mejorado es para "+e.getNombre()+" "+e.getSueldo());

        trabajador[1].setSeccion(JOptionPane.showInputDialog("Elija una seccion para "+trabajador[1].getNombre()));

        System.out.println("Su nueva seccion es: "+trabajador[1].getSeccion());

        System.out.println("El siguiente ID es: "+ Empleado.darSiguienteID());
    }
}
