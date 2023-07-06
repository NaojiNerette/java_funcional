package org.jbascur.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFuntion {
    public static void main(String[] args) {

        Function<String, String> f1 = param -> "Hola que tal " + param;
        String resultado = f1.apply("pepe");
        System.out.println(resultado);

        Function<String, String> f2 = String::toUpperCase;
        System.out.println(f2.apply("pepe"));

        BiFunction<String, String, String> f3 = (String a, String b) -> a.toUpperCase().concat(b.toUpperCase());
        String r2 = f3.apply("pedro", "juan");
        System.out.println(r2);

        BiFunction<String, String, Integer> f4 = String::compareTo; //(String a, String b) -> a.compareTo(b);
        System.out.println(f4.apply("pepe", "pepe"));

        BiFunction<String, String, String> f5 = String::concat; //(String a, String b) -> a.compareTo(b);
        System.out.println(f5.apply("pepe", "pepe"));
    }
}
