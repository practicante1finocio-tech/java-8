package com.finocio.java8.exercises;

/*
 * =========================
 * BLOQUE: JAVA 8 LAMBDAS
 * =========================
 *
 * Las lambda expressions introducen una forma concisa de representar
 * funciones anónimas. Permiten pasar comportamiento como parámetro
 * y son la base del estilo funcional en Java 8.
 *
 * Se utilizan principalmente junto con interfaces funcionales
 * (interfaces con un solo método abstracto).
 */

/*
 * ENUNCIADO
 * Crear una lista de nombres y filtrar aquellos que empiezan por una
 * letra específica utilizando una lambda expression.
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Exercise01 {

    public static void main(String[] args) {

        // Lista de datos de entrada
        List<String> names = Arrays.asList("Jaico", "Luis", "Antonio", "Maria");

        // Predicate es una interfaz funcional que recibe un valor y devuelve true o false
        Predicate<String> startsWithA = name -> name.startsWith("J");

        // Uso de la lambda dentro de un stream
        names.stream()
                .filter(startsWithA)
                .forEach(System.out::println);
    }
}

/*
 * EXPLICACIÓN DEL EJERCICIO
 *
 * - Se define una lambda que implementa Predicate<String>.
 * - La lambda expresa una condición simple: el nombre empieza por "A".
 * - El stream aplica esa condición con filter().
 * - forEach imprime los elementos que cumplen la condición.
 *
 * Este ejemplo muestra cómo las lambdas eliminan la necesidad
 * de clases anónimas y hacen el código más expresivo y legible.
 */
