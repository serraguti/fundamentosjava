package fundamentos;

import java.util.ArrayList;
import java.util.Scanner;

public class Class28NumerosArrayList {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //NECESITAMOS UNA COLECCION PARA GUARDAR TODOS LOS NUMEROS
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("Introduzca números hasta escribir -1");
        //QUEREMOS PEDIR AL USUARIO NUMEROS HASTA QUE PONGA -1
        int numero = 0;
//        do {
//            System.out.println("Introduzca un número");
//            String datonumero = teclado.nextLine();
//            numero = Integer.parseInt(datonumero);
//            numeros.add(numero);
//        } while (numero != -1);
        System.out.println("Introduzca un número");
        String datonumero = teclado.nextLine();
        numero = Integer.parseInt(datonumero);
        while (numero != -1) {
            numeros.add(numero);
            System.out.println("Introduzca un número");
            datonumero = teclado.nextLine();
            numero = Integer.parseInt(datonumero);
        }
        System.out.println("Números almacenados: " + numeros.size());
        double suma = 0;
        double media;
        //RECORREMOS TODOS LOS ELEMENTOS DE LA COLECCION
        for (int num : numeros) {
            suma += num;
            System.out.println(num);
        }
        media = suma / numeros.size();
        System.out.println("La suma es " + suma);
        System.out.println("La media es " + media);
        System.out.println("Fin del programa");
    }
}
