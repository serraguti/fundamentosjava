package fundamentos;

import java.util.Scanner;

public class Class12Bucles {

    public static void main(String[] args) {
        //DECLARAMOS UN BUCLE DE 1 a 5
        for (int i = 1; i <= 5; i++) {
            //INSTRUCCIONES
            System.out.println("Contador: " + i);
        }

        //Podemos realizar el bucle para que
        //tenga otro incremento si lo deseamos
        //  i+=NUMERO
        for (int i = 1; i <= 20; i += 2) {
            //IMPARES
            System.out.println(i);
        }

        //DEBEMOS CAMBIAR LA CONDICION EN ALGUNO MOMENTO
        //HACEMOS UN BUCLE DE 1 a 5 CON WHILE
        //LA VARIABLE SE DECLARA FUERA DEL BUCLE
        int numero = 1;
        while (numero <= 5) {
            //ACCIONES
            //DEBEMOS HACER ALGUN CODIGO PARA SALIR DEL
            //BUCLE, EN ESTE EJEMPLO, SUMAR VALOR AL NUMERO
            System.out.println("While: " + numero);
            numero += 1;
        }

        String dato = "hola";
        if (dato == "hola") {
            //NUNCA ENTRA AQUI
        }

        //PEDIREMOS AL USUARIO TEXTOS
        //HASTA QUE ESCRIBA LA PALABRA STOP
        Scanner teclado = new Scanner(System.in);
        String respuesta = "";
        System.out.println("Escriba stop para salir");
        //while (respuesta.equals("stop") == false) {
        while (!respuesta.equals("stop")) {
            //INDICAMOS QUE ESCRIBA ALGO...
            System.out.println("Introduzca una palabra: ");
            //ALMACENAMOS LO QUE HA ESCRITO EL USUARIO
            respuesta = teclado.nextLine();
            System.out.println("Su respuesta es..." + respuesta);
        }
        System.out.println("Fin de programa");
    }
}
