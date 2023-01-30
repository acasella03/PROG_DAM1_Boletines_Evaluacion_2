package prog_boletin22;

import com.angi.datos.PedirDatos;
import java.util.Arrays;

public class Equipo {

    private String nombreEquipo;
    private int[] goles = new int[3];

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public Equipo(String nombreEquipo, int[] goles) {
        this.nombreEquipo = nombreEquipo;
        this.goles = goles;
    }
    
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int[] getGoles() {
        return goles;
    }

    public void setGoles(int[] goles) {
        this.goles = goles;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombreEquipo=" + nombreEquipo + ", goles=" + Arrays.toString(goles) + '}';
    }

}
