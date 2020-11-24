package fundamentos;

import java.util.Scanner;

public class Class04NumeroDoble {
    //metodo main
    // psvm + TAB
    public static void main(String[] args) {
        //PEDIREMOS UN NUMERO AL USUARIO Y
        //MOSTRAREMOS SU DOBLE
        // Clase Scanner CONTROL + SPACE
        Scanner teclado = new Scanner(System.in);
        //ESCRIBIMOS EL MENSAJE DE LO QUE NECESITAMOS
        // sout + TAB
        System.out.println("Introduzca un número: ");
        //CAPTURAMOS EL DATO QUE NOS HA DADO EL USUARIO
        String dato = teclado.nextLine();
        //QUE TIPO DE DATO QUEREMOS??? (numero) int
        //CONVERTIMOS EL STRING dato A int
        int numero = Integer.parseInt(dato);
        //DECLARAMOS UNA VARIABLE PARA OPERAR EL DOBLE
        int doble = numero * 2;
        //MOSTRAMOS EL RESULTADO
        System.out.println("El doble de " + numero 
                + " es " + doble);
    }
}
