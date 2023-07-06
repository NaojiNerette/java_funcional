package org.jbascur.java8.lambda;

import org.jbascur.java8.lambda.util.OperacionesTexto;
import org.jbascur.java8.lambda.util.UtilText;

public class EjemploInterfaceTexto {
    public static void main(String[] args) {

        UtilText limpiarEspacios        = texto -> texto.replace(" ", "");
        UtilText limpiarTabuladores     = texto -> texto.replaceAll("\\s","");
        UtilText limpiarPrincipioYFinal = texto -> texto.trim();
        UtilText limpiarSoloPrincipio   = texto -> texto.replaceAll("^\\s", "");
        UtilText limpiarSoloFinal       = texto -> texto.replaceAll("\\s*$", "");

        String tEjemplo = "  Hola este \t es un saludo \s y  con muchos espacios \n ";

        /** primera implementacion */

        OperacionesTexto op = new OperacionesTexto();
        System.out.println("limpiarEspacios = " + op.oLimpiarVacios(tEjemplo, limpiarEspacios));
        System.out.println("limpiarTabuladores = " + op.oLimpiarVacios(tEjemplo, limpiarTabuladores));
        System.out.println("limpiarSoloPrincipio = " + op.oLimpiarVacios(tEjemplo, limpiarSoloPrincipio));
        System.out.println("limpiarSoloFinal = " + op.oLimpiarVacios(tEjemplo, limpiarSoloFinal));
        System.out.println("limpiarPrincipioYFinal = " + op.oLimpiarVacios(tEjemplo, limpiarPrincipioYFinal));

        /** segunda implementacion */

        System.out.println("==============================================");
        System.out.println("");
        System.out.println("limpiarEspacios = " + op.oLimpiarEspacios(tEjemplo));
        System.out.println("limpiarTabuladores = " + op.oLimpiarTabuladores(tEjemplo));
        System.out.println("limpiarSoloPrincipio = " + op.oLimpiarSoloPrincipio(tEjemplo));
        System.out.println("limpiarSoloFinal = " + op.oLimpiarSoloFinal(tEjemplo));
        System.out.println("limpiarPrincipioYFinal = " + op.oLimpiarPrincipioYFinal(tEjemplo));

        String tEjemplo2 = " Hola este texto tiene mucho contexto aun que no es textos largo aun";

        /** segunda ejercicio */
        System.out.println("==============================================");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Cuenta veces = " + op.oCuentaOcurrencias(tEjemplo2));
    }
}
