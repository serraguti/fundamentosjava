package clases;

public class Director extends Trabajador {

    public Director() {
        System.out.println("Salario minimo " + this.salarioMinimo);
        this.salarioMinimo += 200;
    }

    @Override
    public int getVacaciones() {
        System.out.println("GetVacaciones Director");
        //NECESITAMOS LEER EL NUMERO DE VACACIONES DEL
        //METODO SOBRESCRITO (TRABAJADOR)
        int numvacastrabajador = super.getVacaciones();
        return numvacastrabajador + 8;
    }

    @Override
    public String toString() {
        return "Soy un super Dire";
    }
}
