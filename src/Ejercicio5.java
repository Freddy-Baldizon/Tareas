import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = "";
        String phrase = "";
        System.out.println("Ingrese una frase");
        phrase = sc.nextLine();
        System.out.println("Ingrese una palabra para saber si esta la frase");
        word = sc.nextLine();

        System.out.println("La palabra contiene o no la frase: " + phrase.toLowerCase().contains(word));
    }
}
