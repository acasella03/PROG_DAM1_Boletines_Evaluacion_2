/*
Carga un array  de tipo int, cas notas no módulo de programación ,dos 30 alumnos da clase de DAM .
    •  Visualiza o numero de aprobados e o de suspensos  .
    •  Calcula e visualiza a nota media da clase
    • Visualiza a nota mais alta .
*/
package prog_boletin21_2;

public class PROG_Boletin21_2 {

    public static void main(String[] args) {
        Notas nota=new Notas();
        
        
        int[] aux=nota.crearArrayInt();
        
        nota.mostrarArray(aux);
        nota.mostrarMedia(aux);
        nota.notaMasAlta(aux);
    }
    
}
