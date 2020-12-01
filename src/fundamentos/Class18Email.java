package fundamentos;

import java.util.Scanner;

public class Class18Email {

    public static void main(String[] args) {
        //Exista @
        //@ ni al inicio ni final
        //No más de una @
        //Exista un punto
        //Punto después de la @
        //Dominio de 2 a 4 caracteres
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un email: ");
        String email = teclado.nextLine();
        if (email.contains("@") == false) {
            System.out.println("Email sin @");
        } else if (email.startsWith("@") == true || email.endsWith("@") == true) {
            System.out.println("@ al inicio o al final");
        } else if (email.indexOf("@") != email.lastIndexOf("@")) {
            System.out.println("Existe más de una @");
        } else if (email.indexOf(".") == -1) {
            System.out.println("No existe un punto");
        } else if (email.lastIndexOf(".") < email.indexOf("@")) {
            System.out.println("No existe punto después de @");
        } else {
            //BUSCAMOS EL ULTIMO PUNTO
            int ultimopunto = email.lastIndexOf(".");
            String dominio = email.substring(ultimopunto + 1);
            int longitud = dominio.length();
            if (longitud >= 2 && longitud <= 4) {
                System.out.println("EMAIL CORRECTO!!!");
            } else {
                System.out.println("El dominio debe ser entre 2 y 4 caracteres");
            }
        }

        //   pa.co@email.com  //punto 3, arroba: 5
    }
}
