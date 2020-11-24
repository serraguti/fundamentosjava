package fundamentos;

import java.util.Scanner;

public class Class05Operaciones {
    public static void main(String[] args) {
        //PEDIR AL USUARIO DATOS POR TECLADO
        //CON UN UNICO TECLADO, PEDIREMOS TODOS
        //LOS DATOS DEL PROGRAMA
        Scanner teclado = new Scanner(System.in);
        //MENSAJE PARA PEDIR NUMERO 1
        System.out.println("Introduzca primer número");
        //CAPTURAMOS EL DATO DEL NUMERO 1
        String dato1 = teclado.nextLine();
        //MENSAJE PARA PEDIR NUMERO 2
        System.out.println("Introduzca segundo número");
        //CAPTURAMOS EL DATO DEL NUMERO 2
        String dato2 = teclado.nextLine();
        //CONVERTIMOS LOS DATOS PEDIDOS A NUMEROS ENTEROS
        int numero1 = Integer.parseInt(dato1);
        int numero2 = Integer.parseInt(dato2);
        //REALIZAMOS LAS OPERACIONES
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        float division = numero1 / numero2;
        int multiplicacion = numero1 * numero2;
        System.out.println("La suma de " + numero1 + " + " + numero2 + " es " + suma);
        System.out.println("La resta de " + numero1 + " - " + numero2 + " es " + resta);
        System.out.println("Multiplicación de " + numero1 + " * " + numero2 + " es " + multiplicacion);
        System.out.println("División de " + numero1 + " / " + numero2 + " es " + division);
    }
}
