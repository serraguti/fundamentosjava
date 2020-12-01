package fundamentos;

import java.util.Scanner;

public class Class21Isbn {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca número ISBN: ");
        String isbn = teclado.nextLine();
        if (isbn.length() != 10) {
            System.out.println("El número ISBN debe tener 10 caracteres");
        } else {
            //NECESITAMOS RECUPERAR CADA NUMERO-LETRA
            //DEL ISBN
            //SUMAR UNAS MULTIPLICACIONES
            int suma = 0;
            for (int i = 0; i < isbn.length(); i++) {
                char caracter = isbn.charAt(i);
                String letra = String.valueOf(caracter);
                int numero = Integer.parseInt(letra);
                //HAY QUE MULTIPLICAR CADA NUMERO POR CADA POSICION
                //LA POSICION EMPIEZA EN 1
                int posicion = i + 1;
                int multi = numero * posicion;
                suma += multi;
            }
            if (suma % 11 == 0) {
                System.out.println("Número ISBN correcto");
            } else {
                System.out.println("Número isbn INCORRECTO!!!");
            }
        }
    }
}
