package fundamentos;

import java.util.Scanner;

public class Class13TablaMultiplicar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número");
        String dato = teclado.nextLine();
        int numero = Integer.parseInt(dato);
        for (int i = 1; i <= 10; i++) {
            int multi = numero * i;
            System.out.println(numero + "*" + i + "=" + multi);
        }
        System.out.println("Fin de programa");
        //NECESITAMOS UN CONTADOR HASTA 10
        int contador = 1;
        while (contador <= 10) {
            int resultado = numero * contador;
            System.out.println(numero + "*" + contador + "=" + resultado);
            //INCREMENTAMOS EL CONTADOR
            contador += 1;
        }
    }
}
