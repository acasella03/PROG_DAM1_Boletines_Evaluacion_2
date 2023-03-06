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

import com.angi.datos.PedirDatos;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PROG_Boletin27 {

    public static void main(String[] args) {
        Metodos objeto = new Metodos();
        File f=new File ("libreria.txt");
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("***MENU***\n1---> AÑADIR LIBRO \n2---> CONSULTAR \n3---> MOSTRAR \n4--->BORRAR \n5--->MODIFICAR \nTeclea opción"));
            switch (opcion) {
                case 1:
                    objeto.agregarPalabras(f);
                    break;
                case 2:
                    ArrayList<Libros> lista=objeto.leerObjeto(f);
                    String titulo = PedirDatos.pedirDatos("Escribe el titulo del libro: ");
                    Libros libroEncontrado= objeto.buscar(lista, titulo);
                    if(libroEncontrado==null){
                        JOptionPane.showMessageDialog(null, "El libro no existe.");
                    }else{
                        JOptionPane.showMessageDialog(null, libroEncontrado.getPrecio());
                    }
                    break;
                case 3:
                    objeto.mostrar(f);
                    break;
                case 4:
                    
                    break;
                case 5:
                    
            }

        } while (opcion <= 5);
    }
    
}
