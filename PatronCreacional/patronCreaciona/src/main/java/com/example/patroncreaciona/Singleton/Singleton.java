package com.example.patroncreaciona.Singleton;


// Esta patron Singleton , hace que no haya 2 instancias de una misma clase.
public class Singleton {

        private static Singleton singleton;
        int contador;

    //Con el constructor privado , evito las instancias con el new.
    private Singleton() {
    }

    //Devuelve una instancia de la clase.
    public static Singleton getInstance(){
        // El if no nos deja crear una nueva instancia.
        if (singleton == null)
            singleton = new Singleton();

        return singleton;
    }
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
