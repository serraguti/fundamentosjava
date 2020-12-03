package fundamentos;

import clases.Persona;

public class Class30UsoPersona {

    public static void main(String[] args) throws Exception {
        //CREAMOS UN OBJETO PERSONA
        Persona persona = new Persona();
        //ASIGNAMOS VALORES A SUS PROPIEDADES
        persona.setNombre("Ana");
        persona.setApellidos("Ruiz");
        persona.setEdad(-25);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellidos: " + persona.getApellidos());
        System.out.println("Edad: " + persona.getEdad());
    }
}
