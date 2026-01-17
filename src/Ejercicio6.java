import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = "";
        int count = 0;
        System.out.println("Ingrese una palabra para la cantidad de vocales");
        word = sc.nextLine();

        for(int i = 0; i < word.length(); i ++){
            char letter = word.toLowerCase().charAt(i);

            if (letter == 'a' || letter == 'e' || letter == 'o' || letter == 'u'||letter == 'i' ) {
                count++;
                System.out.println(letter);
            }
        }
        System.out.println("Cantidad de vocales: " + count);
    }
}
