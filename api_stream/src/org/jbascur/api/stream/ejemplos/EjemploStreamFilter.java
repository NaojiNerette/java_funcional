package org.jbascur.api.stream.ejemplos;

import org.jbascur.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilter {
    public static void main(String[] args) {



        Stream<Usuario> nombres2 = Stream
                .of("Pedro Perez", "Juan Gonzalez", "Diego Tapia", "Pedro Pereira")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pedro"))
                .peek(u -> System.out.println(u.getNombre() +" "+u.getApellido()));

        List<Usuario> lista2 = nombres2.collect(Collectors.toList());
        lista2.forEach(System.out::println);

    }
}
