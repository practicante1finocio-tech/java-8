package com.finocio.java8.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate hoy = LocalDate.now();
        System.out.println("Hoy es: " + hoy);
        LocalDate nacimiento = LocalDate.of(1991, 7, 10);
        System.out.println("Fecha de nacimiento es: " + nacimiento);

        LocalTime horaActual = LocalTime.now();
        System.out.println("Hora actual: " + horaActual);
        LocalTime almuerzo = LocalTime.of(12, 0);
        System.out.println("Hora de almuerzo: " + almuerzo);

        LocalDateTime ahora = LocalDateTime.now();
        System.out.println("Fecha y hora actual: " + ahora);
        LocalDateTime cita = LocalDateTime.of(2026, 1, 9, 12, 5);
        System.out.println("Fecha y hora de cita: " + cita);

        ZonedDateTime Madrid = ZonedDateTime.now(ZoneId.of("Europe/Madrid"));
        System.out.println("Fecha y hora de Madrid: " + Madrid);

        Instant instantAhora = Instant.now();
        System.out.println("Instante actual:"  + instantAhora);

        Period edad = Period.between(nacimiento, hoy);
        System.out.println("Edad:"+ edad.getYears() + " años, " + edad.getMonths() +  ", " + edad.getDays() + " días");

        LocalTime inicio = LocalTime.of(12, 0);
        LocalTime fin = LocalTime.of(14, 30);
        Duration duracion = Duration.between(inicio, fin);
        System.out.println("Duración:"+ duracion.toHours() + " horas" + duracion.toMinutes() + " minutos" + duracion.toSeconds() + " segundos");
    }
}
