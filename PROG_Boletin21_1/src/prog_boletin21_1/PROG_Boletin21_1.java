/*Boletin 21:
1. Realiza un programa que cree un array chamado “numeros” con 6 numeros 
aleatorios dun rango de 1 a 50 .Seguidamente visualiza o array o revés 
( 0 primeiro elemento visualizaráse  o último e asi sucesivamente )
*/
package prog_boletin21_1;

public class PROG_Boletin21_1 {

    
    public static void main(String[] args) {
        
        Numeros num=new Numeros();
        
        int[] resultado;
        
        resultado= num.crearArrayInt();
        num.mostrarArray(resultado);
    }
    
}
