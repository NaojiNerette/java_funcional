package org.jbascur.api.stream.ejemplos.models;

public class Calculadora {
    public long conteoTexto (String cadena, String palabra, FuncionesTexto lambda){
        return lambda.operacion(cadena, palabra);
    }

    public long conteoInt (Integer numero, Aritmetica lambda){
        return lambda.operacionInt(numero);
    }
}
