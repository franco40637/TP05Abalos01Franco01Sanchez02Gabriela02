package ejercicio03;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba un numero entre 0 y 10: ");
        int numero = scanner.nextInt();
        // controlo que el numero este en el rango correcto
        if (numero < 0 || numero > 10) {
            System.out.println("Numero incorrecto, debe estar entre 0 y 10.");
        } else {
            // arranco en 1 porque el factorial multiplica desde 1 y el contador para ir aumentando en el while
            int factorial = 1;
            int contador = 1;

            while (contador <= numero) {
                factorial = factorial * contador;
                contador++;
            }

            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        scanner.close();
    }
}
