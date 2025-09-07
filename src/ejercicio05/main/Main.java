package ejercicio05.main;
import ejercicio05.model.Persona; 
import java.time.LocalDate; 
public class Main {
    public static void main(String[] args) {
        // objeto 1 usando el constructor por defecto
        System.out.println("Construcción con el constructor por defecto:");
        Persona p1 = new Persona();
        p1.setDni(40637762);
        p1.setNombre("Franco Abalos");
        p1.setFechaNacimiento(LocalDate.of(1997, 12, 13)); // año, mes, día
        p1.setProvincia("Jujuy");
        p1.mostrarDatos();
        System.out.println("\n");

        // objeto 2 usando el constructor parametrizado
        System.out.println("Construcción con el constructor parametrizado:");
        Persona p2 = new Persona(40888999, "Gabriela Sanchez", LocalDate.of(1998, 1, 31), "Salta");
        p2.mostrarDatos();
        System.out.println("\n");

        // objeto 3 usando el constructor parcial (provincia por defecto = "Jujuy")
        System.out.println("Construcción con el constructor parcial:");
        Persona p3 = new Persona(40555111, "Pedro Martinez", LocalDate.of(2007, 12, 25));
        p3.mostrarDatos();
        System.out.println("\n");
    }
}
