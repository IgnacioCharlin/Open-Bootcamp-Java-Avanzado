package com.example.patroncreaciona.Factory;

public class Main {

    public static void main(String [] args) {
        PrecioFactory precio = new PrecioFactory("España");
        System.out.println(precio.precio.getPrecio());

        PrecioFactory precio1 = new PrecioFactory("Argentina");
        System.out.println(precio1.precio.getPrecio());
    }
}
