package com.company;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {

    private final String nombre;
    private double sueldo;
    private int dia;
    private int mes;
    private int ano;
    private Date Alta;
    private String seccion;
    private int ID;
    private static int idSiguiente=1;

    public Empleado (String nombre, double sueldo, int dia, int mes, int ano){

        this.nombre = nombre;
        this.sueldo = sueldo;
        seccion = "Administracion";
        GregorianCalendar fech_Actual = new GregorianCalendar(ano,mes-1,dia);
        Alta = fech_Actual.getTime();
        ID=idSiguiente;
        idSiguiente++;

    }

    public Empleado (String nombre){

        this(nombre,1000,1,1,2000);
    }

    public String getNombre() {
        return nombre;
    }

    public Date getAlta() {

        return Alta;
    }

    public void SubeSueldo (double porcentaje){

        sueldo += (sueldo*porcentaje)/100;
    }

    public double getSueldo(){

        return sueldo;
    }

    public void setSeccion(String seccion) {

        this.seccion = seccion;
    }

    public String getSeccion(){

        return seccion;
    }

    public int dar_ID(){

      return ID;
    }

    public static int darSiguienteID(){

        return idSiguiente;
    }
}
