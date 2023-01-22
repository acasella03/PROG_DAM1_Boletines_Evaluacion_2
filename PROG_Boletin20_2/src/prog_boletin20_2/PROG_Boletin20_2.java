/*Agregue ao exercicio anterior:
        a interface IPodeVoar
       Agregue a superclase Aves. Desta clase :
    •  Herda a clase Avestruz (ave que só camiña)
    •  Herda a clase Papagaio (ave que camiña e voa)
       Herde a clase Morcego (é un mamífero que voa e camiña)
       Crea a clase Felino (é un mamifero que camiña e pode nadar)
       Modifique a clase Gato (é un Felino) 
       Crea a clase Tigre
        ◦ Completa o diagrama de clases anterior
        ◦ Codifica un programa cunha clase aplicación  que reflicta todo este feito
*/
package prog_boletin20_2;

public class PROG_Boletin20_2 {

    public static void main(String[] args) {
        Avestruz ave1=new Avestruz();
        ave1.caminar();
        
        Papagayo ave2=new Papagayo();
        ave2.caminar();
        ave2.volar();
        
        Mamiferos mamifero=new Mamiferos();
        mamifero.caminar();
        
        Murcielago murci=new Murcielago();
        murci.caminar();
        murci.volar();
        
        Felino felino=new Felino();
        felino.caminar();
        felino.nadar();
        
        Gato gato=new Gato();
        System.out.println("El gato es un felino y: ");
        gato.caminar();
        gato.nadar();
        
        Tigre tigre=new Tigre();
        tigre.caminar();
        tigre.nadar();
    }
    
}
