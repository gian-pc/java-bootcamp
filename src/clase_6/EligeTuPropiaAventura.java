package clase_6;

import javax.swing.*;
import java.util.Scanner;

public class EligeTuPropiaAventura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        int opcion = 0;
        boolean salir = false;
        int repetidor = 0;

        System.out.println("Es una noche estrellada, te encuentras en un bosque misterioso:\n" +
                "1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante\n" +
                "2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora \n");

        do {


            opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.println("Exploras la oscuridad en busca de la fuente de un susurro escalofriante");

            } else if (opcion == 2) {
                System.out.println("Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora.");
                System.out.println("1) Entras por la puerta de la izquierda \n" +
                        "2) Optas por la puerta de la derecha\n");
                opcion = sc.nextInt();
                if (opcion == 1) {
                    System.out.println("Al abrir la puerta de la izquierda, te encuentras con una habitación llena de tesoros brillantes y mágicos. Te maravillas con las joyas y los objetos preciosos que llenan la sala. Te das cuenta de que has encontrado el legendario tesoro perdido del bosque. Con tu corazón lleno de emoción y riquezas, decides regresar a casa para compartir tu increíble aventura con el mundo. ¡Felicidades, has tenido un final exitoso en tu búsqueda!");
                } else if (opcion==2) {
                    System.out.println("");
                }
            }

            System.out.println("");
            System.out.println("-------------------------------------------------");
            System.out.println("¿Desea realizar alguna otra operación? (0)Sí (1)No");
            repetidor = sc.nextInt();

        }while(repetidor ==0);
    }
}
