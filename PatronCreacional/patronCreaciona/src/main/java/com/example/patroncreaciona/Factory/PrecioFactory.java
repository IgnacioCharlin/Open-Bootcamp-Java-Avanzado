package com.example.patroncreaciona.Factory;


// Esta clase es la que se encarga de instancias o crear las clases mediante una logica estipulada y
// utilizar logicas que apliquen a todos.
public class PrecioFactory {

    //Es una variable de la interface
    Precio precio;

    private PrecioFactory(){};

    public PrecioFactory(String pais) {
        if (pais.equalsIgnoreCase("España")) {
            System.out.println("España, precio en EUR");
            precio = new PrecioEUR();
        } else {
            System.out.println("Otro pais, precio en USD");
            precio = new PrecioUSD();
        }
    }

}

