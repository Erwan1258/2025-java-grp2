// Classe Main pour tester les objets
public class Main {
    public static void main(String[] args) {
        // Création des objets
        Transport voiture = new Voiture();
        Transport avion = new Avion();

        // Appel de la méthode deplacer()
        voiture.deplacer();
        avion.deplacer();
    }
}
