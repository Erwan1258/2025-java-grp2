// Classe Avion qui implémente l'interface Transport
public class Avion implements Transport {
    @Override
    public void deplacer() {
        System.out.println("L'avion vole dans les airs.");
    }
}
