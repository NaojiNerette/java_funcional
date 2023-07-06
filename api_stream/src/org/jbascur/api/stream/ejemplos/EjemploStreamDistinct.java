package org.jbascur.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamDistinct {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Pedro Perez", "Juan Gonzalez", "Diego Tapia", "Pedro Pereira",
                        "Pedro Perez", "Juan Gonzalez",  "Juan Gonzalez",  "Juan Gonzalez")
                .distinct();

        nombres.forEach(System.out::println);

    }
}
