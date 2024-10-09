public class Empleado {
    // Atributos privados de la clase
    private String nombre;
    private String cargo;
    private double salario;

    // Constructor que solo recibe el nombre
    public Empleado(String nombre) {
        this.nombre = nombre;
        this.cargo = "No asignado";  // Asignamos un valor por defecto a cargo
        this.salario = 0.0;          // Asignamos un valor por defecto a salario
    }

    // Constructor que recibe nombre, cargo y salario
    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Método setter para el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método getter para el nombre
    public String getNombre() {
        return this.nombre;
    }

    // Método setter para el cargo
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Método getter para el cargo
    public String getCargo() {
        return this.cargo;
    }

    // Método setter para el salario
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método getter para el salario
    public double getSalario() {
        return this.salario;
    }
}
