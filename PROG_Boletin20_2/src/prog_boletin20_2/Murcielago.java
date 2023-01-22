package prog_boletin20_2;

public class Murcielago extends Mamiferos implements IPuedeVolar {

    @Override
    public void caminar() {
        System.out.println("El murciélago es un mamífero que puede caminar");
    }

    @Override
    public void volar() {
        System.out.println("El murciélago es un mámifero que puede volar");
    }
}
