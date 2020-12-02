package fundamentos;

import java.util.ArrayList;

public class Class26ArrayList {

    public static void main(String[] args) {
        //DECLARAMOS Y CREAMOS LA COLECCION
        //ArrayList<String> lista = new ArrayList<String>();
        //ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> lista = new ArrayList();
        System.out.println("Número de elementos: " + lista.size());
        //AÑADIR ELEMENTOS
        lista.add("Primero");
        lista.add("Segundo");
        lista.add("Tercero");
        lista.add("Primero");
        //INSERTAR UN ELEMENTO EN LA COLECCION
        //LA POSICION A INSERTAR, DEBE EXISTIR
        lista.add(1, "Cuarto");
        //MODIFICAR UN ELEMENTO DE LA COLECCION
        lista.set(1, "Modificado");
        //ELIMINAR UN ELEMENTO POR POSICION
        lista.remove(1);
        //ELIMINAR UN ELEMENTO POR OBJETO
        lista.remove("Primero");
        //BUSCAR UN ELEMENTO
        //lista.contains()
        int posicion = lista.indexOf("Primero");
        System.out.println("La posición de indexOf Primero es: " + posicion);
        int pos = lista.lastIndexOf("Primero");
        System.out.println("La posición de lastIndexOf Primero es: " + pos);

        System.out.println("Número de elementos: " + lista.size());
        //RECORRER LOS ELEMENTOS DE UNA COLECCION
        for (int i = 0; i < lista.size(); i++) {
            //RECUPERAR UN ELEMENTO DE LA COLECCION
            String dato = lista.get(i);
            System.out.println(i + ": " + dato);
        }
        //RECORRER CONJUNTOS CON BUCLES DE REFERENCIA
        //UNA REFERENCIA ES UNA VARIABLE QUE APUNTA A UN OBJETO
        //EN LUGAR DE DECLARAR UNA VARIABLE CONTADOR (NO EXISTE)
        //SE RECORRE CON UN OBJETO.
        //Y FINALIZA CUANDO NO HAY MAS OBJETOS A RECORRER
        //Sintaxis:
        //   for (TIPO variable: conjunto) { //variable es la referencia }
        for (String dato : lista) {
            System.out.println(dato);
        }
        //ELIMINAR TODOS LOS ELEMENTOS DE LA COLECCION
        lista.clear();
        System.out.println("Número de elementos: " + lista.size());
    }
}
