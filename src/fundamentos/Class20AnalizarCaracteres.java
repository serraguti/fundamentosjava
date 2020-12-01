package fundamentos;

import java.util.Scanner;

public class Class20AnalizarCaracteres {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un texto: ");
        String texto = teclado.nextLine();
        int vocales = 0;
        int otros = 0;
        int suma = 0;
        String letrasvocales = "aeiou";
        String letrasnumeros = "0123456789";
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            String letra = String.valueOf(caracter).toLowerCase(); //"a"
            if (letrasvocales.contains(letra) == true) {
                //TENEMOS UNA VOCAL
                vocales += 1;
            } else if (letrasnumeros.contains(letra) == true) {
                //TENEMOS UN NUMERO
                int num = Integer.parseInt(letra);
                suma += num;
            } else {
                otros++;
            }
//            if (caracter == 'a' || caracter == 'e' || caracter == 'i'
//                    || caracter == 'o' || caracter == 'u') {
//                //es una vocal
//            }
            //PODEMOS CONVERTIR EL CARACTER A STRING
//            if (letra.toLowerCase().equals("a") || letra.toLowerCase().equals("e"))
//            if (letra.equals("a") || letra.equals("e"))
        }
        System.out.println("Número Vocales: " + vocales);
        System.out.println("Suma números: " + suma);
        System.out.println("Otros caracteres: " + otros);
    }
}
