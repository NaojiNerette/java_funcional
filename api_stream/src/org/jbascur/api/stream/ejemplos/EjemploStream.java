package org.jbascur.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("pedro", "juan", "diego");
        nombres.forEach(System.out::println);

        String[] arr = {"pedro", "juan", "diego"};
        Stream<String> nombres2 = Arrays.stream(arr);
        nombres2.forEach(System.out::println);

        Stream<String> nombres3 = Stream.<String>builder()
                .add("pedro")
                .add("juan")
                .add("diego")
                .build();
        nombres3.forEach(System.out::println);

        List<String> lista = new ArrayList<>();
        lista.add("pedro");
        lista.add("juan");
        lista.add("diego");

        Stream<String> nombres4 = lista.stream();
        nombres4.forEach(System.out::println);

        lista.stream().forEach(System.out::println);
    }
}
