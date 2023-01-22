package prog_boletin20_2;

public class Gato extends Felino implements IPuedeNadar {

    @Override
    public void nadar() {
        System.out.println("Los gatos pueden nadar");
    }
}
