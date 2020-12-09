package vehiculos;

public class Deportivo extends Coche {

    public Deportivo(String marca, String modelo) {
        super(marca, modelo);
        this.velocidadMaxima = 320;
    }

    public void turbo() {
        //CAMBIAR LA VELOCIDAD INCREMENTANDO 80km/h
        this.velocidad += 80;
        if (this.velocidad >= this.velocidadMaxima) {
            this.velocidad = this.velocidadMaxima;
            System.out.println("Velocidad máxima alcanzada " + this.velocidadMaxima + " km/h");
        } else {
            System.out.println("Turbo shoot!!! " + this.velocidad + " km/h");
        }
    }

    @Override
    public void acelerar() {
        if (this.estadoArrancado == false) {
            System.out.println("El super deportivo no ha arrancado todavía");
        } else {
            this.velocidad += 40;
            if (this.velocidad >= this.velocidadMaxima) {
                this.velocidad = this.velocidadMaxima;
                System.out.println("Velocidad máxima alcanzada " + this.velocidadMaxima + " km/h");
            } else {
                System.out.println("Acelerando " + this.velocidad + " km/h");
            }
        }
    }
}
