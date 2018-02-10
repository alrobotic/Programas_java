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

    public Empleado (String nombre, double sueldo, int dia, int mes, int ano){

        this.nombre = nombre;
        this.sueldo = sueldo;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        GregorianCalendar fech_Actual = new GregorianCalendar(ano,mes-1,dia);
        Alta = fech_Actual.getTime();
    }

    public String getNombre() {
        return nombre;
    }

    public Date getAlta() {
        //String f_alta;
        //f_alta = Alta.;

        return Alta;
    }

    public void SubeSueldo (double porcentaje){

        sueldo += (sueldo*porcentaje)/100;
    }

    public double getSueldo(){

        return sueldo;
    }
}
