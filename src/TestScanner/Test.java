package TestScanner;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test {

    private static final Scanner sc = new Scanner(System.in);

    public static void bonjour() {
        System.out.println("Bonjour !");
        System.out.println("Comment t'appelle-tu ?");
        String name = sc.nextLine();
        if (name == null){
            System.out.println("tu n'as pas de Prenom?");
            bonjour();
        }
        name = name.toLowerCase();
        if (name.equals("surget")){
            System.out.println("c'est ton nom de famille ? moi je prefer ton prenom");
        }
        System.out.println("Bonjour " + name + " je suis content de te parler !");

    }

    public static void scannerNbI() {
        // Press Alt+Entrée with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        // Press Maj+F10 or click the green arrow button in the gutter to run the code.
        int nbDeI;
        System.out.println("Combien veux-tu de i ?");
        nbDeI = sc.nextInt();
        for (int i = 1; i <= nbDeI; i++) {

            // Press Maj+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.print("i = " + i);
            if (i != nbDeI) {
                System.out.print(", ");
            } else {
                System.out.println(". ");
            }
        }
    }

    public static String getNationalityWithLastName(String name){
        StringBuilder probalitity = new StringBuilder("Ton nom de famille (");
        probalitity.append(name.toUpperCase());
        probalitity.append(")");

        return probalitity.toString();
    }
}
