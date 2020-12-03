package clases;

public class Matematicas {

    //ESTA CLASE LA VAMOS A UTILIZAR
    //NO VA A ARRANCAR, SERA UNA HERRAMIENTA PARA
    //OTRAS CLASES
    //NO LLEVA METODO main()
    //NOS CREAMOS UN METODO PARA SUMAR NUMEROS
    //QUE RECIBIRA DOS NUMEROS Y DEVOLVERA LA SUMA
    public int sumarNumeros(int num1, int num2) {
        //ACCIONES
        int suma = num1 + num2;
        return suma;
    }

    public int getDoble(int num) {
        return num * 2;
    }

    public double getPotencia(int num, int potencia) {
        double resultado = Math.pow(num, potencia);
        return resultado;
    }

    //EL MENU NO DEVUELVE NADA, SOLAMENTE
    //MUESTRA OPCIONES void
    public void menuMatematicas() {
        System.out.println("1.- Sumar Números");
        System.out.println("2.- Doble de número");
        System.out.println("3.- Potencia de número");
        System.out.println("Seleccione una opción: ");
    }
}
