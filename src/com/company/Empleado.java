package com.company;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {

    private String nombre;
    private double sueldo;
    private int dia;
    private int mes;
    private int ano;
    private Date Alta;

    public Empleado (String nombre,double sueldo,int dia,int mes, int ano){

        this.nombre = nombre;
        this.sueldo = sueldo;
        GregorianCalendar fech_Actual = new GregorianCalendar(ano,mes-1,dia);
        Alta = fech_Actual.getTime();
    }
}
