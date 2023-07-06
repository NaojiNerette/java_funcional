package org.jbascur.api.stream.ejemplos;

import org.jbascur.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterAnyMatch {
    public static void main(String[] args) {



        boolean existe = Stream
                .of("Pedro Perez", "Juan Gonzalez", "Diego Tapia", "Pedro Pereira")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .anyMatch(u -> u.getId().equals(7));

        System.out.println(existe);
    }
}
