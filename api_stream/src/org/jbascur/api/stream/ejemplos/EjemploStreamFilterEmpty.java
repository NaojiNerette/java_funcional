package org.jbascur.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {
    public static void main(String[] args) {

        long count = Stream
                .of("Pedro Perez", "", "", "Pedro Pereira", "")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();

        System.out.println("count = "+ count);
    }
}
