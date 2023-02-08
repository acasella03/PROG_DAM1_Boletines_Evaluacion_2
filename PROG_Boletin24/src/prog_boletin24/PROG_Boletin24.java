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
        opcion =PedirDatos.pedirEntero("***MENU*** \n\n 1---> Añadir libro \n 2---> Borrar \n 3---> Mostrar \n 4---> Borrar Unidades 0 \n\n Teclea una opcion de las anteriores");
        switch (opcion){
            case 1: obj.añadirLibro(ListaLibros);
                    break;
                    
            case 2: obj.borrarLibroPorIsbn(ListaLibros);
                    break;
                    
            case 3: obj.ordenar(ListaLibros);
                    obj.mostrar(ListaLibros);
                    break;
                    
            case 4: obj.borrarLibroPorUnidad(ListaLibros);
                    break;
                    
            default: System.out.println("Opcion incorrecta");
                    break;
        }
        
        }while (opcion<=4); 
    }
    
}
