package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String color;

        Coche Renault = new Coche();


        System.out.println("El largo del auto es: " + Renault.dame_largo() + " metros");

        Renault.set_color("Amarillo");

        System.out.println("El coche es color: " + Renault.dame_color());

        Renault.set_clima(true);

        System.out.println("El coche es climatizado? : " + Renault.dame_clima());
    }
}
