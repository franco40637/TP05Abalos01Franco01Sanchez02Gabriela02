package ejercicio03;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Ingrese un numero entre 0 y 10: ");
    int numero = entrada.nextInt();

    int factorial = 1; 
    int i = numero;

    while (i > 1) {
        factorial = factorial * i;
            i--;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
        entrada.close();
    }
}
