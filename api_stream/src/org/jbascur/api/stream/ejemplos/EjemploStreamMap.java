package org.jbascur.api.stream.ejemplos;

import org.jbascur.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("pedro", "juan", "diego")
                .map(String::toUpperCase)
                .peek(System.out::println)
                .map(String::toLowerCase);

        List<String> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);
        //nombres.forEach(System.out::println);

        System.out.println("");

        Stream<Usuario> nombres2 = Stream.of("Pedro Perez", "Juan Gonzalez", "Diego Tapia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(u -> System.out.println(u.getNombre() +" "+u.getApellido()))
                .map(usuario -> {
                    String nombre = usuario.getNombre().toUpperCase();
                    String apellido = usuario.getApellido().toUpperCase();
                    usuario.setNombre(nombre);
                    usuario.setApellido(apellido);
                    return usuario;
                });

        List<Usuario> lista2 = nombres2.collect(Collectors.toList());
        lista2.forEach(System.out::println);

    }
}
