package fundamentos;

import clases.Direccion;
import clases.Persona;

public class Class30UsoPersona {

    public static void main(String[] args) {
        try {
            //CREAMOS UN OBJETO PERSONA
            Persona persona = new Persona();
            //ASIGNAMOS VALORES A SUS PROPIEDADES
            persona.setNombre("Ana");
            persona.setApellidos("Ruiz");
            //SABEMOS QUE PUEDE DAR UN ERROR.
            //SI DA ERROR Y UTILIZAMOS THROWS, LA APP SE DETIENE.
            //SI TRATAMOS LA EXCEPCION, LA EJECUCION DEL PROGRAMA CONTINUA
            persona.setEdad(25);
            //QUEREMOS GUARDAR UNA DIRECCION PARA LA PERSONA
            //QUE DESEAMOS GUARDAR??? UN OBJETO DIRECCION
            //SI QUEREMOS UTILIZAR UNA DIRECCION, DEBEMOS CREAR
            //UNA DIRECCION...
            Direccion direccioncasa = new Direccion();
            //ALMACENAMOS LOS DATOS DE LA DIRECCION
            //direccioncasa.setCalle("Calle pez");
            direccioncasa.setCiudad("Madrid");
            direccioncasa.setNumero(14);
            //GUARDAMOS EN EL DOMICILIO DE LA PERSONA, LA DIRECCION
            persona.setDomicilio(direccioncasa);

            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Apellidos: " + persona.getApellidos());
            System.out.println("Edad: " + persona.getEdad());
            System.out.println(persona.getNombreCompleto());
            System.out.println("Calle: " + persona.getDomicilio().getCalle());
        } catch (Exception ex) {
            System.out.println("Tratando la excepción con try/catch");
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
