package clases;

public class Direccion {

    public Direccion() {
        System.out.println("Constructor de dirección");
        //PODEMOS INICIAR LAS VARIABLES CON VALORES
        //PREDETERMINADOS
        this.calle = "Calle Sin asignar";
        this.ciudad = "No existe";
        this.numero = 0;
    }

    private String calle;
    private String ciudad;
    private int numero;

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
