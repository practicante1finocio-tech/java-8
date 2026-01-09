package com.finocio.java8.exercises;

/*
 * =========================
 * BLOQUE: DATE & TIME API
 * =========================
 *
 * La API java.time es inmutable, clara y segura.
 * Reemplaza a Date y Calendar.
 */

/*
 * ENUNCIADO
 * Calcular cuántos días faltan para una fecha futura
 * usando la nueva API de fecha y hora.
 */

import java.time.LocalDate;
import java.time.Period;

public class Exercise06 {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate targetDate = LocalDate.of(2026, 1, 1);

        Period period = Period.between(today, targetDate);

        System.out.println("Days until target date: " + period.getDays());
    }
}

/*
 * EXPLICACIÓN DEL EJERCICIO
 *
 * - LocalDate representa una fecha sin zona horaria.
 * - Period calcula diferencias en años, meses y días.
 * - Las clases son inmutables y thread-safe.
 */
