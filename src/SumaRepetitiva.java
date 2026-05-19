import java.util.Scanner;

public class SumaRepetitiva {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num1, num2, suma;
        String respuesta = "si";

        while (respuesta.equalsIgnoreCase("si")) {


            System.out.println("Ingrese el primer número:");
            num1 = entrada.nextInt();

            System.out.println("Ingrese el segundo número:");
            num2 = entrada.nextInt();


            suma = num1 + num2;


            System.out.println("La suma es: " + suma);


            System.out.println("¿Desea realizar otra suma? (si/no)");
            respuesta = entrada.next();
        }

        System.out.println("Programa finalizado.");

        entrada.close();
    }
}
