package fundamentos;

import java.util.Scanner;

public class Class19SumarNumeros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un dato numérico");
        String datonumero = teclado.nextLine(); //1234
        //TENEMOS QUE RECORRER TODO EL TEXTO datonumero
        //Y SUMAR TODOS SUS CARACTERES
        int suma = 0;
        for (int i = 0; i < datonumero.length(); i++) {
            //CAPTURAMOS CADA CARACTER
            char letra = datonumero.charAt(i);
            //CONVERTIMOS CADA LETRA A NUMERO
            //ESTA CONVERSION NOS RECUPERA EL CODIGO ASCII
            //NO NOS SIRVE ESTA CONVERSION
            // SI LE PASAMOS UN CHAR '1' NOS DEVUELVE 49
            //int numero = letra;
            // SI LE PASAMOS UN STRING "1" NOS DEVUELVE 1
            //CONVERTIMOS EL CHAR A STRING
            String caracter = String.valueOf(letra);
            //CONVERTIMOS STRING A INT
            int numero = Integer.parseInt(caracter);
            //SUMAMOS CADA NUMERO
            suma += numero;
        }
        System.out.println("La suma de " + datonumero + " es: " + suma);
    }
}
