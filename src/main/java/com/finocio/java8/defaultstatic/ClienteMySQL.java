package com.finocio.java8.defaultstatic;

public class ClienteMySQL implements ClienteBaseDeDatos {

    @Override
    public void conectar() {
        System.out.println("Estas conectado a una base de datos MySQL");
    }
}
