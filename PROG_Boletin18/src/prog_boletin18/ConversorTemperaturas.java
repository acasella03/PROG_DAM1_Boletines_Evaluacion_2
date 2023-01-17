package prog_boletin18;

public class ConversorTemperaturas {

    public final float GC = 80;

    public float centigradosAFahrenheit(float gradosCentigrados) throws TemperaturaErradaExcepcion {
        if (gradosCentigrados < GC) {
            throw new TemperaturaErradaExcepcion("La temperatura no puede ser menor a 80 ºC");
        } else {
            float resultado = (gradosCentigrados * 1.8f) + 32;
            System.out.println("Fahrenheit= " + resultado);
            return resultado;
        }
    }

    public void centigradosaReamur(float gradosCentigrados) throws TemperaturaErradaExcepcion {
        if (gradosCentigrados < GC) {
            throw new TemperaturaErradaExcepcion("La temperatura no puede ser menor a 80 ºC");
        } else {
            System.out.println("Reamur= " + gradosCentigrados * 0.8f);

        }
    }
}
