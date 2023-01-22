package prog_boletin20_2;

public class Felino extends Mamiferos implements IPuedeCaminar,IPuedeNadar {

    @Override
    public void caminar() {
        System.out.println("Los felinos son mamíferos que pueden caminar");
    }

    @Override
    public void nadar() {
        System.out.println("Los felinos son mamíferos que pueden nadar");
    }
    
}
