import java.util.Scanner;

public class ask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("entrez votre nom : " );
        String nom = scanner.nextLine();

        
        
        System.out.print("entrez votre age : " );
        int age = 0 ;
        if (scanner.hasNext) {
            
        }


        scanner.close();
        System.out.println(" Bonjour " + nom + " ! Vous avez " + age + "ans");
        


        if (age > 18) {
            System.out.println("vous etes majeure ! " );
        }
        else
        {
            System.out.println("vous etes mineurer ! " );
        }

        


    }
    
}
