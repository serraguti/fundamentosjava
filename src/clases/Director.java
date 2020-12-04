package clases;

public class Director extends Trabajador {

    public Director() {
        System.out.println("Salario minimo " + this.salarioMinimo);
        this.salarioMinimo += 200;
    }

    @Override
    public int getVacaciones() {
        return 30;
    }
}
