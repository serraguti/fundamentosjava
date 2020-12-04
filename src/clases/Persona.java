package clases;

public class Persona {

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTOR DE PERSONA">
    //UN CONSTRUCTOR ES UNA HERRAMIENTA PARA PODER INICIAR OBJETOS
//</editor-fold>
    // <editor-fold defaultstate="collapsed" desc="CAMPOS DE LA CLASE">
    //LOS CAMPOS DE PROPIEDAD SON PRIVADOS
    private String nombre; //GETTER Y SETTER
    private String apellidos; //GETTER Y SETTER
    private int edad;  //GETTER Y SETTER
    //QUEREMOS QUE UNA PERSONA TENGA UNA DIRECCION
    private Direccion domicilio;

    public Direccion getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Direccion domicilio) {
        this.domicilio = domicilio;
    }

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
    // <editor-fold defaultstate="collapsed" desc="SOBRECARGA DE METODOS">
    //UNA PERSONA TIENE UN METODO PARA DEVOLVER SU
    //NOMBRE Y APELLIDOS LLAMADO getNombreCompleto()
    public String getNombreCompleto() {
        return this.nombre + " " + this.apellidos;
    }

    //QUEREMOS DAR LA POSIBILIDAD AL PROGRAMADOR DE DEVOLVER EL
    //NOMBRE COMPLETO PERO A LA INVERSA
    public String getNombreCompleto(boolean inversa) {
        return this.apellidos + " " + this.nombre;
    }

    //QUEREMOS UN METODO QUE NOS DEVUELVA EL NOMBRE COMPLETO
    //PERO A MAYUSCULAS
    public String getNombreCompleto(int numero) {
        return this.nombre.toUpperCase() + " " + this.apellidos.toUpperCase();
    }

    public void getNombreCompleto(String algo) {
    }

    public void getNombreCompleto(String algo, int otro) {
    }
// </editor-fold>

}
