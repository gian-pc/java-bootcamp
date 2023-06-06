package clase_5;

import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Variables

        Double precioOriginal;
        Integer descuento;
        Double precioFinal;


        System.out.print("Ingrese precio producto: ");
        precioOriginal = sc.nextDouble();

        System.out.print("Ingrese porcentaje de descuento [ 1 - 100]: ");
        descuento = sc.nextInt();

        precioFinal = precioOriginal - (precioOriginal * descuento / 100);

        System.out.println("El precio final es: " + precioFinal);


    }
}
