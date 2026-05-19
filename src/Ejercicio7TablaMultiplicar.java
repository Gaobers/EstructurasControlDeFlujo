import java.util.Scanner;

public class Ejercicio7TablaMultiplicar {
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);

        int multiplicador;
        System.out.println("Ingrese un numero para calcular su tabla: ");
        multiplicador = teclado.nextInt();

        System.out.println("La tabla de multiplicar de " + multiplicador + " es:");
        for (int i=1; i <=10; i++){

            System.out.println(i + " x " + multiplicador + " = " + (i * multiplicador));
        }
        teclado.close();
    }
}
