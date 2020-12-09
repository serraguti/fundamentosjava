package vehiculos;

public class Coche {

    //CARACTERISTICAS DE LA CLASE
    private String marca;
    private String modelo;
    protected int velocidad;
    protected int velocidadMaxima;
    protected boolean estadoArrancado;

    //CONSTRUCTOR DEL COCHE
    public Coche() {
        this.velocidad = 0;
        this.velocidadMaxima = 160;
        this.estadoArrancado = false;
    }

    public Coche(String marca, String modelo) {
        this.velocidad = 0;
        this.velocidadMaxima = 160;
        this.estadoArrancado = false;
        this.marca = marca;
        this.modelo = modelo;
    }

    //SOBRESCRIBIMOS EL METODO toString()
    //PARA DEVOLVER LA MARCA Y MODELO DEL COCHE
    @Override
    public String toString() {
        return this.marca + " " + this.modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //ACCIONES SOBRE EL COCHE
    public void arrancar() {
        if (this.estadoArrancado == true) {
            System.out.println("El coche está en marcha!!!");
        } else {
            this.estadoArrancado = true;
            System.out.println("El coche ha arrancado");
        }
    }

    public void acelerar() {
        if (this.estadoArrancado == false) {
            System.out.println("Primero tienes que arrancar el coche");
        } else {
            this.velocidad += 20;
            if (this.velocidad >= this.velocidadMaxima) {
                System.out.println("Velocidad máxima del coche: " + this.velocidadMaxima);
                this.velocidad = this.velocidadMaxima;
            } else {
                System.out.println("Acelerando..." + this.velocidad + " km/h");
            }
        }
    }

    public void frenar() {
        this.velocidad = this.velocidad - 20;
        if (this.velocidad <= 0) {
            this.velocidad = 0;
            System.out.println("Ya estas parado, velocidad " + this.velocidad);
        } else {
            System.out.println("Frenando..." + this.velocidad + " km/h");
        }
    }

    public void frenar(int presion) {
        this.velocidad = this.velocidad - presion;
        if (this.velocidad <= 0) {
            this.velocidad = 0;
            System.out.println("Ya estás parado");
        } else {
            System.out.println("Frenando..." + this.velocidad + " km/h");
        }
    }
}
