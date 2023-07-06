package org.jbascur.api.stream.ejemplos;

import org.jbascur.api.stream.ejemplos.models.Factura;
import org.jbascur.api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("Pedro", "Perez");
        Usuario u2 = new Usuario("John", "Doe");

        u1.addFactura(new Factura("Compras tecnologicas"));
        u1.addFactura(new Factura("Compras muebles"));

        u2.addFactura(new Factura("Bicicleta"));
        u2.addFactura(new Factura("Notebook gamer"));

        List<Usuario> usuarios = Arrays.asList(u1, u2);
        usuarios.stream()
                .flatMap(u -> u.getFacturas().stream())
                .forEach(f -> System.out.println(f.getDescripcion()
                        .concat(" : cliente ")
                        .concat(f.getUsuario().toString())));


    }
}
