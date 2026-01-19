import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "";
        System.out.println("Ingrese una contraseña de al menors 8 caracter y una mayuscula");
        password = sc.nextLine();
        boolean tieneMayuscula = false;
        for(int i = 0; i< password.length();i++){
           if (Character.isUpperCase(password.charAt(i))) {
                tieneMayuscula = true;
           }
        }

        if (password.length() >= 8 && tieneMayuscula ) {
            System.out.println("Contraseña correcta");
        }else{
            System.out.println("Contraseña incorrecta");
        }

    }
}
