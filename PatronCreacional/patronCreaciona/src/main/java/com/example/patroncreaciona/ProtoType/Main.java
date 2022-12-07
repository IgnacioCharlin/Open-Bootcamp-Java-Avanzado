package com.example.patroncreaciona.ProtoType;

public class Main {

    public static void main(String [] args){
        Coche coche = new Coche();
        coche.puertas =5 ;
        coche.modelo = "Focus";
        coche.marca = "Ford";

        System.out.println(coche.marca);

        Coche cocheClonado = null;
        try {
            cocheClonado = coche.clonar();
        } catch (CloneNotSupportedException e) {
            System.out.println("No se pudo clonar: " + e.getMessage());
        }
        System.out.println(cocheClonado.marca);
    }
}
