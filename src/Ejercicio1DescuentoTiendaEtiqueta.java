import java.util.Scanner;

public class Ejercicio1DescuentoTiendaEtiqueta {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double compra, descuento, montoPagar;
        String etiqueta;

        System.out.println("Ingrese el valor de la compra:");
        compra = entrada.nextDouble();

        entrada.nextLine();


        System.out.println("Ingrese el color de la etiqueta:");
        etiqueta = entrada.nextLine().toLowerCase();

        if (etiqueta.equals("verde")) {
            descuento = compra * 0.05;

        } else if (etiqueta.equals("roja")) {
            descuento = compra * 0.10;

        } else if (etiqueta.equals("azul")) {
            descuento = compra * 0.15;

        } else if (etiqueta.equals("dorada")) {
            descuento = compra * 0.20;

        } else {
            System.out.println("Color de etiqueta no válido.");
            entrada.close();
            return;
        }

        montoPagar = compra - descuento;

        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Monto a pagar: $" + montoPagar);

        entrada.close();
    }
}
