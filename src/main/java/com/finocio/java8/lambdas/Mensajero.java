package com.finocio.java8.lambdas;

@FunctionalInterface
public interface Mensajero {
    public void emitirMensaje(String nombre, int edad);
}