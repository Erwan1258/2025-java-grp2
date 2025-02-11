// Classe Voiture qui implémente l'interface Transport
public class Voiture implements Transport {
    @Override
    public void deplacer() {
        System.out.println("La voiture se déplace sur la route.");
    }
}
