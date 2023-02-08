package PROG_Boletin23;

public class Metodos {

    public int length(String nombre) {

        int numLetras = nombre.length();
        return numLetras;

    }

    public String toUpperCase(String nombre) {

        String nomMayusculas = nombre.toUpperCase();
        return nomMayusculas;
    }

    public String toLowerCase(String nombre) {

        String nomMinuscula = nombre.toLowerCase();
        return nomMinuscula;

    }
    
    public int toCompare(String nombre){
        
        int compara = nombre.compareTo("Nabuconodosor");
        return compara;
        
    }
    
    public int toCompareToIgnoreCase(String nombre){
        
        int compara2 = nombre.compareToIgnoreCase("Nabuconodosor");
        return compara2;
        
    }
    
    
    public char[] toCharArray(String nombre){
        char[] aCaracteres = nombre.toCharArray();
        return aCaracteres;
        
        
    }
    
    public String subString (String valor){
        String cortar = valor.substring(0, 4);
        return cortar;
        
        
    }
}
