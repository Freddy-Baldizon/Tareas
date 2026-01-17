import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = "";
        String com = "";
        System.out.println("Ingrese dos palabras para compararlas si son iguales");
        word = sc.nextLine();
        com = sc.nextLine();

        System.out.println(word.equalsIgnoreCase(com));
    }
}
