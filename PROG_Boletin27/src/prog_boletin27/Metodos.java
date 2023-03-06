package prog_boletin27;

import com.angi.datos.PedirDatos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {
    FileWriter out = null;
    PrintWriter fich = null;
    Libros libro;
    Scanner sc;

    public void escribirPalabras(File fichero) {
        try {
            out = new FileWriter(fichero);
            fich = new PrintWriter(out);
            fich.println(new Libros(PedirDatos.pedirDatos("Escribe nombre del libro: "), PedirDatos.pedirDatos("Escribe el autor del libro: "),PedirDatos.pedirFloat("Escribe el precio del libro: "), PedirDatos.pedirEntero("Escribe las unidades existentes: ")));
        } catch (IOException ex) {
            System.out.println("Error de escritura" + ex.getMessage());
        } finally {
            fich.close();
        }
    }
    
    public void agregarPalabras(File fichero) {
        try {
            out = new FileWriter(fichero,true);
            fich = new PrintWriter(out);
        } catch (IOException ex) {
            System.out.println("Error de escritura" + ex.getMessage());
        } finally {
            fich.close();
        }
    }
    
    public void leerObjeto(File fichero) {
        ArrayList<Libros> lista = new ArrayList<>();
        String[] aux;
        try {
            sc = new Scanner(fichero);
            while (sc.hasNextLine()) {
                aux = sc.nextLine().split(", ");
                lista.add(new Libros(aux[0], aux[1], Float.parseFloat(aux[2]), Integer.parseInt(aux[3])));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se puede leer el fichero");
        } finally {
            sc.close();
        }
        for (Libros lib :lista) {
            System.out.println(lib);
        }
    }
    
}
