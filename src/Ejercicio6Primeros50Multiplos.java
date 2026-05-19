import java.util.Scanner;

public class Ejercicio6Primeros50Multiplos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Primeros 50 múltiplos de 5:");

        int multiplicador = 5;
        for (int i = 1; i <= 50; i++){
            System.out.println("El múltiplo #" + i + " de 5 es: " + i * multiplicador);
        }

        teclado.close();
    }
}
