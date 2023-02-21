package prog_boletin22;

import com.angi.datos.PedirDatos;
import java.util.Arrays;

public class Futbol {

    private Equipo[] equipos = new Equipo[3];

    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;
    }

    @Override
    public String toString() {
        return "Futbol{" + "equipos=" + Arrays.toString(equipos) + '}';
    }

    public void mostrarTabla() {
        System.out.print("Equipo/jornada		");
        for (int i = 0; i < equipos[0].getGoles().length; i++) {
            System.out.print("X" + (i + 1) + "	");

        }
        System.out.print("Total Goles");
        System.out.println();
        for (int i = 0; i < equipos.length; i++) {
            System.out.print(equipos[i].getNombreEquipo());
            System.out.print("			");
            //System.out.println(Arrays.toString(equipos[i].getGoles()));
            for (int j = 0; j < equipos[i].getGoles().length; j++) {
                System.out.print(equipos[i].getGoles()[j]);
                System.out.print("	");
            }
            System.out.print(equipos[i].getTotalGoles());
            System.out.println();
        }
    }

    public void listaOrdenadaAscendente() {
        System.out.println("La lista ordenada por total de goles por temporada es:");
        for (int i = 0; i < equipos.length - 1; i++) {
            for (int j = i + 1; j < equipos.length; j++) {
                if (equipos[i].getTotalGoles() > equipos[j].getTotalGoles()) {
                    Equipo auxiliarTemporal = equipos[i];
                    equipos[i] = equipos[j];
                    equipos[j] = auxiliarTemporal;
                }

            }
        }
        for (int i = 0; i < equipos.length; i++) {
            System.out.println(equipos[i].getNombreEquipo() + "		" + equipos[i].getTotalGoles());
        }
    }

    public void equipoConMasGolesPorJornada() {
        int cantidadJornadas = equipos[0].getGoles().length;
        for (int i = 0; i < cantidadJornadas; i++) {
            String equipoGoleador = null;
            int golMasAlto = -1;
            for (int j = 0; j < equipos.length; j++) {
                int[] golesDelEquipo = equipos[j].getGoles();
                int golesDelEquipoEnLaJornada = golesDelEquipo[i];
                if (golesDelEquipoEnLaJornada > golMasAlto) {
                    golMasAlto = golesDelEquipoEnLaJornada;
                    equipoGoleador = equipos[j].getNombreEquipo();
                }
            }
            System.out.println("El " + equipoGoleador + " ha hecho más goles en la jornada " + (i + 1) + " con " + golMasAlto + " goles.");
        }
    }

    public void equipoConMasGoles() {
        int cantidadJornadas = equipos[0].getGoles().length;
        String equipoGoleador = null;
        int golMasAlto = -1;
        int jornadaMasAlta=-1;
        for (int i = 0; i < cantidadJornadas; i++) {
            for (int j = 0; j < equipos.length; j++) {
                int[] golesDelEquipo = equipos[j].getGoles();
                int golesDelEquipoEnLaJornada = golesDelEquipo[i];
                if (golesDelEquipoEnLaJornada > golMasAlto) {
                    golMasAlto = golesDelEquipoEnLaJornada;
                    equipoGoleador = equipos[j].getNombreEquipo();
                    jornadaMasAlta=i+1;
                }
            }
        }
        System.out.println("El " + equipoGoleador + " ha hecho más goles con " + golMasAlto + " goles, en la jornada "+jornadaMasAlta);
    }
    
    public void consultaEquipoJornada(){
        String nombreEquipo=PedirDatos.pedirDatos("Escribe nombre del equipo");
        int jornada=PedirDatos.pedirEntero("Escribe el número de la jornada");
        for (int i = 0; i < equipos.length; i++) {
            if(equipos[i].getNombreEquipo().equalsIgnoreCase(nombreEquipo)){
                int[] jornadas=equipos[i].getGoles();
                System.out.println("Los goles del "+nombreEquipo+" en la jornada "+jornada+" fueron: "+jornadas[jornada-1]);
            }
            
        }
        
    }
}
