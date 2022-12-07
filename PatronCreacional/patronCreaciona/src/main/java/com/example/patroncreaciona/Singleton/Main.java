package com.example.patroncreaciona.Singleton;

public class Main {

    public static void main(String []args){

        // Esta patron Singleton , hace que no haya 2 instancias de una misma clase.
        Singleton singleton =  Singleton.getInstance();

        System.out.println(singleton);
        Singleton singleton1 =  Singleton.getInstance();

        System.out.println(singleton1);

    }
}
