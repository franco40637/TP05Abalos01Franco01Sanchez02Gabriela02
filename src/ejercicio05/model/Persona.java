package ejercicio05.model;
import java.time.LocalDate;
import java.time.Period;  

public class Persona {
    //atributos
    private int dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String provincia;

    // constructor por defecto
    public Persona() {
    }

    // constructor parametrizado
    public Persona(int dni, String nombre, LocalDate fechaNacimiento, String provincia) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = provincia;
    }

    // constructor parcial
    public Persona(int dni, String nombre, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = "Jujuy";
    }

    // getters y setters

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre; 
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }



     //calcula la edad de la persona en años.
    public int calcularEdad() {
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }

    // Verifica si la persona es mayor de edad 18 o mas return true si es mayor, false si no.
    
    public boolean esMayorDeEdad() {
        return calcularEdad() >= 18;
    }

    //muestra todos los datos de la persona incluyendo la edad y si es mayor de edad.

    public void mostrarDatos() {
        System.out.println(" Datos de la Persona ");
        System.out.println("DNI: " + this.dni);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Fecha de Nacimiento: " + this.fechaNacimiento);
        System.out.println("Provincia: " + this.provincia);
        System.out.println("Edad: " + calcularEdad() + " años");

        if (esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona no es mayor de edad.");
        }
    }
}
