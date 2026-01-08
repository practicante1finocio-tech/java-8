package com.finocio.java8.defaultstatic;

public class Main {
    public static void main(String[] args) {

        ClienteBaseDeDatos clienteBaseDeDatos1 = new ClienteMariadb();
        ClienteBaseDeDatos clienteBaseDeDatos2 = new ClienteMySQL();

        clienteBaseDeDatos1.conectar();
        clienteBaseDeDatos2.conectar();

        ClienteBaseDeDatos.nombreSistema();

    }
}
