package com.finocio.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();
        nombres.add("Jaico");
        nombres.add("Ana");
        nombres.add("Pepe");

        // Ejemplo solo con operación terminal (obligatorio)

        nombres.stream().forEach(System.out::println);

        System.out.println();

        // Ejemplo con operaciones intermedias (opcional)

        List<String> paises = Arrays.asList(
                "España", "Argentina", "Alemania", "Portugal",
                "Chile", "Mexico", "Francia", "Colombia", "Italia");

        paises.stream()
                .filter(pais -> pais.toLowerCase().contains("a"))
                .forEach(System.out::println);
    }
}
