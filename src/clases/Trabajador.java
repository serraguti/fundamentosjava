package clases;

public class Trabajador extends Persona {

    @Override
    public String toString() {
        return this.getNombreCompleto();
    }

    //CAMPOS
    //CONSTRUCTORES
    //GETTER Y SETTER
    //METODOS
    public int getVacaciones() {
        System.out.println("GetVacaciones trabajador");
        return 25;
    }

    public int getVacaciones(int extras) {
        System.out.println("GetVacaciones trabajador");
        return 22 + extras;
    }

    protected int salarioMinimo;

    public int getSalarioMinimo() {
        return salarioMinimo;
    }

    public Trabajador() {
        //LA PRIMERA LINEA QUE HACE JAVA ES ESTA
        //AUNQUE NO LA VEAMOS
        super();
        salarioMinimo = 1500;
        System.out.println("Constructor Trabajador");
    }

    public Trabajador(String nombre, int edad) {
        //PODEMOS HACER QUE UN CONSTRUCTOR LEA
        //OTRO CONSTRUCTOR DE LA CLASE super
        //INDICANDO LOS PARAMETROS DEL CONSTRUCTOR
        super(nombre, edad);
        System.out.println("Constructor parámetros Trabajador");
    }

    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
