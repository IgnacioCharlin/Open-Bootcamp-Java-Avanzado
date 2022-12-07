package com.example.patroncreaciona.Builder;

//Esta clase se va a dedicar de instanciar el objeto
public class VehiculoBuilder {

   Vehiculo vehiculo;

    public VehiculoBuilder(String marca) {
        vehiculo =  new Vehiculo();
        this.vehiculo.marca = marca;
    }

    public VehiculoBuilder setPuertas(int puertas){
        vehiculo.puertas = puertas;
        // retorna su propia instancia
        return this;
    }

    public VehiculoBuilder setMotor(String motor){
        vehiculo.motor = motor;
        // retorna su propia instancia
        return this;
    }


    public Vehiculo build(){
        return this.vehiculo;
    }
}
