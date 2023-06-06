package clase_5;

import java.util.Scanner;

public class CalculadoraEdadPerros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese al edad de su perro: ");
        Integer edadPerro = sc.nextInt();

        System.out.println("La edad de su perro en años humano es : " + edadPerro);
        System.out.println("La edad de su perro en años perro es: " + edadPerro * 7);

    }
}