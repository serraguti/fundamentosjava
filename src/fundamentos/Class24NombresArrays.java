package fundamentos;

import java.util.Scanner;

public class Class24NombresArrays {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //VAMOS A PEDIR LA DIMENSION DEL ARRAY
        System.out.println("¿Cuantos nombres desea guardar?");
        String dato = teclado.nextLine();
        int dimension = Integer.parseInt(dato);
        //CREAMOS EL ARRAY CON EL NUMERO DE ELEMENTOS QUE HA
        //INDICADO EL USUARIO
        String[] nombres = new String[dimension];
        //VAMOS A PEDIR TANTOS NOMBRES COMO DIMENSION NOS HA DICHO
        for (int i = 0; i < nombres.length; i++) {
            //PEDIMOS AL USUARIO CADA NOMBRE
            System.out.println("Introduzca el nombre " + (i + 1));
            //ALMACENAMOS EL NOMBRE QUE NOS HAN INDICADO
            String nom = teclado.nextLine();
            //GUARDAMOS CADA NOMBRE EN CADA POSICION i DEL ARRAY
            nombres[i] = nom;
        }
        System.out.println("Nombres introducidos correctamente");
        //MOSTRAMOS TODOS LOS NOMBRES DEL TIRON
        for (int i = 0; i < nombres.length; i++) {
            //RECUPERAMOS CADA NOMBRE DE CADA POSICION i
            String nom = nombres[i];
            //PINTAMOS EL NOMBRE
            System.out.println(nom);
        }
        System.out.println("Fin del programa");
    }
}
