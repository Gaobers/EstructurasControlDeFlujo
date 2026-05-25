import java.util.Scanner;

public class Ejercicio2NumerosParesDesde0 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero, contador = 0;


        System.out.println("Ingrese un número entero:");
        numero = entrada.nextInt();


        System.out.println("Números pares entre 0 y " + numero + ":");

        while (contador <= numero) {

            if (contador % 2 == 0) {
                System.out.println(contador);
            }

            contador++;
        }

        entrada.close();
    }
}
