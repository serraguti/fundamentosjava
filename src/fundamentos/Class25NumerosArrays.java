package fundamentos;

import java.util.Scanner;

public class Class25NumerosArrays {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cantidad de números a almacenar?");
        String datocantidad = teclado.nextLine();
        int cantidad = Integer.parseInt(datocantidad);
        //CREAMOS UN ARRAY CON LA CANTIDAD INDICADA
        int[] numeros = new int[cantidad];
        //HACEMOS UN BUCLE PARA IR PIDIENDO CADA NUMERO
        //Y GUARDARLO DENTRO DEL ARRAY
        for (int i = 0; i < numeros.length; i++) {
            //PEDIMOS CADA NUMERO INDIVIDUAL AL USUARIO
            System.out.println("Introduzca el número " + (i + 1));
            //RECUPERAMOS EL DATO DEL NUMERO
            String datonumero = teclado.nextLine();
            //CONVERTIMOS EL TEXTO A NUMERO
            int num = Integer.parseInt(datonumero);
            //ALMACENAMOS EN CADA POSICION DEL ARRAY EL NUMERO
            numeros[i] = num;
        }
        System.out.println("Números introducidos correctamente");
        //QUEREMOS MOSTRAR TODOS LOS NUMEROS E IR SUMANDOLOS
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            //RECUPERAMOS CADA NUMERO DEL ARRAY POR POSICION i
            int num = numeros[i];
            //VAMOS SUMANDO CADA NUMERO
            suma += num;
            //MOSTRAMOS CADA NUMERO
            System.out.println(num);
        }
        //MOSTRAR LA SUMA DE LOS NUMEROS
        System.out.println("Suma de los números: " + suma);
        //REALIZAMOS LA MEDIA
        double media = suma / numeros.length;
        System.out.println("Media de los números: " + media);
    }
}
