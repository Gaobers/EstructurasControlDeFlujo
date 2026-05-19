import java.util.Scanner;

public class Ejercicio5NumeroRepetitivoSuma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, vueltas = 0;

        do {
            System.out.println("Ingrese un numero cualquiera: ");
            System.out.println("Ingresa cero si quieres salir");
            numero = teclado.nextInt();
            vueltas += numero;
        }
        while (numero != 0);

        System.out.println("La suma de todos los números ingresados fue de: " + vueltas);
        teclado.close();
    }
}
