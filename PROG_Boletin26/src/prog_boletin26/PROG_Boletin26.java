/*
Deseñar a Clase Xenérica Operacións, coa seguinte funcionalidade: 
    •  Calcular o elemento mínimo dunha lista ; 
    •  Calcular o elemento máximo dunha lista; 
    •  Buscar un Obxecto na lista, devolvendo a posición da primeira aparición do Obxecto  ou -1 se non existe. 
( TODOS OS MÉTODOS RECIBEN COMO PARAMETRO O ARRAY OU A COLECCION)

    Ademais, deséñese unha aplicación que use a Clase Operacións para unha lista  de Integer 



 Exercicio 2.

 Engádase á clase Operacións un método  xenérico que borre a primeira aparición  dun obxecto dado, devolvendo o obxecto eliminado da lista ou null se non se atopa.
*/
package prog_boletin26;

import java.util.ArrayList;

public class PROG_Boletin26 {

    public static void main(String[] args) {
        Operaciones<Integer>lista=new Operaciones<>();
        ArrayList<Integer>lista1=new ArrayList<>();
        lista.insertar(8, lista1);
        lista.insertar(1, lista1);
        lista.insertar(5, lista1);
        lista.insertar(15, lista1);
        lista.insertar(20, lista1);
        
        lista.mostrar(lista1);
        lista.minimoLista(lista1);
        lista.maximoLista(lista1);
        lista.buscar(5, lista1);
        lista.eliminar(8, lista1);
        lista.mostrar(lista1);
        
        
        
    }
    
}
