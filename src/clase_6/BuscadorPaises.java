package clase_6;

import javax.swing.*;

public class BuscadorPaises {
    public static void main(String[] args) {
        String pais = JOptionPane.showInputDialog("Ingrese un País:");

        System.out.println("https://www.google.com/maps/search/"+pais);
    }

}
