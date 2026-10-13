
public class Main {

    public static void main(String[] args) {


        PartidoFutbol partido =
                new PartidoFutbol("Argentina", "Francia");


        partido.golLocal();
        partido.golLocal();
        partido.golVisitante();
        partido.golLocal();
        partido.golVisitante();


        System.out.println("RESULTADO FINAL");
        partido.mostrarResultado();
    }
}
