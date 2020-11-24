package fundamentos;

import java.util.Scanner;

public class Class06Condicionales {

    public static void main(String[] args) {
        //CREAREMOS SCANNER PARA PEDIR DATO AL USUARIO
        Scanner teclado = new Scanner(System.in);
        //ESCRIBIMOS UN MENSAJE PARA PEDIR UN DATO
        System.out.println("Introduzca un número");
        //LEEMOS EL DATO QUE NOS HA PROPORCIONADO
        //EL USUARIO

        String dato = teclado.nextLine();

        //EVALUAR SI UN NUMERO ES POSITIVO O NEGATIVO
        int numero = Integer.parseInt(dato);
        int resultado = (numero - ((numero / 23) * 23));
        System.out.println("Resultado: " + resultado);
        if (numero > 0) {
            //ESTE CODIGO ES POSITIVO
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }
        //LO MISMO, PERO AHORA SI ES POSITIVO
        //NEGATIVO O ZERO
        if (numero > 0) {
            //CONDICION POSITIVO
            System.out.println("Positivo");
        } else if (numero == 0) {
            //CONDICION ZERO
            System.out.println("Cero");
        } else {
            //CONDICION NEGATIVO
            System.out.println("Negativo");
        }
    }
}
