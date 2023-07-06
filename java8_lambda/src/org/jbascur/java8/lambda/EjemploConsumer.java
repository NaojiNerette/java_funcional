package org.jbascur.java8.lambda;

import org.jbascur.java8.lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {

        Consumer<Date> consumidor = (Date fecha) -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };
        consumidor.accept(new Date());

        BiConsumer<String, Integer> consumidorBi = (String nombre, Integer edad) -> {
            System.out.println(nombre + ", tiene " + edad + " años!");
        };
        consumidorBi.accept("Joan", 36);

        Consumer<String> consumidor2 = System.out::println;
        consumidor2.accept("Hola mundo lambda");

        List<String> nombres = Arrays.asList("pedro", "juan", "diego");
        nombres.forEach(consumidor2);

        Supplier<Usuario> creaUsuario = Usuario::new;
        Usuario usuario = creaUsuario.get();

        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;

        asignarNombre.accept(usuario, "JOAN");
        System.out.println("Nombre usuario: "+ usuario.getNombre());

        Supplier<String> proveedor  = () -> {
            return "Hola mundo en lambda supplier";
        };
        System.out.println(proveedor.get());
    }
}
