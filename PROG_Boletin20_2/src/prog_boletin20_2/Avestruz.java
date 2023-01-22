package prog_boletin20_2;

public class Avestruz extends Aves implements IPuedeCaminar {

    @Override
    public void caminar() {
        System.out.println("El avestruz es un ave que puede caminar");
    }
    
}
