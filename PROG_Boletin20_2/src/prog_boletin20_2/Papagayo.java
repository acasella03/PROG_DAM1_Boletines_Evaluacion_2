package prog_boletin20_2;

public class Papagayo extends Aves implements IPuedeCaminar,IPuedeVolar {

    @Override
    public void caminar() {
        System.out.println("El papagayo es un ave que puede caminar");
    }

    @Override
    public void volar() {
        System.out.println("El papagayo es un ave que puede volar");
    }
    
}
