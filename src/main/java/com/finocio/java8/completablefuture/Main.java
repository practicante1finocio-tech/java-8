package com.finocio.java8.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {

        CompletableFuture<String> completableFuture1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "El hilo1 ha terminado";
        });

        CompletableFuture<String> completableFuture2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "El hilo2 ha terminado";
        });

        try {
            CompletableFuture<String> combinado = completableFuture1.thenCombine(completableFuture2, (resultado1, resultado2) -> {
                return resultado1 + " y " + resultado2;
            });
            String resultado = combinado.get();
            System.out.println(resultado);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
