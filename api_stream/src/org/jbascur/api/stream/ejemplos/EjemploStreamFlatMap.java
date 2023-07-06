package org.jbascur.api.stream.ejemplos;

import org.jbascur.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFlatMap {
    public static void main(String[] args) {



        Stream<Usuario> nombres = Stream
                .of("Pedro Perez", "Juan Gonzalez", "Diego Tapia", "Pedro Pereira")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .flatMap(u -> {
                    if(u.getNombre().equalsIgnoreCase("Pedro")){
                        return Stream.of(u);
                    }
                    return Stream.empty();
                })
                .peek(u -> System.out.println(u.getNombre() +" "+u.getApellido()));

        //List<Usuario> lista2 = nombres2.collect(Collectors.toList());
        System.out.println(nombres.count());

    }
}
