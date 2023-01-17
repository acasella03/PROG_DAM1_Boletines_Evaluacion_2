/*Nunha empresa utilizan uns aparellos que traballan a temperaturas expresadas en graos Fharenheit e graos reamur .Para axudalos, decidimos  facer unha aplicación “ conversor de temperaturas”.De xeito que unha persoa teclea a temperatura, en graos centigrados, e o conversor devolvenos a temperatura en graos Fharenheit e Reamur. Pero o aparello non pode traballar con temperaturas < 80 ºC .
    Crea unha aplicación cas seguintes clases :
    • A clase TemperaturaErradaExcepcion  que represente a nosa excepción ( recorda que a temperatura non pode ser < 80 ºC )
    • A clase ConversorTemperaturas . Nesta clase :
    1- Declara unha constante  co valor 80 ºC
    2- Un método centigradosAFharenheit  que reciba unha temperatura, tipo float, en graos centígrados e calcula e retorne o valor correspondente en graos fharenheit 

     º Fharenheir = 9,0 / 5, 0 * centígrados + 32, 4

   Este método non tratará a excepción ( TemperaturaErradaExcepcion ), e, se a temperatura é < 80 º centígrados  lanzará a excepción que será capturada e tratada na clase principal . 

3-Un método centígradosAReamur  que reciba unha temperatura, tipo float, en graos centígrados e calcula e non retorne o valor correspondente en graos Reamur .

     º Reamur = 4,0 / 5,0 * centígrados 

   Este método non tratara a excepción . A lanzará ao método de chamada*/

package prog_boletin18;

import java.util.Scanner;

public class PROG_boletin18 {

    public static void main(String[] args) {
        ConversorTemperaturas grados=new ConversorTemperaturas();
        Scanner temperatura=new Scanner(System.in);
        System.out.println("Teclea una temperatura en grados centígrados");
        float gradosCentig=temperatura.nextFloat();
        try{
            grados.centigradosAFahrenheit(gradosCentig);
            grados.centigradosaReamur(gradosCentig);
        }catch (TemperaturaErradaExcepcion e){
            System.out.println("No puede ser menor a 80ºC");
        }
    }
    
    
    
}
