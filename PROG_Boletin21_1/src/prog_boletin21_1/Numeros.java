package prog_boletin21_1;

import com.angi.datos.PedirDatos;
import java.util.Arrays;

public class Numeros {
    
    public int[] crearArrayInt() {
        int[] numeros = new int[6];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = PedirDatos.pedirEntero("Ingresa 6 números comprendidos del 1 al 50: ");
        }
        return numeros;
    }
    
    public void mostrarArray(int[] numeros) {
        Arrays.sort(numeros);
        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.println("posición " + (i+1) + "--> " + numeros[i]);
        }
    }
}
