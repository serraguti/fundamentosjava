package fundamentos;

import clases.Matematicas;
import java.util.Scanner;

public class Class29UsoMatematicas {

    //QUE DESEAMOS HACER AQUI???
    //PROBAR LA SUMA DE NUMEROS
    //COMO DESEAMOS EJECUTAR, NECESITAMOS UN main()
    public static void main(String[] args) {
        //.toUpperCase(): Objeto String
        //.sumarNumeros(): Objeto Matematicas
        //DESDE AQUI, TENEMOS MUCHAS POSIBILIDADES
        //PODEMOS SUMAR, DOBLE, POTENCIA...
        //QUIERO MOSTRAR UN MENU AL USUARIO Y QUE SELECCIONE
        //ENTRE LAS OPCIONES QUE DESEE.
        Scanner teclado = new Scanner(System.in);

        Matematicas mates = new Matematicas();
        //MOSTRAMOS EL MENU DE MATES
        mates.menuMatematicas();
        //CAPTURAMOS LA OPCION QUE EL USUARIO DECIDA
        String dato = teclado.nextLine();
        int opcion = Integer.parseInt(dato);
        if (opcion == 1) {
            int suma = mates.sumarNumeros(7, 7);
            System.out.println("Suma: " + suma);
        } else if (opcion == 2) {
            int doble = mates.getDoble(88);
            System.out.println("Doble: " + doble);
        } else if (opcion == 3) {
            double potencia = mates.getPotencia(4, 3);
            System.out.println("Potencia: " + potencia);
        }
        System.out.println("Fin de programa");
        //BUSCA EN GOOGLE DOCUMENTAR CON JAVADOC
    }
}
