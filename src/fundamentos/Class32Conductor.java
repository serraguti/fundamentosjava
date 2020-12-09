package fundamentos;

import java.util.Scanner;
import vehiculos.Coche;

public class Class32Conductor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Coche car = new Coche();
        car.setMarca("PONTIAC");
        car.setColor("Gris");
        int opcion = -1;
        while (opcion != 0) {
            //MENU PARA EL CONDUCTOR
            System.out.println("0.- Salir");
            System.out.println("1.- Acelerar");
            System.out.println("2.- Descripción");
            String dato = teclado.nextLine();
            opcion = Integer.parseInt(dato);
            if (opcion == 1) {
                car.acelerar();
            } else if (opcion == 2) {
                System.out.println("Descripción " + car.getMarca());
            }
        }
        System.out.println("Fin de programa");
    }
}
