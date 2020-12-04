package fundamentos;

import clases.Trabajador;

public class Class31UsoTrabajador {

    public static void main(String[] args) {
        Trabajador tra = new Trabajador();
        tra.setNombre("Currante");
        tra.setApellidos("Super currante");
        System.out.println("Trabajador " + tra.getNombreCompleto());
    }
}
