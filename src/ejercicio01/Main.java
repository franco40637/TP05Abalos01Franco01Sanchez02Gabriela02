package ejercicio01;
public class Main {
    public static void main(String[] args) {
        String pais = "Argentina";
        int edad = 27;
        double altura = 70;
        double precio = 1200;
        long telefono = 3884842829l;
        double coseno = Math.cos(0.5);
        //variables
        int n1 = 8;
        int n2 = 5;
        int n3 = 1;
        int n4 = 20;
        int n5 = 9;
        //promedio
        double promedio = (n1 + n2 + n3 + n4 + n5) / 5.0;

        System.out.println("País: " + pais);
        System.out.println("La edad es: " + edad);
        System.out.println("El edificio mide: " + altura + " metros");
        System.out.println("Precio del producto: $" + precio);
        System.out.println("Telefono: " + telefono);
        System.out.println("Coseno de 0.5 = " + coseno);

        System.out.println("Valores: " + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5);
        System.out.println("Promedio = " + promedio);
    }
}
