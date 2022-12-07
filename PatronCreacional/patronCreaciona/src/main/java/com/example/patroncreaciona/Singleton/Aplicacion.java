package com.example.patroncreaciona.Singleton;

public class Aplicacion {

    boolean isRunning = false;
    private static Aplicacion aplicacion;

    private Aplicacion(){
    }

    public static Aplicacion getInstance(){
        if(aplicacion==null)
            aplicacion = new Aplicacion();

        return aplicacion;
    }

    public void Run(){
        if(!isRunning)
            isRunning =  true;
    }
}
