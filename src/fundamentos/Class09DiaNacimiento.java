package fundamentos;

import java.util.Scanner;

public class Class09DiaNacimiento {

    public static void main(String[] args) {
        //COMO BUENAS PRACTICAS, TODAS LAS VARIABLES
        //ESTARAN DECLARADAS AL INICIO
        Scanner teclado = new Scanner(System.in);
        int dia, mes, anyo;
        int op1, op2, op3, op4, op5, op6, resultado;
        System.out.println("Introduzca el día: ");
        String dato = teclado.nextLine();
        System.out.println("Introduzca el mes: ");
        String dato1 = teclado.nextLine();
        System.out.println("Introduzca el año: ");
        String dato2 = teclado.nextLine();
        dia = Integer.parseInt(dato);
        mes = Integer.parseInt(dato1);
        anyo = Integer.parseInt(dato2);
        if (mes == 1) {
            mes = 13;
            //anyo = anyo - 1;
            anyo--;
        } else if (mes == 2) {
            mes = 14;
            anyo -= 1;
        }
        //Multiplicar el Mes más 1 por 3 y dividirlo entre 5
        op1 = (mes + 1) * 3 / 5;
        System.out.println("Op1 " + op1);
        //2.	Dividir el año entre 4
        op2 = anyo / 4;
        System.out.println("Op2: " + op2);
        //3.	Dividir el año entre 100
        op3 = anyo / 100;
        System.out.println("Op3 " + op3);
        //4.	Dividir el año entre 400
        op4 = anyo / 400;
        System.out.println("Op4 " + op4);
        //5.	Sumar el dia, el doble del mes,
        // el año, el resultado de la operación 1,
        //el resultado de la operación 2, menos el resultado
        //de la operación 3 más la operación 4 más 2.
        op5 = dia + (mes * 2) + anyo + op1 + op2 - op3 + op4 + 2;
        System.out.println("Op5 " + op5);
        //6.	Dividir el resultado anterior entre 7.
        op6 = op5 / 7;
        System.out.println("Op6 " + op6);
        //7.	Restar el número del paso 5 con el número del paso 6 por 7.
        resultado = op5 - (op6 * 7);
        System.out.println("Resultado: " + resultado);
        switch (resultado) {
            case 0:
                System.out.println("SABADO");
                break;
            case 1:
                System.out.println("DOMINGO");
                break;
            case 2:
                System.out.println("LUNES");
                break;
            case 3:
                System.out.println("MARTES");
                break;
            case 4:
                System.out.println("MIERCOLES");
                break;
            case 5:
                System.out.println("JUEVES");
                break;
            case 6:
                System.out.println("VIERNES");
                break;
        }
    }
}
