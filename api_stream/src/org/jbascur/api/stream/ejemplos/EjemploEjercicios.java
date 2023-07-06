package org.jbascur.api.stream.ejemplos;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploEjercicios {
    public static void main(String[] args) {

        String cadena = "hola mundo como esta el mundo , lindo mundo";

        long conteo = Arrays.stream(cadena.split(" "))
                .map(w -> w.toUpperCase())
                .filter(w -> w.equalsIgnoreCase("mundo"))
                .count();

        System.out.println("Cantidad palabras mundo: " + conteo);
    }
}
