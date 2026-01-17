Que es una hilera de caracteres?
Una hilera de caracteres es una lista de caracteres que se utiliza
para representar un texto en programación. Cada carácter
representa una letra, un dígito o un símbolo. Las hileras de
caracteres pueden realizar operaciones como la concatenación,
búsqueda, convertir a mayúscula o minúscula y reemplazos. Además, se
pueden utilizar operaciones para unir hileras y obtener las longitudes
con la función length().

Ejemplos:
public class EjemploHilera {
    public static void main(String[] args) {
        String mensaje = "Hola mundo";
        String nombre = "Freddy";
        String saludo = mensaje + ", " + nombre;  //Concatenación de hileras
        System.out.println(saludo); //Muestra el resultado
        System.out.println("Longitud: " + saludo.length()); //Longitud de la hilera
        System.out.println(saludo.toUpperCase()); // convierte en mayúscula
        System.out.println(saludo.toLowerCase()); // convierte en minúscula

    }
}

Diferencias entre una hilera y un caracter:
Un caracter es solamente una letra de un texto, un numero o un simbolo, mientras 
que una hilera es una lista de caracteres que se utiliza para representar un texto
Ejemplo una caracter es una unidad de una palabra como la plabra hola, un caracter
puede ser la h, o, l y la a, mientras que la hilera es la palabra hola ya que es
una lista de caracter. Además, en Java un carácter se representa mediante el tipo de dato char el cual almacena un solo símbolo, mientras que una hilera de caracteres se representa mediante String.

Operaciones que se pueden realizar con una hilera:
>Unir hileras con el operado +.
>Comparar String.
>Convertir mayúscula.
>Longitud de una hilera.
>Convertir minúscula.
>Buscar si un String es parte de un String.
>Reemplazar hileras con hileras.
>Separar String en caracteres.
>Une lista de String con String.

Referencia:
https://www.bing.com/ck/a?!&&p=355cc333db77561f70f6d5ccd6329f2d187f7d2cb47292be18802713477a4bc1JmltdHM9MTc2ODYwODAwMA&ptn=3&ver=2&hsh=4&fclid=15ded262-58eb-6d45-2aca-c42659446c3f&psq=que+es+una+hilera+de+caracteres%3f&u=a1aHR0cHM6Ly9zaXZhbmFoYW1lci5naXRodWIuaW8vcHJpbmNpcGlvcy1pbmZvcm1hdGljYS9wcmVzZW50YWNpb25lcy8xMi1IaWxlcmFzLnBkZg 

https://www.bing.com/ck/a?!&&p=d37139a290fc817ee5762111b64b642d6e281251793759c4ff51bb4072199a92JmltdHM9MTc2ODYwODAwMA&ptn=3&ver=2&hsh=4&fclid=15ded262-58eb-6d45-2aca-c42659446c3f&u=a1aHR0cHM6Ly9hc29jaWFjaW9uYXBuZXMuY29tL2NhZGVuYS1kZS1jYXJhY3RlcmVzLXRvZG8tbG8tcXVlLW5lY2VzaXRhcy1zYWJlci1zb2JyZS1lc3RlLWVsZW1lbnRvLWVzZW5jaWFsLWRlLWxhLXByb2dyYW1hY2lvbi8&ntb=1