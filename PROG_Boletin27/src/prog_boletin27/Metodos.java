package prog_boletin27;

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
            fich.println(new Libros("Peter Pan", "aaa",5.5f, 1));
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
        String[] aux = new String[2];
        try {
            sc = new Scanner(fichero);
            while (sc.hasNextLine()) {
                aux = sc.nextLine().split(", ");
                lista.add(new Libros(aux[0], Integer.parseInt(aux[1])));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se puede leer el fichero");
        } finally {
            sc.close();
        }
        for (Libros alum :lista) {
            System.out.println(alum);
        }
    }
}
