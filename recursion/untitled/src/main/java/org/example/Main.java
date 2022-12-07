package org.example;

import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args){
        System.out.println(sumaRecursiva(5));

//        recursionPorCola(5);

//        recursionPorCabeza(5);

        System.out.println(sumaFunciona(5));
    }

    // Funcion sumaRecursiva
    public static int sumaRecursiva(int numero){
        // Siempre tengo que tener un bloque de control sino se va a ejecutar infinita veces
        if (numero == 1){
            return 1;
        }
        return numero + sumaRecursiva(numero - 1);
    }

    //En estos ejemplos vemos como trabaja con los numeros dependiendo donde se hace el llamado al metodo recursivo
    public static void recursionPorCola(int numero){
        if(numero == 0 ){
            return ;
        }
        System.out.println(numero);
        recursionPorCola(numero - 1);
    }

    public static void recursionPorCabeza(int numero){
        if(numero == 0 ){
            return ;
        }
        recursionPorCabeza(numero - 1);
        System.out.println(numero);
    }

    public static int sumaFunciona(int numero){
        // el rangeClosed lo que hace es darnos los numeros del 1 hasta la cantidad que queramos
        return IntStream.rangeClosed(1,numero)
                //El reduce lo que va a hacer es va a ir sumando a + b
                 .reduce(0,(a,b)-> a + b);
    }

}