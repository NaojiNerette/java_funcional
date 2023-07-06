package org.jbascur.api.stream.ejemplos.models;

public class Calculadora {
    public long conteo (String cadena, String palabra, Aritmetica lambda){
        return lambda.operacion(cadena, palabra);
    }
}
