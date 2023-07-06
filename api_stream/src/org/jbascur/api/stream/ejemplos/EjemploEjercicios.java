package org.jbascur.api.stream.ejemplos;

import java.util.Arrays;
import java.util.LongSummaryStatistics;
import java.util.function.Predicate;
import java.util.stream.LongStream;

import org.jbascur.api.stream.ejemplos.models.Aritmetica;
import org.jbascur.api.stream.ejemplos.models.Calculadora;
import org.jbascur.api.stream.ejemplos.models.FuncionesTexto;

public class EjemploEjercicios {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        /** Ejemplo funcion de texto */

        String cadena = "hola mundo como esta el mundo , lindo mundo";
        FuncionesTexto contarPalabraRepetida = (a, b) -> {
                return Arrays.stream(a.split(" "))
                .map(w -> w.toUpperCase())
                .filter(w -> w.equalsIgnoreCase(b))
                .count();
        };

        LongStream calculos = Arrays.stream(cadena.split(" "))
                //.peek(System.out::println)
                .mapToLong(palabra -> {
                    return calc.conteoTexto(cadena, palabra, contarPalabraRepetida);
                });

        LongSummaryStatistics stats = calculos.summaryStatistics();
        System.out.println("stats max= " + stats.getMax());
        System.out.println("stats.getCount() = " + stats.getCount());

        /** Ejem*/
    }
}
