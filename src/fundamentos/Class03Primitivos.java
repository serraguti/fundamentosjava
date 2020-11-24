package fundamentos;

import java.util.Scanner;

public class Class03Primitivos {
    //psvm + TAB
    public static void main(String[] args) {
        int numero = 30;
        numero = 99;
        //LOS TIPOS CHAR SE IGUALAN CON COMILLA SIMPLE
        char letra = 'A';
        //String es una clase, no es un primitivo
        //Pero es un Wrapper, con igualar a un valor
        //ya se crea/instancia el objeto
        String texto = "Hoy es lunes";
        //boolean se establece con true/false
        boolean respuesta = true;
        //El compilador detecta si nos hemos pasado
        //en la capacidad de la variable
        byte bite = 127;
        //Object es la clase BASE de Java
        //Todas las clases en Java heredan de algo.
        //La herencia quiere decir que un objeto no comienza
        //de Zero, sino que ya tiene unos métodos y propiedades.
        //La clase BASE es la clase de dónde hereda un objeto
        //directamente
        //Un Object puede almacenar cualquier dato
        //y es un Wrapper
        Object obj = "Esto es un texto";
        Object obj2 = 78899;
        
        //CONVERSION IMPLICITA
        //UN DOUBLE TIENE MAS CAPACIDAD QUE UN INT
        //NO NOS FIJAMOS EN EL VALOR, SINO EN LA CAPACIDAD
        //DEL TIPO
        double mayor;
        int menor = 19;
        //SI ALMACENAMOS UN TIPO MENOR EN MAYOR
        //LA CONVERSION ES AUTOMATICA
        mayor = menor;
        
        //CONVERSION CASTING
        //SE REALIZA ENTRE PRIMITIVOS
        byte bytemenor;
        int intmayor = 99;
        //QUEREMOS GUARDAR UN TIPO DE MAYOR CAPACIDAD
        //LA CONVERSION SIEMPRE AL TIPO DE LA IZQUIERDA
        bytemenor = (byte) intmayor;
        
        //CONVERSION STRING A PRIMITIVO
        //SE UTILIZAN LOS METODOS PARSE
        //POR CADA PRIMITIVO, TENEMOS UNA CLASE
        //DE SU TIPO: double --> Double
        //  int  --> Integer, boolean --> Boolean
        String dato = "78";
        int num;
        //QUEREMOS GUARDAR EL TEXTO NUMERO EN INT
        num = Integer.parseInt(dato);
        double d = Double.parseDouble(dato);
        
        //CONVERSION DE OBJETOS A STRING
        String cadena;
        int num1 = 99;
        //PARA CONVERTIR A STRING LOS 
        //PRIMITIVOS SE UTILIZA EL METODO
        // valueOf DE LA CLASE STRING
        cadena = String.valueOf(num1);
        //OTRA OPCION SON LAS CONVERSIONES
        //IMPLICITAS DE PRIMITIVOS
        //sout + TAB
        System.out.println("Número " + num1);
        //PARA UTILIZAR SCANNER...
        //1) TODA LA RUTA
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca su nombre:");
        //SIEMPRE DEVUELVE STRING
        String nombre = teclado.nextLine();
        System.out.println("Su nombre es: "
        + nombre);
    }
}
