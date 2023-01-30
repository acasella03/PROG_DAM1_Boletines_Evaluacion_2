/*
A seguinte táboa recolle lós goles marcados polos 20 equipos de 1ª  división en cada unha das 36 xornadas. 

        Equipo/xornada    X1   X2     X3 ……
        Celta              3    4      2
        Bilbao             1    2      1 
        Malaga             3    0      1

Pídese: 
    1- Gravar e imprimir a táboa. 

    2-  Obter unha listaxe dos equipos por orde de menor n° de goles na liga. 

    3-  Indicar o equipo que marca máis goles en cada xornada. 

    4-  Que equipo e en que xornada se rexistran máis goles? 

    5-  Consultas por equipo e xornada indicando o n° de goles. 

 */
package prog_boletin22;

public class PROG_Boletin22 {

    public static void main(String[] args) {
        Futbol gol=new Futbol();
        int [][] aux;
        aux=gol.crear();
        
        gol.ver(aux);
    }
    
}
