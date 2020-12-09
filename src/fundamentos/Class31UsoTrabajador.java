package fundamentos;

import clases.Director;
import clases.Trabajador;

public class Class31UsoTrabajador {

    public static void main(String[] args) throws Exception {
        Trabajador tra = new Trabajador();
        tra.setNombre("Currante");
        tra.setApellidos("Super currante");
        tra.setEdad(33);
        tra.setSalario(1000);

        //tra.salarioMinimo = 90000;
        System.out.println("Trabajador " + tra.getNombreCompleto());
        System.out.println("Salario: " + tra.getSalario());
        System.out.println("Salario minimo Trabajador: " + tra.getSalarioMinimo());
        Director dire = new Director();
        dire.setNombre("Director");
        dire.setApellidos("dire dire");
        System.out.println("Salario mínimo Director: " + dire.getSalarioMinimo());
        //System.out.println("Vacaciones Trabajador: " + tra.getVacaciones());
        System.out.println("Vacaciones Director: " + dire.getVacaciones());
        System.out.println("Trabajador " + tra.toString());
        System.out.println("Director " + dire.toString());
    }
}
