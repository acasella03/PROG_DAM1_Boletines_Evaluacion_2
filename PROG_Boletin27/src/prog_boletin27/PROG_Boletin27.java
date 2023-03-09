/*
Supoñer que queredes facer o mantemento dun ficheiro dunha librería .  Dos libros imos considerar 4 atributos :
    • Nome do libro
    • Autor
    • Precio
    • unidades
     Para facer o mantemento  utiliza un menú cos seguintes puntos :
    a) engadir: engade un novo libro ao noso ficheiro
    b) consultar: dado o título dun libro visualizar o seu precio . se o libro non o temos na librería visualizamos unha mensaxe
    c) amosar: amosa  todos os datos do ficheiro
    d) borrar: borra os libros que teñan 0 unidades
    e) modificar: modifica o precio dun libro determinado
*/

package prog_boletin27;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PROG_Boletin27 {

    public static void main(String[] args) {
        Metodos objeto = new Metodos();
        File f=new File ("libreria.txt");
        ArrayList<Libros> lista=objeto.leerObjeto(f);
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("***MENU***\n1---> AÑADIR LIBRO \n2---> CONSULTAR \n3---> MOSTRAR \n4--->BORRAR \n5--->MODIFICAR \n6--->SALIR \nTeclea opción"));
            switch (opcion) {
                case 1:
                    objeto.agregarPalabras(f);
                    lista=objeto.leerObjeto(f);
                    break;
                case 2:
                    objeto.buscarPorTitulo(lista);
                    break;
                case 3:
                    objeto.mostrar(lista);
                    break;
                case 4:
                    ArrayList<Libros> filtrada=objeto.borrar(lista);
                    objeto.reemplazarFichero(f, filtrada);
                    lista=objeto.leerObjeto(f);
                    break;
                case 5:
                    objeto.modificarPrecio(lista);
                    objeto.reemplazarFichero(f, lista);
                    lista=objeto.leerObjeto(f);
                    break;
                default:
                    break;       
            }

        } while (opcion <= 5);
    }
    
}
