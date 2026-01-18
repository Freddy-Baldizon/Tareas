import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = "";
        String invertir = "";
        System.out.println("Ingrese una palabra para invertirla");
        word = sc.nextLine();

        for (int i = word.length() - 1; i >= 0; i--) {
            invertir += word.charAt(i);
        }
        System.out.println("La palabra invertida es: " + invertir);

       
    }
}
