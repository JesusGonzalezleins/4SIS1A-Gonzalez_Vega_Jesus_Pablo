/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author pc
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;

public class Calculadora extends JFrame{


    private JTextField display;
    private double resultado;

    public Calculadora(){
        setTitle("Calculadora");
        setSize(800, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        resultado = 0;

        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Tahoma", Font.BOLD, 20));
        display.setHorizontalAlignment(JTextField.RIGHT);

        JPanel panelBotones = new JPanel(new GridLayout(4, 4));

        String[] botones = {"7", "8", "9",
                            "4", "5", "6",
                            "1", "2", "3", 
                            "0", ".", "="};

        for (String boton : botones) {
            JButton btn = new JButton(boton);
            btn.setFont(new Font("Tahoma", Font.BOLD, 20));
            btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    botonPresionado(e.getActionCommand());
                }
            });
            panelBotones.add(btn);
        }

        JButton btnSeno = new JButton("sin");
        btnSeno.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnSeno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularFuncionTrigonometrica("sin");
            }
        });

        JButton btnCoseno = new JButton("cos");
        btnCoseno.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnCoseno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularFuncionTrigonometrica("cos");
            }
        });

        JButton btnTangente = new JButton("tan");
        btnTangente.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnTangente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularFuncionTrigonometrica("tan");
            }
        });

        JButton btnPotencia = new JButton("^");
        btnPotencia.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnPotencia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularPotencia();
            }
        });

        JButton btnRaiz = new JButton("√");
        btnRaiz.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnRaiz.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularRaiz();
            }
        });

        JButton btnBorrar = new JButton("C");
        btnBorrar.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnBorrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                borrar();
            }
        });

        JPanel panelFunciones = new JPanel(new GridLayout(2, 3));
        panelFunciones.add(btnSeno);
        panelFunciones.add(btnCoseno);
        panelFunciones.add(btnTangente);
        panelFunciones.add(btnPotencia);
        panelFunciones.add(btnRaiz);
        panelFunciones.add(btnBorrar);

        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.add(display, BorderLayout.NORTH);
        panelPrincipal.add(panelBotones, BorderLayout.CENTER);
        panelPrincipal.add(panelFunciones, BorderLayout.SOUTH);

        add(panelPrincipal);

        setVisible(true);
    }

    private void botonPresionado(String valor) {
        if (valor.equals("=")) {
            try {
                resultado = evaluarExpresion(display.getText());
                display.setText(Double.toString(resultado));
            } catch (Exception e) {
                display.setText("Error");
            }
        } else {
            display.setText(display.getText() + valor);
        }
    }

    private double evaluarExpresion(String expresion) {
        return Double.parseDouble(expresion);
    }

    private void calcularFuncionTrigonometrica(String funcion) {
        double valor = Double.parseDouble(display.getText());
        switch (funcion) {
            case "sin":
                resultado = Math.sin(Math.toRadians(valor));
                break;
            case "cos":
                resultado = Math.cos(Math.toRadians(valor));
                break;
            case "tan":
                resultado = Math.tan(Math.toRadians(valor));
                break;
        }
        display.setText(Double.toString(resultado));
    }

    private void calcularPotencia() {
        double valor = Double.parseDouble(display.getText());
        resultado = Math.pow(valor, 2);
        display.setText(Double.toString(resultado));
    }

    private void calcularRaiz() {
        double valor = Double.parseDouble(display.getText());
        resultado = Math.sqrt(valor);
        display.setText(Double.toString(resultado));
    }

    private void borrar() {
        display.setText("");
        resultado = 0;
        
    }
public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            new Calculadora();
        }
    });
}

}