package prog_boletin20_1;

public class Gato extends Mamiferos implements IPuedeCaminar,IPuedeNadar {

    @Override
    public void nadar() {
        System.out.println("Los gatos pueden nadar");
    }

    @Override
    public void caminar() {
        System.out.println("El gato es un mamífero que puede caminar");
    }
    
}
