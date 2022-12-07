package com.example.patroncreaciona.ProtoType;

//Cloneable sirve para clonar clases
public class Coche implements  Cloneable{

    public String marca;
    public String modelo;
    int puertas;

    public Coche(){}


    //Este metodo clona y le pasa los estados a su clone
    /*public Coche clonar(){
        Coche cocheClone = new Coche();
        cocheClone.marca = marca;
        cocheClone.modelo = modelo;
        cocheClone.puertas = puertas;

        return cocheClone;
    }
    */

    //Utilizamos la interface Cloneable
    public Coche clonar() throws CloneNotSupportedException {
        return (Coche) this.clone();
    }
}
