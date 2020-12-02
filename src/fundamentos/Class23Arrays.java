package fundamentos;

public class Class23Arrays {

    public static void main(String[] args) {
        //VAMOS A CREAR UN ARRAY DE NOMBRES
        //Y ALMACENAMOS DATOS EN SU INTERIOR
        String[] nombres = new String[3];
        nombres[0] = "Lucia";
        nombres[1] = "Diana";
        nombres[2] = "Adrian";
        //ANTES DE GUARDAR, VAMOS A RECORRER EL ARRAY
        for (int i = 0; i < nombres.length; i++) {
            String nombre = nombres[i];
            System.out.println(nombre);
        }
        //TAMBIEN PODEMOS INICIAR Y CREAR LOS ELEMENTOS DEL
        //ARRAY A LA VEZ
        int[] numeros = new int[]{99, 88, 44, 55, 2, 3, 8};
        //RECORREMOS TODOS LOS NUMEROS QUE HAY EN EL ARRAY
        for (int i = 0; i < numeros.length; i++) {
            //CAPTURAMOS CADA NUMERO
            int num = numeros[i];
            System.out.println("Número: " + num);
        }
    }
}
