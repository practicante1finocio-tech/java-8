package com.finocio.java8.exercises;

/*
 * =========================
 * BLOQUE: JAVA 8 STREAMS
 * =========================
 *
 * Streams permiten procesar colecciones de datos de forma declarativa.
 * No almacenan datos, sino que describen una secuencia de operaciones
 * que se ejecutan cuando se aplica una operación terminal.
 */

/*
 * ENUNCIADO
 * Dada una lista de números, obtener los números pares,
 * elevarlos al cuadrado y mostrar el resultado.
 */

import java.util.Arrays;
import java.util.List;

public class Exercise02 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        numbers.stream()
                .filter(number -> number % 2 == 0)   // operación intermedia
                .map(number -> number * number)      // operación intermedia
                .forEach(System.out::println);       // operación terminal
    }
}

/*
 * EXPLICACIÓN DEL EJERCICIO
 *
 * - filter() selecciona solo los números pares.
 * - map() transforma cada número en su cuadrado.
 * - forEach() dispara la ejecución del stream.
 *
 * El stream es inmutable: no modifica la lista original.
 * El código es más legible que un bucle tradicional con ifs.
 */
