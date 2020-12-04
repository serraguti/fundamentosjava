package clases;

public class Direccion {

    public Direccion() {
        System.out.println("Constructor Dirección sin parámetros");
        this.calle = "";
        this.ciudad = "";
        this.numero = 0;
    }

    public Direccion(String calle, String ciudad, int numero) {
        System.out.println("Constructor de dirección parámetros");
        //PODEMOS INICIAR LAS VARIABLES CON VALORES
        //PREDETERMINADOS
        this.calle = calle;
        this.ciudad = ciudad;
        this.numero = numero;
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
