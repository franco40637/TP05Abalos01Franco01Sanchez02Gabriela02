package ejercicio02;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese solamente un numero entero: ");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es par. El triple es: " + (numero * 3));
        } else {
            System.out.println("El numero es impar. El doble es: " + (numero * 2));
        }

        entrada.close();
    }
}
