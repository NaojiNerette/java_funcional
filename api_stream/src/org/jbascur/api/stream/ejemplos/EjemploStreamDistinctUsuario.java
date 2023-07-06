package org.jbascur.api.stream.ejemplos;

import org.jbascur.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamDistinctUsuario {
    public static void main(String[] args) {



        Stream<Usuario> nombres2 = Stream
                .of("Pedro Perez", "Juan Gonzalez", "Diego Tapia", "Pedro Pereira", "Pedro Perez")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct();

        nombres2.forEach(System.out::println);
    }
}
