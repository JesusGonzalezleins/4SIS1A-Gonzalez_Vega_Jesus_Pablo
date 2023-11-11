package pkg11ventanita;

import javax.swing.*;

public class Main {

    private static JTextField usernameField;
    private static JPasswordField passwordField;
    private static JLabel resultLabel;

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Interfaz");
        ventana.setSize(370, 170);
        ventana.setBounds(470, 280, 350, 220);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        ventana.add(panel);

        agregarComponentes(panel);
        ventana.setVisible(true);
    }

    private static void agregarComponentes(JPanel panel) {
        panel.setLayout(null);

        JLabel userlabel = new JLabel("Nombre de usuario");
        userlabel.setBounds(10, 10, 120, 50);
        panel.add(userlabel);

        usernameField = new JTextField(20);
        usernameField.setBounds(160, 20, 160, 25);
        panel.add(usernameField);

        JLabel userpass = new JLabel("Contraseña");
        userpass.setBounds(10, 40, 80, 50);
        panel.add(userpass);

        passwordField = new JPasswordField(20);
        passwordField.setBounds(160, 50, 160, 25);
        panel.add(passwordField);

        JButton loginbutton = new JButton("Iniciar sesión");
        loginbutton.setBounds(10, 80, 120, 25);
        panel.add(loginbutton);

        resultLabel = new JLabel("");
        resultLabel.setBounds(10, 110, 300, 25);
        panel.add(resultLabel);

        loginbutton.addActionListener(e -> loginButtonClicked());
    }

    private static void loginButtonClicked() {
        String username = usernameField.getText();
        char[] passwordChars = passwordField.getPassword();
        String passtxt = new String(passwordChars);

        // Lógica de autenticación (debes implementar tu propia lógica aquí)
        if (username.equals("usuario") && passtxt.equals("contraseña")) {
            resultLabel.setText("Bienvenido");
        } else {
            resultLabel.setText("usuario no valido");
        }
    }
}
