package prog_boletin21_3;

import com.angi.datos.PedirDatos;

public class Notas {

    int[] notas = new int[3];
    String[] alumnos = new String[3];

    public void crearArrayInt() {
        for (int i = 0; i < notas.length; i++) {
            alumnos[i] = PedirDatos.pedirDatos("Escribe nombre del alumno: ");
            notas[i] = PedirDatos.pedirEntero("Ecribe la nota del alumno");
        }
    }

    public int buscarAlumno(String alumnoBuscar) {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnoBuscar.equals(alumnos[i])) {
                return i;
            }
        }
        return -1;
    }

    public void imprimirNotaDeUnAlumno(String alumnoBuscar) {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnoBuscar.equals(alumnos[i])) {
                System.out.println("La nota de " + alumnos[i] + " es: " + notas[i]);
                return;
            }
        }
        System.out.println("El alumno no existe");
    }

    public void mostrarNumeroAprobadosSupensos(int[] notas) {
        int numAprobados = 0;
        int numSuspensos = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                numAprobados = numAprobados + 1;
            } else {
                numSuspensos = numSuspensos + 1;
            }

        }

        System.out.println("Los aprobados son: " + numAprobados);
        System.out.println("Los suspensos son: " + numSuspensos);
    }

    public void mostrarNombresAprobados() {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                System.out.println(alumnos[i] + " está aprobado");
                //System.out.println(String.format("%s está aprobado", alumnos[i]));
            }
        }
    }

    public void mostrarMedia(int[] notas) {
        int contadorAprobado = 0;
        int contadorSuspenso = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                contadorAprobado = contadorAprobado + notas[i]; //para sacar la media
            } else {
                contadorSuspenso = contadorSuspenso + notas[i];
            }

        }
        int media = (contadorAprobado + contadorSuspenso) / notas.length;

        System.out.println("La media de la clase es: " + media);
    }

    public void notaMasAlta(int[] notas) {
        int notaMayor = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notaMayor < notas[i]) {
                notaMayor = notas[i];
            }
        }
        System.out.println("La nota mayor es: " + notaMayor);
    }

    public void ordenarNotas() {
        int aux = 0;
        String auxNombre;

        for (int i = 0; i < notas.length; i++) {
            for (int j = i; j < notas.length; j++) {
                if (notas[i] < notas[j]) {
                    aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;
                    auxNombre = alumnos[i];
                    alumnos[i] = alumnos[j];
                    alumnos[j] = auxNombre;
                }
            }
            System.out.println(alumnos[i] + " "+notas[i]);
        }
    }
}
