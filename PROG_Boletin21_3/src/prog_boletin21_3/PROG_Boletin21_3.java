/* Boletin 21:
3. Modifica o programa anterior e engadelle un array cos nomes dos alumnos 
    • Visualiza a nota dun alumno determinado
    • Visualiza unha lista co nome dos alumnos aprobados.
    • Fai unha lista ordenada por orden crecente de notas
    • Visualiza a nota dun alumno determinado que pides por teclado
 */
package prog_boletin21_3;

import com.angi.datos.ArrayUtils;
import com.angi.datos.PedirDatos;

public class PROG_Boletin21_3 {

    public static void main(String[] args) {
        Notas notalum = new Notas();
        notalum.crearArrayInt();

        int indiceAlumno = notalum.buscarAlumno("ana");
        if (indiceAlumno < 0) {
            System.out.println("El alumno no existe");
        } else {
            String nombreAlumno = notalum.alumnos[indiceAlumno];
            int notaAlumno = notalum.notas[indiceAlumno];
            System.out.println("La nota de " + nombreAlumno + " es: " + notaAlumno);
        }

        /*
        int indiceAlumno=ArrayUtils.buscar(notalum.alumnos, alumnoBuscar);
        if (indiceAlumno < 0) {
            System.out.println("El alumno no existe");
        } else {
            String nombreAlumno = notalum.alumnos[indiceAlumno];
            int notaAlumno = notalum.notas[indiceAlumno];
            System.out.println("La nota de "+nombreAlumno+" es: "+notaAlumno);
        }*/
        notalum.mostrarNombresAprobados();

        System.out.println("Notas ordenadas:");
        notalum.ordenarNotas();

        String alumnoBuscar = PedirDatos.pedirDatos("Escribe nombre del alumno a buscar");
        notalum.imprimirNotaDeUnAlumno(alumnoBuscar);

    }

}
