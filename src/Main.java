import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            formulariocompilador form = new formulariocompilador();
            form.setTitle("Compilador Amarante");
            form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            form.pack();
            form.setLocationRelativeTo(null);
            form.setVisible(true);
        });
    }
}









