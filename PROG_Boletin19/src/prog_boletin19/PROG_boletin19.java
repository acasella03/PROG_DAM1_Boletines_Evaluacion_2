/*
 *  A) Crear a interface IPodeCantar , unha interface moi simple que só posúe un método cantar ( ).
 *  B) Crear a clase Persoa que implemente o interface IPodeCantar e que cando cante fágao coas notas musicais.
 *  C) Crear a clase Canario e Galo que implemente o interface IPodeCantar e que mostre como cantan
 *  D) Fai un diagrama de clases 
 *  E) Realice o programa que faga cantar a un canario e un tenor. 
*/
package prog_boletin19;

public class PROG_boletin19 {

    public static void main(String[] args) {
        Canario cantocanario=new Canario();
        cantocanario.cantar();
        
        Persona tenor=new Persona();
        System.out.println("El tenor canta: ");
        tenor.cantar();
    }
    
}
