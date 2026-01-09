package com.finocio.java8.lambdas;

public class Main {
    public static void main(String[] args) {

        Mensajero lambdaMsje = (nombre, edad) -> {
            System.out.println("Hola desde lambda " + nombre);
            System.out.println("Tu edad es: " + edad);
        };
        lambdaMsje.emitirMensaje("Jaico", 34);
    }
}
