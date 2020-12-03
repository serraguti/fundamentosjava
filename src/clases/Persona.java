package clases;

public class Persona {

    // <editor-fold defaultstate="collapsed" desc="CAMPOS DE LA CLASE">
    //LOS CAMPOS DE PROPIEDAD SON PRIVADOS
    private String nombre; //GETTER Y SETTER
    private String apellidos; //GETTER Y SETTER
    private int edad;  //GETTER Y SETTER

// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="GETTER Y SETTER">
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad < 0) {
            //2) LANZAR UNA EXCEPCION
            throw new Exception("La edad no puede ser negativa");
        } else {
            this.edad = edad;
        }
    }

// </editor-fold>
}
