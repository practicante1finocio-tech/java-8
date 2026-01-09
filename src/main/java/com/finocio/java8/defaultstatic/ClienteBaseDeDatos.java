package com.finocio.java8.defaultstatic;

public interface ClienteBaseDeDatos {

    default void conectar() {
        System.out.println("Te has conectado a la base de datos");
    }

    static void nombreSistema() {
        System.out.println("Nuestro sistema es JAVA");
    }
}
