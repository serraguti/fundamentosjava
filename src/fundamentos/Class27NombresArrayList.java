package fundamentos;

import java.util.ArrayList;
import java.util.Scanner;

public class Class27NombresArrayList {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuantos nombres desea almacenar?");
        String datonumero = teclado.nextLine();
        int cantidad = Integer.parseInt(datonumero);
        //CREAMOS UNA COLECCION PARA ALMACENAR NOMBRES
        ArrayList<String> nombres = new ArrayList<>();
        //LA UNICA FORMA DE HACER QUE NOMBRES TENGA MAS
        //CAPACIDAD ES AÑADIR ELEMENTOS
        //VAMOS A REALIZAR UN BUCLE QUE IRA DESDE 1 HASTA
        //EL NUMERO DE ELEMENTOS QUE EL USUARIO QUIERA ALMACENAR
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Introduzca el nombre " + i);
            String nombre = teclado.nextLine();
            //ALMACENAMOS EL NOMBRE EN EL CONJUNTO (COLECCION)
            nombres.add(nombre);
        }
        System.out.println("Nombres introducidos correctamente");
        for (String nom : nombres) {
            System.out.println(nom);
        }
        System.out.println("Fin de programa");
    }
}
