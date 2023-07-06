package org.jbascur.api.stream.ejemplos;

import org.jbascur.api.stream.ejemplos.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamDistinctUsuarioSum {
    public static void main(String[] args) {

        IntStream nombres = Stream
                .of("Pedro Perez", "Juan Gonzalez", "Diego Tapia", "Pedro Pereira", "Pedro Perez")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct()
                .mapToInt(u -> u.toString().length())
                .peek(System.out::println);

        //nombres.forEach(System.out::println);
        IntSummaryStatistics stats = nombres.summaryStatistics();
        System.out.println("suma = " + stats.getSum());
        System.out.println("max = " + stats.getMax());
        System.out.println("min = " + stats.getMin());
        System.out.println("promedio = " + stats.getAverage());
    }
}
