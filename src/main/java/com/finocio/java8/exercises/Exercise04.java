package com.finocio.java8.exercises;

/*
 * =========================
 * BLOQUE: DEFAULT & STATIC METHODS
 * =========================
 *
 * Java 8 permite definir métodos con implementación dentro de interfaces
 * usando métodos default o static.
 *
 * - default methods: permiten agregar comportamiento común sin romper
 *   implementaciones existentes.
 * - static methods: se pueden llamar sin instanciar la interfaz.
 */

/*
 * ENUNCIADO
 * Crear una interfaz con métodos default y static, y usarla desde
 * una clase para demostrar su funcionamiento.
 */

public class Exercise04 {

    // Interfaz definida dentro de la misma clase para simplificar
    interface Logger {

        // Método default: se hereda automáticamente
        default void log(String message) {
            System.out.println("LOG: " + message);
        }

        // Método static: se llama desde la interfaz directamente
        static void staticLog(String message) {
            System.out.println("STATIC LOG: " + message);
        }
    }

    // Clase que implementa Logger
    static class ConsoleLogger implements Logger {
        // No necesita sobrescribir log() porque ya es default
    }

    public static void main(String[] args) {
        ConsoleLogger logger = new ConsoleLogger();

        // Usando método default
        logger.log("Hello from default method");

        // Usando método static
        Logger.staticLog("Hello from static method");
    }
}

/*
 * EXPLICACIÓN DEL EJERCICIO
 *
 * - ConsoleLogger implementa Logger y hereda log() automáticamente.
 * - La llamada logger.log(...) usa el método default.
 * - Logger.staticLog(...) llama al método static directamente desde la interfaz.
 */
