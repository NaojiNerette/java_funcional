package org.jbascur.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduce {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Pedro Perez", "Juan Gonzalez", "Diego Tapia", "Pedro Pereira",
                        "Pedro Perez", "Juan Gonzalez",  "Juan Gonzalez",  "Juan Gonzalez")
                .distinct();

        String resultado = nombres.reduce("", (a, b) -> a+", "+b);
        System.out.println("resultado = " + resultado);

    }
}
