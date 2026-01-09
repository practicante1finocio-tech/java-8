package com.finocio.java8.exercises;

/*
 * =========================
 * BLOQUE: JAVA 8 OPTIONAL
 * =========================
 *
 * Optional es un contenedor que puede o no contener un valor.
 * Su objetivo es evitar el uso de null y reducir
 * NullPointerException.
 */

/*
 * ENUNCIADO
 * Buscar el email de un usuario y devolver el resultado
 * de forma segura usando Optional.
 */

import java.util.Optional;

public class Exercise03 {

    public static void main(String[] args) {

        Optional<String> email = findEmailByUsername("jaico");

        // Ejecuta la acción solo si el valor está presente
        email.ifPresent(System.out::println);
    }

    private static Optional<String> findEmailByUsername(String username) {
        if ("jaico".equals(username)) {
            return Optional.of("jaico@gmail.com");
        }
        return Optional.empty();
    }
}

/*
 * EXPLICACIÓN DEL EJERCICIO
 *
 * - El método devuelve Optional en lugar de null.
 * - ifPresent() evita comprobaciones manuales de null.
 * - El llamador está obligado a tratar la ausencia de valor.
 *
 * Optional mejora la seguridad y la intención del código.
 */
