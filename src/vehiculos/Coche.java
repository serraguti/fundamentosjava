package vehiculos;

public class Coche {

    //CARACTERISTICAS
    private String marca;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void frenar() {

    }
    //SI HACEMOS GETTER Y SETTER
    //DEPENDE DE LO QUE DESEAMOS QUE VEA EL USUARIO
    //SI NO QUEREMOS QUE EL USUARIO CAMBIE LA VELOCIDAD
    //NO HACEMOS GETTER Y SETTER
    private int velocidad;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //ACCIONES DEL COCHE
    public void acelerar() {
        this.velocidad = this.velocidad + 20;
        System.out.println("La velocidad es " + this.velocidad);
    }
}
