package org.jbascur.api.stream.ejemplos;

import org.jbascur.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {
    public static void main(String[] args) {



        Stream<Usuario> nombres2 = Stream
                .of("Pedro Perez", "Juan Gonzalez", "Diego Tapia", "Pedro Pereira")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pedro"))
                .peek(u -> System.out.println(u.getNombre() +" "+u.getApellido()));

        Optional<Usuario> usuario = nombres2.findFirst();
        //System.out.println(usuario.orElse(new Usuario("John", "Doe")));
        //System.out.println(usuario.orElseGet(() -> new Usuario("John", "Doe")));
        if(usuario.isPresent()) {
            System.out.println(usuario.get());
        } else {
            System.out.println("no se encontró el objeto!");
        }
    }
}
