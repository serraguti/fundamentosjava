package fundamentos;

import java.util.ArrayList;
import vehiculos.Coche;
import vehiculos.Deportivo;

public class Class33Abstraccion {

    public static void main(String[] args) {
        ArrayList<Coche> coches = new ArrayList<>();
        coches.add(new Deportivo("Ferrari", "Testarrossa"));
        coches.add(new Coche("Fiat", "Multipla"));
        //PODEMOS MANEJAR LOS OBJETOS COMO COCHE
        //CUALQUIERA DE LOS DOS PUEDE ACELERAR
        coches.get(0).acelerar();  //DEPORTIVO
        coches.get(1).acelerar();  //COCHE
        //NO PODEMOS MANEJAR UN OBJETO CON SU FORMA
        //SI NO LO CONVERTIMOS.  APLICAR SUS METODOS
        //NECESITAMOS HACER UN CASTING
        ((Deportivo) coches.get(0)).turbo();
        //coches.get(0).turbo();
        System.out.println(coches.get(0).getClass());
        System.out.println(coches.get(1).getClass());
        if (coches.get(0) instanceof Coche) {
            System.out.println("Deportivo");
        }
    }
}
