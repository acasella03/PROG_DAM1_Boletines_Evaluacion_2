package prog_boletin22;

import com.angi.datos.PedirDatos;

public class Futbol {
    private String nombreEquipo;
    private int gol;

    public int[][] crear() {
        int[][] goles = new int[2][3];
        for (int i = 0; i < 2; i++) {
            String []nombreEquipo={new String ("celta"), new String ("bilbao")};
            for (int j = 0; j < 3; j++) {
                goles[i][j] = PedirDatos.pedirEntero("Teclea goles: ");
                
            }

        }
        return goles;
    }
    
    public void ver(int[][] goles) {
        
        for (int i = 0; i < goles.length; i++) {
            System.out.print("|");  //para la estética
            System.out.println(String []nombreEquipo);
            for (int j = 0; j < goles[i].length; j++) {
                System.out.print(goles[i][j] + "  ");

            }
            System.out.print("|\n");    //para la estética
        }
    }
}
