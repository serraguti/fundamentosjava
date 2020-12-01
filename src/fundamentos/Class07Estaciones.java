package fundamentos;

import java.util.Scanner;

public class Class07Estaciones {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número para estación (1-4)");
        String dato = teclado.nextLine();
        //DEBEMOS CONVERTIR EL DATO String en int
        int estacion = Integer.parseInt(dato);
        if (estacion == 1) {
            System.out.println("OTOÑO");
        } else if (estacion == 2) {
            System.out.println("INVIERNO");
        } else if (estacion == 3) {
            System.out.println("PRIMAVERA");
        } else if (estacion == 4) {
            System.out.println("VERANO");
        } else {
            System.out.println("Opción incorrecta");
        }
    }
}
