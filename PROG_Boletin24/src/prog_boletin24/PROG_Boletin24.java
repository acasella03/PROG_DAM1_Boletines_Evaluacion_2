/*Realiza un programa para levar o mantemento dunha librería. Para iso :
    1. Realiza un diagrama de clases que reflicta as relación entre as clases  e logo implementa o programa tendo en conta :
Cada libro de levar : título , autor , ISBN (String ) , prezo , e  numero de unidades.
O programa debe :
    • engadir libros
    • vender ( borrar ) libros 
        ◦ amosar  os libros que temos  ( Os libros deben estar ordenados polo campo titulo )
    • dar de baixa os libros con numero de unidades =0
    • consultar un libro determinado
Nos métodos vender, amosar, baixas e consultar debes comprobar que o array recibido non é null. No caso contrario lanza una excepción.
Para a clase aplicación utiliza un paquete e para as demais outro paquete.
Na aplicación do programa utiliza un menú con todas as opción .

*/
package prog_boletin24;

import com.angi.Libros.Libro;
import com.angi.Libros.Metodos;
import com.angi.datos.PedirDatos;
import java.util.ArrayList;

public class PROG_Boletin24 {

    public static void main(String[] args) {
       ArrayList<Libro> ListaLibros = new ArrayList<>();
        Metodos obj = new Metodos();
        //para que haga siempre lo mismo ponemos un bucle
        int opcion;
        do{
        
        //hacemos menu
        opcion =PedirDatos.pedirEntero("***MENU*** \n\n 1---> Añadir libro \n 2---> Vender \n 3---> Ordenar \n 4---> Mostrar \n 5---> Baja a libros con unidades en cero \n 6---> Consultar un libro determinado \n\n Teclea una opcion de las anteriores");
        switch (opcion){
            case 1: obj.añadirLibro(ListaLibros);
                    break;
                    
            case 2: obj.borrarLibroPorIsbn(ListaLibros);
                    break;
                    
            case 3: obj.ordenar(ListaLibros);
                    break;
                
            case 4: obj.mostrar(ListaLibros);
                    break;
                    
            case 5: obj.borrarLibroPorUnidad(ListaLibros);
                    break;
            
            case 6: obj.buscarLibroDeterminado(ListaLibros);
                    break;
                    
            default: System.out.println("Opcion incorrecta");
                    break;
        }
        
        }while (opcion<=5); 
    }
    
}
