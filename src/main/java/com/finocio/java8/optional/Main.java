package com.finocio.java8.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        // Primer método estático de optional
        // ofNullable, transforma un null en vacio. (puede recibir un valor o un null)

        Optional<String> stringNull = Optional.ofNullable(null);

        if (stringNull.isEmpty()) {
            System.out.println("El valor esta vacio.");
        }

        // Aqui nunca va a entrar porque el valor nunca puede ser nulo por ofNullable
        if (stringNull == null) {
            System.out.println("El valor es null.");
        }

        // Segundo método estático de optional
        // of recibe un valor

        Optional<String> cadena = Optional.of("Jaico"); // No permite null

        if (cadena.isEmpty()) {
            System.out.println("El valor esta vacio.");
        }else {
            System.out.println("Tiene un valor.");
        }

        // Tercer método estático de optional
        // empty para devolver un valor vacio

        Optional<String> cadenaVacia = Optional.empty(); //

        if (cadenaVacia.isEmpty()) {
            System.out.println("El valor esta vacio.");
        }else {
            System.out.println("Tiene un valor.");
        }
    }
}

