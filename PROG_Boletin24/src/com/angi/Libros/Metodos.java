package com.angi.Libros;

import com.angi.datos.PedirDatos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Metodos {

    public ArrayList<Libro> añadirLibro(ArrayList<Libro> lista) {
        Libro libro = new Libro(PedirDatos.pedirDatos("Escribe título:"), PedirDatos.pedirDatos("Escribe autor:"), PedirDatos.pedirDatos("Escribe ISBN:"), PedirDatos.pedirFloat("Escribe precio:"),PedirDatos.pedirEntero("Indica número de unidades:"));
        lista.add(libro);
        return lista;
    }

    public boolean buscarLibro(ArrayList<Libro> lista) {

        String isbnBuscar = PedirDatos.pedirDatos("Introduce el ISBN a buscar:");
        boolean encontrado = false; //no se encontró

        for (Libro elemento : lista) {
            if (isbnBuscar.equalsIgnoreCase(elemento.getIsbn())) {
                System.out.println("El título del libro: " + elemento.getTitulo());
                encontrado = true;
            }
        }
        if (encontrado = false) {
            System.out.println("Ese libro no esta en la librería");
        }

        return encontrado;
    }

    public void borrarLibroPorIsbn(ArrayList<Libro> lista) {
        boolean encontrado = buscarLibro(lista);

        if (encontrado = true) {//es decir, si está
            String isbnBuscar = PedirDatos.pedirDatos("Introduce el ISBN del libro a borrar");
            Iterator it = lista.iterator();
            Libro libro;

            while (it.hasNext()) {
                libro = (Libro) it.next();
                if (libro.getIsbn().equalsIgnoreCase(isbnBuscar)) {
                    it.remove();
                }
            }
        }

    }

    public void ordenar(ArrayList<Libro> lista) {
        Collections.sort(lista);
    }
    
    public void mostrar(ArrayList<Libro> lista) {
        //la primera forma de mostrar es simplemente con un sout
        System.out.println(lista);
    }

    public void borrarLibroPorUnidad(ArrayList<Libro> lista) {
        int encontrado = 0;

        for (Libro elemento : lista) {
            if (elemento.getNumeroUnidades() == 0) {
                Iterator it = lista.iterator();
                Libro libro;

                while (it.hasNext()) {
                    libro = (Libro) it.next();
                    if (libro.getNumeroUnidades() == 0) {
                        it.remove();
                    }
                }
                encontrado = 1;
            }
        }
        if (encontrado == 0) {
            System.out.println("No hay libro con cero unidades");
        }
    }
}
