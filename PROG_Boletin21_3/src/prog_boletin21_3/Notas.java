package prog_boletin21_3;

import com.angi.datos.PedirDatos;
import java.util.Arrays;

public class Notas {
    int[] notas = new int[3];
    String[] alumnos=new String[3];
    
    public void crearArrayInt() {
        for (int i = 0; i < notas.length; i++) {
            notas[i] = PedirDatos.pedirEntero("Ecribe la nota del alumno: ");
            alumnos[i]= PedirDatos.pedirDatos("Escribe nombre del alumno: ");
        }
    }
    
    public void buscarAlumno(float[] alumnos) {
        int encontrado = 0; //no se encuentra el elemento
        String alumnoBuscar = PedirDatos.pedirDatos("Escribe nombre del alumno");
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnoBuscar == alumnos[i]) {
                System.out.println("El alumno está en la posición " + (i + 1));
                encontrado = 1;
                break;
            }
        }
        if (encontrado == 0) {
            System.out.println("El alumno no está en la lista");
        }
    }
    
    public void mostrarArray(int[] notas) {
        int numAprobados=0;
        int numSuspensos=0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i]>=5){
                numAprobados=numAprobados+1;
            }else{
                numSuspensos=numSuspensos+1;
            }
        
        }
               
        System.out.println("Los aprobados son: "+numAprobados);
        System.out.println("Los suspensos son: "+numSuspensos);
    }
    
    public void mostrarMedia(int[] notas) {
        int contadorAprobado=0;
        int contadorSuspenso=0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i]>=5){
                contadorAprobado=contadorAprobado+notas[i]; //para sacar la media
            }else{
                contadorSuspenso=contadorSuspenso+notas[i];
            }
        
        }
        int media= (contadorAprobado+contadorSuspenso)/notas.length;
                
        System.out.println("La media de la clase es: "+media);
    }
    
    public void notaMasAlta(int[] notas){
        int notaMayor=0;
        for (int i = 0; i < notas.length; i++){
            if(notaMayor<notas[i]){
                notaMayor=notas[i];                
            }
        }
        System.out.println("La nota mayor es: "+notaMayor);
    }
}
