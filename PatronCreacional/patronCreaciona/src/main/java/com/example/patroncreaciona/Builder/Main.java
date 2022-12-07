package com.example.patroncreaciona.Builder;

import java.util.stream.IntStream;

public class Main {

    public static void main(String [] args){
        // Forma de instanciar el objeto
        Vehiculo coche = new VehiculoBuilder("Ford")
                .setPuertas(3)
                .setMotor("1.6 Turbo")
                .build();

        System.out.println(coche.getMotor());
        System.out.println(coche.getPuertas());
        System.out.println(coche.getMarca());

    }
}
