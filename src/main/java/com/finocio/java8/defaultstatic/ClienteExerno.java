package com.finocio.java8.defaultstatic;

public interface ClienteExerno {

    default void desconectar() {
        System.out.println("Estas desconectado del sistema externo");
    }
}
