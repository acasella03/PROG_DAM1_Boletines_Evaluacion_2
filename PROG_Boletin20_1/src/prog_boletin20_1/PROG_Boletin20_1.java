/*Algúns seres poden camiñar e poden nadar .Estas dúas capacidades son interfaces ( IPodeCamiñar e IPodeNadar). 
 Os mamiferos son animais que poden camiñar ( Mamifero. java).
 O gato é un mamifero que pode nadar e camiñar (Gato. java)
 Un Papagaio pode camiñar pero non pode nadar. 

    • Fai un diagrama de clases que reflicta as clases e interfaces e a relación entre elas.

    • Precisas incluir todolos métodos das interfaces na clase Gato.

    • Codifica un programa de aplicación destes feitos
*/
package prog_boletin20_1;

public class PROG_Boletin20_1 {

    public static void main(String[] args) {
        Mamiferos mamifero=new Mamiferos();
        mamifero.caminar();
        
        Gato gato=new Gato();
        gato.caminar();
        gato.nadar();
        
        Papagayo pajaro=new Papagayo();
        pajaro.caminar();
    }
    
}
