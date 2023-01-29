/* Boletin 21:
4. Realiza un programa que calcule a letra do NIF. Para eso fai o seguinte :
    • Divide o nº do DNI entre 23, sen sacar decimais, e anota o resto da división.
    • Mira na táboa asociada o resto.( exemplo: nº 1  R )
A ->3	B 11	C 20	D 9   E 22	F 7	G 4	H 18	J 13	K 21	L 19
M 5	N 12	P 8	Q 16	R 1	S 15	T 0	V 17	W 2	X 10	Y 6
Z 14. 
*/
package prog_boletin21_4;

import com.angi.datos.PedirDatos;

public class PROG_Boletin21_4 {

    public static void main(String[] args) {
        int numeroDni= PedirDatos.pedirEntero("Intoduce número del DNI: ");
        Dni dni=new Dni(numeroDni);
        System.out.println("La letra del DNI es: "+dni.calculoLetraDni());
        
    }
    
}
