package fundamentos;

import java.util.Scanner;

public class Class15Collatz {

    public static void main(String[] args) {
        //CONJETURA COLLATZ
        //Teoria: Todo número positivo siempre llegará a ser 1
        // Si el número es PAR: Dividimos entre 2
        // Si el número es IMPAR: Multiplicamos * 3 y sumamos 1
        //Ejemplo: 6, 3, 10, 5, 16, 8, 4, 2, 1
        //Operador del Resto en JAVA: % -->  16%2 == 0  PAR
        Scanner teclado = new Scanner(System.in);
        //MENSAJE PARA PEDIR UN NUMERO
        System.out.println("Introduzca un número: ");
        //CAPTURAMOS EL VALOR QUE HA INTRODUCIDO EL USUARIO
        String dato = teclado.nextLine();
        //CONVERTIMOS EL DATO A NUMERO
        int numero = Integer.parseInt(dato);
        //COMPROBAMOS SI EL NUMERO ES POSITIVO
        if (numero > 0) {
            while (numero != 1) {
                if (numero % 2 == 0) {
                    //PAR
                    numero = numero / 2;
                } else {
                    //IMPAR
                    numero = numero * 3 + 1;
                }
                System.out.println(numero);
            }
        } else {
            System.out.println("El número debe ser POSITIVO");
        }
        System.out.println("Fin de programa ");
    }
}
