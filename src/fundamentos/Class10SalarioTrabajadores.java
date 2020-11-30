package fundamentos;

import java.util.Scanner;

public class Class10SalarioTrabajadores {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horassemanales, distancia, precio, horasextra, dietas;
        //VARIABLE PARA SABER EL TIPO DE DIETAS QUE TIENE EL USUARIO
        String tipodietas;
        //PEDIMOS DATOS AL USUARIO 
        System.out.println("Horas semanales trabajadas: ");
        String datohoras = teclado.nextLine();
        System.out.println("Distancia recorrida (Km): ");
        String datodistancia = teclado.nextLine();
        System.out.println("Precio Hora: ");
        String datoprecio = teclado.nextLine();
        //CONVERTIMOS LOS DATOS A NUMEROS
        horassemanales = Integer.parseInt(datohoras);
        distancia = Integer.parseInt(datodistancia);
        precio = Integer.parseInt(datoprecio);
        //PREGUNTAMOS SI TIENE HORAS SEMANALES
        if (horassemanales > 36) {
            horasextra = horassemanales - 36;
        } else {
            horasextra = 0;
        }
        //PREGUNTAMOS POR LAS DIETAS SEGUN LA DISTANCIA
        if (distancia < 100) {
            tipodietas = "Sin dietas";
            dietas = 0;
        } else if (distancia >= 100 && distancia < 250) {
            tipodietas = "Dieta Regional";
            dietas = 200;
        } else if (distancia >= 250 && distancia < 500) {
            tipodietas = "Dieta Provincial";
            dietas = 400;
        } else {
            tipodietas = "Dieta Internacional";
            dietas = 600;
        }
        //CON TODOS LOS DATOS EVALUADOS, PODEMOS COMENZAR A CALCULAR
        //POR UN LADO, TENDREMOS EL PRECIO HORA INICIAL
        //POR OTRO LADO, LO QUE HEMOS GANADO CON LAS HORAS EXTRAS
        //10
        int preciobase = 0;
        int precioextra = 0;
        //TODO DEPENDE DE SI EL USUARIO TIENE HORAS EXTRA
        if (horasextra > 0) {
            //TENEMOS HORAS EXTRA Y CALCULAMOS
            preciobase = 36 * precio;
            precioextra = horasextra * (precio + 2);
        } else {
            //NO TENEMOS HORAS EXTRA
            preciobase = horassemanales * precio;
        }
        //CALCULAR EL SALARIO FINAL
        int salario = preciobase + precioextra + dietas;
        System.out.println("DESGLOSE DE CONTABILIDAD");
        System.out.println("Horas trabajadas " + horassemanales);
        System.out.println("Precio Hora: " + precio + "€");
        System.out.println("Distancia en Km: " + distancia);
        System.out.println("Horas Extra: " + horasextra);
        System.out.println("Dietas: " + tipodietas);
        System.out.println("Salario Dietas: " + dietas + "€");
        System.out.println("Salario base: " + preciobase);
        System.out.println("Salario Extra: " + precioextra);
        System.out.println("Salario FINAL: " + salario);
    }
}
