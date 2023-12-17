import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Main.scannerNbI();

}


public static void scannerNbI (){
    // Press Alt+Entrée with your caret at the highlighted text to see how
    // IntelliJ IDEA suggests fixing it.
    System.out.println("Hello and welcome!");
    // Press Maj+F10 or click the green arrow button in the gutter to run the code.
    int nbDeI;
    System.out.println("Combien veux-tu de i ?");
    Scanner scanner = new Scanner(System.in);
    nbDeI = scanner.nextInt();
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

public static void bonjour(){
    System.out.println("Bonjour !");
    System.out.println("Comment t'appelle-tu ?");
    Scanner scanner = new Scanner(System.in);
}
}