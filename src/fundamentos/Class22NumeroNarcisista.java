package fundamentos;

import java.util.Scanner;

public class Class22NumeroNarcisista {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número ");
        String narcisista = teclado.nextLine();
        int suma = 0;
        int longitud = narcisista.length();
        for (int i = 0; i < narcisista.length(); i++) {
            char caracter = narcisista.charAt(i);
            String letra = String.valueOf(caracter);
            int numero = Integer.parseInt(letra);
            double potencia = Math.pow(numero, longitud);
            suma += potencia;
        }
        if (suma == Integer.parseInt(narcisista)) {
            System.out.println("El número " + narcisista + " es NARCISISTA");
        } else {
            System.out.println("El número " + narcisista + " NO es narcisista");
        }
    }
}
