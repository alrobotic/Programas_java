package com.company;

public class Coche {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_base;
    private String color;
    private boolean climatizacion;
    private boolean Tapizado_cuero;

    public Coche(){

        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_base = 500;
        color = "Negro";
        climatizacion = false;
        Tapizado_cuero = false;
    }

    public int dame_largo(){

        return largo;
    }

    public void set_color(String color_coche){

        this.color = color_coche;
    }

    public String dame_color(){

        return color;
    }

    public void set_clima(boolean Clima){

        climatizacion = Clima;
    }

    public String dame_clima(){

        String esclima;

        if (climatizacion) esclima = "Si";
        else esclima = "No";


        return esclima;
    }

    public String isTapizado_cuero() {
        String tapizado;

        if (Tapizado_cuero){
            tapizado = "Si";
        }
        else tapizado = "No";

        return tapizado;
    }

    public void setTapizado_cuero(boolean tapizado_cuero) {
        Tapizado_cuero = tapizado_cuero;
    }
}

