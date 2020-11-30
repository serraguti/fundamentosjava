package fundamentos;

import java.util.Scanner;

public class Class16NumerosPares {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int inicio, fin;
        System.out.println("Introduzca un inicio: ");
        String datoinicio = teclado.nextLine();
        System.out.println("Introduzca un final: ");
        String datofin = teclado.nextLine();
        //CONVERTIMOS INICIO Y FIN A NUMEROS
        inicio = Integer.parseInt(datoinicio);
        fin = Integer.parseInt(datofin);
        if (inicio < fin) {
            //PODEMOS HACER EL BUCLE
            //PREGUNTAMOS AL USUARIO QUE DESEA VER
            System.out.println("¿Que desea ver Pares (p) o Impares (i)?");
            String respuesta = teclado.nextLine();
            //COMO SABEMOS CUANDO COMENZAMOS Y FINALIZAMOS, ES
            //UN BUCLE CONTADOR (For)
            for (int i = inicio; i <= fin; i++) {
                //SI EL USUARIO DESEA PARES...
                if (respuesta.equals("p") == true) {
                    if (i % 2 == 0) {
                        //TENEMOS LOS PARES
                        System.out.println(i);
                    }
                } else {
                    if (i % 2 == 1) {
                        System.out.println(i);
                    }
                }
            }
        } else {
            System.out.println("El número inicial " + inicio
                    + " debe ser menor al número final: " + fin);
        }
        System.out.println("Fin de programa ");
    }
}
