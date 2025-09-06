package ejercicio03;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero entre 0 y 10: ");
        int numero = scanner.nextInt();

        int factorial = 1;
        int contador = 1;

        while (contador <= numero) {
            factorial = factorial * contador;
            contador++;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);

        scanner.close();
    }
}
