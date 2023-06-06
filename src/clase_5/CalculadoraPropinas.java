package clase_5;

import java.util.Scanner;

public class CalculadoraPropinas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Variables

        Double totalCuenta;
        Double porcentajePropina;
        Double propina;

        System.out.print("Ingrese total de la cuenta: ");
        totalCuenta = sc.nextDouble();

        System.out.print("Ingrese el porcentaje de propina [0 - 100]: ");
        porcentajePropina = sc.nextDouble();

        propina = totalCuenta*(porcentajePropina/100);

        System.out.println("La propina es: " + propina);

    }
}
