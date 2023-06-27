package clase_5;

import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // variables

        Integer numero, aleatorio;

        aleatorio = (int) (Math.random() * 100); // 0 - 100

        do {
            System.out.print("Ingrese un número [1 - 100]:  ");
            numero = sc.nextInt();
            if (aleatorio > numero) {
                System.out.println("más");
            } else {
                System.out.println("menos");
            }
        } while (numero != aleatorio);

        System.out.println("Lo lograste");


    }
}
