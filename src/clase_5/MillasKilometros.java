package clase_5;

import java.util.Scanner;

public class MillasKilometros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una distancia en millas: ");
        Double distanciaM = sc.nextDouble();

        System.out.println("La distancia en Km es: " + distanciaM * 1.60934);


    }
}
