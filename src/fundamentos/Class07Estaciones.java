package fundamentos;

import java.util.Scanner;

public class Class07Estaciones {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número para estación (1-4)");
        String dato = teclado.nextLine();
        //DEBEMOS CONVERTIR EL DATO String en int
        int estacion = Integer.parseInt(dato);
        switch (estacion) {
            case 1:
                System.out.println("OTOÑO");
                break;
            case 2:
                System.out.println("INVIERNO");
                break;
            case 3:
                System.out.println("PRIMAVERA");
                break;
            case 4:
                System.out.println("VERANO");
                break;
            default:
                System.out.println("Opción incorrecta (1-4)");
        }
    }
}
