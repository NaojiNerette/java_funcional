package org.jbascur.api.stream.ejemplos;

import java.util.Arrays;
import java.util.function.Predicate;

import org.jbascur.api.stream.ejemplos.models.Aritmetica;
import org.jbascur.api.stream.ejemplos.models.Calculadora;

public class EjemploEjercicios {
    public static void main(String[] args) {

        String cadena = "hola mundo como esta el mundo , lindo mundo";
        Aritmetica contarPalabraRepetida = (a, b) -> {
                return Arrays.stream(a.split(" "))
                .map(w -> w.toUpperCase())
                .filter(w -> w.equalsIgnoreCase(b))
                .count();
        };

        Calculadora calc = new Calculadora();
        calc.conteo(cadena, "mundo", contarPalabraRepetida);

        


    }
}
