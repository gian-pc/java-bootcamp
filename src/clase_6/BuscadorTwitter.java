package clase_6;

import javax.swing.*;

public class BuscadorTwitter {
    public static void main(String[] args) {
        String palabra = JOptionPane.showInputDialog("Ingrese palabra a buscar:");
        System.out.println("https://twitter.com/search?q="+palabra);
    }
}
