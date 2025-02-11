<<<<<<< HEAD
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
=======
import  java.util.ArrayList;
import java.util.Scanner;
 public class Main {
     private ArrayList<etudiant> ListE = new ArrayList<etudiant>();

     public static void main(String[] args) {
         System.out.println("Demarrage Ecole ");
         int menu = 0;
         Scanner sc = new Scanner(System.in);
         do {
             Scanner scanner = new Scanner(System.in);
             System.out.println("que viulez vous faire?");
             System.out.println("1.voir la liste");
             System.out.println("2.Ajouter un etudiant");
             System.out.println("3.Supprimer un etudiant");
             System.out.println("0.quitter le programme");
             menu = scanner.nextInt();
             System.out.println(" vous  voulez :" + menu);
         }while (menu != 0);
         sc.close();
     }
>>>>>>> fb99d79 (Ajout de la page d'accueil)
}
