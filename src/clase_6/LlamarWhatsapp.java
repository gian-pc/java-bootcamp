package clase_6;

import javax.swing.*;

public class LlamarWhatsapp {
    public static void main(String[] args) {
        String telefono = JOptionPane.showInputDialog("Ingrese número de teléfono");
        System.out.println("https://api.whatsapp.com/send?phone=" + telefono);
    }
}
