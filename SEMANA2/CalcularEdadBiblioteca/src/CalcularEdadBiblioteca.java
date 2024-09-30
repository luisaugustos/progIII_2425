import com.coti.tools.Esdia;

public class CalcularEdadBiblioteca {

    public static void main(String[] args) throws Exception {
        int pruebaIntero = Esdia.readInt("Escriba un numero intero \n", 1, 99);
        System.out.printf("El numero es %d", pruebaIntero);
    }
}
