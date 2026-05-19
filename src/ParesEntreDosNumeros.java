import java.util.Scanner;

public class ParesEntreDosNumeros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num1, num2, contador;


        System.out.println("Ingrese el primer número:");
        num1 = entrada.nextInt();

        System.out.println("Ingrese el segundo número:");
        num2 = entrada.nextInt();


        if (num1 < num2) {
            contador = num1;
        } else {
            contador = num2;
        }

        System.out.println("Números pares entre los dos números:");

        while (contador <= Math.max(num1, num2)) {

            if (contador % 2 == 0) {
                System.out.println(contador);
            }

            contador++;
        }

        entrada.close();
    }
}
