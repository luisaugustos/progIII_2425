import java.time.LocalDate;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) throws Exception {
        int anioActual, anioNasc;
        Scanner scannerRef = new Scanner(System.in);
        anioActual = LocalDate.now().getYear();
        System.out.println("Estamos en: "+ anioActual);
        System.out.println("Escriba su año de nacimiento:");
        anioNasc = scannerRef.nextInt();
        int edad = anioActual - anioNasc;
        System.out.printf("Su edad es: %d años.\n", edad);

        scannerRef.close();
    }
}
