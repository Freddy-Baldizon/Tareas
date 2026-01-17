import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = "";
        System.out.println("Ingrese una palabra para saber el primer o ultimo caracter");
        word = sc.nextLine();
        System.out.println("La primera letra es: " + word.charAt(0)
                 + "\nla ultima letra es: " + word.charAt(word.length() -1));
    }
}
