import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = "";
        System.out.println("Ingrese una palabra para saber la cantidad de letras");
        word = sc.nextLine();

        System.out.println("La longitud es de: " + word.length());
    }
}