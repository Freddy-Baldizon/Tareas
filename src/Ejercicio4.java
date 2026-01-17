import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = "";
        System.out.println("Ingrese una palabra para convertirlo a mayuscula y minuscula");
        word = sc.nextLine();

        System.out.println("La palabra original es: " +word 
            +"\n En minuscula es: " + word.toLowerCase() + "\n En mayuscula: "
            + word.toUpperCase());
    }
}
