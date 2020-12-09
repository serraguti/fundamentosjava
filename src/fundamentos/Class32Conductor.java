package fundamentos;

import java.util.Scanner;
import vehiculos.Coche;
import vehiculos.Deportivo;

public class Class32Conductor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //CREAMOS UN NUEVO COCHE
        Deportivo car = new Deportivo("Lamborghini", "Diablo");
        Coche car2 = new Coche();
        car2.setMarca("Pontiac");
        car2.setModelo("Firebird");

        int opcion = -1;
        while (opcion != 0) {
            System.out.println("0.- Salir");
            System.out.println("1.- Arrancar");
            System.out.println("2.- Acelerar");
            System.out.println("3.- Frenar");
            System.out.println("4.- Frenar con presión");
            System.out.println("5.- Ver descripción");
            System.out.println("6.- Turbo");
            System.out.println("Seleccione una opción");
            String dato = teclado.nextLine();
            opcion = Integer.parseInt(dato);
            if (opcion == 1) {
                car.arrancar();
            } else if (opcion == 2) {
                car.acelerar();
            } else if (opcion == 3) {
                car.frenar();
            } else if (opcion == 4) {
                System.out.println("¿Cuanto desea frenar?");
                dato = teclado.nextLine();
                int presion = Integer.parseInt(dato);
                car.frenar(presion);
            } else if (opcion == 5) {
                System.out.println(car.toString());
            } else if (opcion == 6) {
                car.turbo();
            }
        }
        System.out.println("Fin de programa");

    }
}
