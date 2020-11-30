package fundamentos;

import java.util.Scanner;

public class Class11MayorTresNumeros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2, numero3;
        int mayor, menor, intermedio;
        //PEDIMOS LOS DATOS STRING Al usuario
        System.out.println("Introduzca número 1: ");
        String dato1 = teclado.nextLine();
        System.out.println("Introduzca número 2: ");
        String dato2 = teclado.nextLine();
        System.out.println("Introduzca número 3 : ");
        String dato3 = teclado.nextLine();
        //CONVERTIMOS LOS TEXTOS A NUMEROS
        numero1 = Integer.parseInt(dato1);
        numero2 = Integer.parseInt(dato2);
        numero3 = Integer.parseInt(dato3);
        //EMPEZAMOS A PREGUNTAR POR EL MAYOR
        if (numero1 >= numero2 && numero1 >= numero3) {
            mayor = numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            mayor = numero2;
        } else {
            mayor = numero3;
        }

        //EMPEZAMOS A PREGUNTAR POR EL MENOR
        if (numero1 <= numero2 && numero1 <= numero3) {
            menor = numero1;
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            menor = numero2;
        } else {
            menor = numero3;
        }
        //TAMBIEN PODRIAMOS PREGUNTAR POR EL INTERMEDIO
        //VAMOS A REALIZAR LA ACCION DE FORMA MATEMATICA
        //SUMAMOS LOS TRES NUMEROS Y RESTAMOS EL MAYOR Y EL MENOR
        //Y TENDREMOS EL INTERMEDIO
        int suma = (numero1 + numero2 + numero3);
        intermedio = suma - mayor - menor;
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Intermedio: " + intermedio);
    }
}
