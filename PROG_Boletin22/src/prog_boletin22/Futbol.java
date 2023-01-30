package prog_boletin22;

import java.util.Arrays;

public class Futbol {
    private Equipo[] equipos= new Equipo[3];

    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;
    }

    @Override
    public String toString() {
        return "Futbol{" + "equipos=" + Arrays.toString(equipos) + '}';
    }
    
    public void mostrarTabla(){
        System.out.print("Equipo/jornada		");
        for (int i = 0; i < equipos[0].getGoles().length; i++) {
            System.out.print("X"+(i+1)+"	");
            
        }
        System.out.println();
        for (int i = 0; i < equipos.length; i++) {
            System.out.print(equipos[i].getNombreEquipo());
            System.out.print("			");
            //System.out.println(Arrays.toString(equipos[i].getGoles()));
            for (int j = 0; j < equipos[i].getGoles().length; j++) {
                System.out.print(equipos[i].getGoles()[j]);
                System.out.print("	");
            }
            System.out.println();
        }
    }
    
}
