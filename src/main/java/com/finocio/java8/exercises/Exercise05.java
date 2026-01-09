package com.finocio.java8.exercises;

/*
 * =========================
 * BLOQUE: COMPLETABLEFUTURE
 * =========================
 *
 * CompletableFuture permite ejecutar tareas asíncronas
 * y encadenar acciones sin bloquear el hilo principal.
 */

/*
 * ENUNCIADO
 * Ejecutar una tarea asíncrona que simule una operación
 * costosa y mostrar el resultado al finalizar.
 */

import java.util.concurrent.CompletableFuture;

public class Exercise05 {

    public static void main(String[] args) {

        CompletableFuture<String> future =
                CompletableFuture.supplyAsync(() -> {
                    simulateDelay();
                    return "Async result";
                });

        future.thenAccept(System.out::println).join();
    }

    private static void simulateDelay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

/*
 * EXPLICACIÓN DEL EJERCICIO
 *
 * - supplyAsync() ejecuta la tarea en otro hilo.
 * - thenAccept() define qué hacer con el resultado.
 * - join() espera sin lanzar checked exceptions.
 *
 * Este modelo permite crear flujos asíncronos legibles.
 */
