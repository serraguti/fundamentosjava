package fundamentos;

import java.util.Scanner;

public class Class14AccionesNumeros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número");
        String dato = teclado.nextLine();
        int numero = Integer.parseInt(dato);
        System.out.println("Introduzca acción: Sumar o Multiplicar (S|M)");
        String accion = teclado.nextLine();
        int valor = 0;
        //NO SABEMOS CUANDO EL USUARIO VA A ESCRIBIR
        //EL VALOR -1.  ES UN while
        while (numero != -1) {
            System.out.println("Ha introducido el número: " + numero);
            //DEBEMOS AVERIGUAR SI MULTIPLICAMOS (M) O SUMAMOS (S)
            if (accion.equals("S") == true) {
                //QUEREMOS SUMAR
                valor += numero;
                System.out.println("La suma es " + valor);
            } else if (accion.equals("M") == true) {
                //MULTIPLICAMOS
                valor = valor * numero;
                System.out.println("La multiplicación es " + valor);
            }
            //PEDIMOS DE NUEVO EL NUMERO AL USUARIO
            //HASTA QUE NOS DE EL -1
            System.out.println("Introduzca un número: ");
            //REUTILIZAMOS LA VARIABLE DATO PARA ALMACENAR OTRO VALOR
            dato = teclado.nextLine();
            numero = Integer.parseInt(dato);
            //PEDIMOS DE NUEVO LA ACCION
            System.out.println("Introduzca acción: Sumar (S) o multiplicar (M)");
            accion = teclado.nextLine();
        }
        System.out.println("Fin de programa");
    }
}
