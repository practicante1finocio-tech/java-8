package com.finocio.java8.defaultstatic;

public class ClienteMariadb implements ClienteBaseDeDatos, ClienteExerno {

    @Override
    public void conectar() {
        System.out.println("Estas conectadoa a una base de datos Maria DB");
    }
}
