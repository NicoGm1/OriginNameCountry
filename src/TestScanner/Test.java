package TestScanner;

import Service.Dump;
import Service.NationalizeApiService;
import lombok.*;

import java.util.Scanner;
@Getter
@Setter
public class Test {

    private static final Scanner sc = new Scanner(System.in);

    public static void bonjour() {
        System.out.println("Bonjour !");
        System.out.println("J'ai decouvert quelque chose de super !");
        System.out.println("Regarde ! Donne moi un nom de famille :");
        String name = sc.nextLine();
        if (name.isEmpty()){
            System.out.println("tu n'as pas de nom ? =)");
            return;
        }
        name = name.toLowerCase();
        System.out.println(NationalizeApiService.getInfoFromName(name));
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
