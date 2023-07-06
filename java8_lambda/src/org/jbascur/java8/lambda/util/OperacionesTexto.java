package org.jbascur.java8.lambda.util;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OperacionesTexto {

    public String oLimpiarVacios(String t, UtilText funcion){
      return funcion.operacion(t);
    };

    public String oLimpiarEspacios(String t){
        UtilText f = texto -> texto.replace(" ", "");
        return f.operacion(t);
    };

    public String oLimpiarTabuladores(String t){
        UtilText f = texto -> texto.replaceAll("\\s","");
        return f.operacion(t);
    };

    public String oLimpiarPrincipioYFinal(String t){
        UtilText f = texto -> texto.trim();
        return f.operacion(t);
    };
    public String oLimpiarSoloPrincipio(String t){
        UtilText f = texto -> texto.replaceAll("^\\s", "");
        return f.operacion(t);
    };

    public String oLimpiarSoloFinal(String t){
        UtilText f = texto -> texto.replaceAll("\\s*$", "");
        return f.operacion(t);
    };
/*
    public String oCuentaOcurrencias(String t){
        UtilText f = texto -> {
            String[] palabras = texto.split("\\s+");
            String palabraMasRepetida = palabras[0];
            Integer conteoMayor = 0;

            for (int i = 0; i < palabras.length; i++){
                String palabraActual = palabras[i];
                Integer conteoActual = 0;

                for (int j = 0; j < palabras.length; j++){
                    if (palabraActual.equals(palabras[j])){
                        conteoActual++;

                        if (conteoActual > conteoMayor){
                            conteoMayor = conteoActual;
                            palabraMasRepetida = palabraActual;
                        }
                    }

                }
            }
            return "La palabra más repetida es "+ palabraMasRepetida + ", con "+ conteoMayor +" veces.";
        };
        return f.operacion(t);
    };
*/
    public String oCuentaOcurrencias(String t){

        UtilText f = texto -> {
            String[] arreglo = texto.split("\\s+");

            IntStream conteos =Arrays.stream(arreglo)
                    .map(t1 -> {
                        return Arrays.stream(arreglo)
                                .peek(System.out::println)
                                .filter(t2 -> t2 == t1)
                                .count();
                    })
                    .mapToInt(value -> value.intValue());

            IntSummaryStatistics stats = conteos.summaryStatistics();
            return  String.valueOf(stats.getMax());

        };
        return f.operacion(t);
    };
}
