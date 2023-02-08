package PROG_Boletin23;

import java.util.Arrays;

public class PROG_Boletin23 {

    public static void main(String[] args) {
        
        String nombre = "Nabuconodosor";
        
        Metodos obj = new Metodos();
        
        System.out.println("El numero de letras es " +obj.length(nombre));
        System.out.println("El nombre en mayusculas " +obj.toUpperCase(nombre));
        System.out.println("El nombre en minusculas es "+obj.toLowerCase(nombre));
        System.out.println("La comparacion es " +obj.toCompare(nombre));
        System.out.println("La comparacion sin tener en cuenta mayus y minus: " +obj.toCompareToIgnoreCase(nombre) );
        System.out.println("El nombre en un array de char: "+Arrays.toString(obj.toCharArray(nombre)));
        System.out.println("El nombre cortado por la C es " +obj.subString(nombre));
        
        
        
       
    }

}
