/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg14file;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class ComponenteArchivo extends JFrame implements ActionListener {

    private Container contenedor;
    private JLabel labeltitulo;
    private JTextArea areatexto;
    private JButton botonabrir;
    private JButton botonguardar;
    private JScrollPane scrollpane;
    private JFileChooser filechooser;
    private String texto;

    public ComponenteArchivo() {

        contenedor = getContentPane();
        contenedor.setLayout(null);

        filechooser = new JFileChooser();

        labeltitulo = new JLabel();
        labeltitulo.setText("Componente de JFileChooser");
        labeltitulo.setBounds(110, 290, 180, 25);

        areatexto = new JTextArea();
        areatexto.setLineWrap(true);
        areatexto.setWrapStyleWord(true);

        scrollpane = new JScrollPane();
        scrollpane.setBounds(20, 50, 350, 270);
        scrollpane.setViewportView(areatexto);

        botonabrir = new JButton();
        botonabrir.setText("Abrir");
        botonabrir.setBounds(100, 330, 80, 25);
        botonabrir.addActionListener(this);

        botonguardar = new JButton();
        botonguardar.setText("Guardar");
        botonguardar.setBounds(220, 330, 80, 25);
        botonguardar.addActionListener(this);

        contenedor.add(labeltitulo);
        contenedor.add(scrollpane);
        contenedor.add(botonabrir);
        contenedor.add(botonguardar);

        setTitle("Ventana de JFileChooser");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonabrir) {
            try {

                abrirArchivo();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (e.getSource() == botonguardar) {
            try {

                guardarArchivo();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    private void abrirArchivo() {
        String aux = "";
        texto = "";
        try {
            filechooser.showOpenDialog(this);
            File abre = filechooser.getSelectedFile();

            if (abre != null) {
                StringBuilder contenido = new StringBuilder();
     
                try (BufferedReader lee = new BufferedReader(new FileReader(abre))) {
                    while ((aux = lee.readLine()) != null) {
                        contenido.append(aux).append("\n");
                    }
                }
                
                areatexto.setText(contenido.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void guardarArchivo() {
        try {
            String nombre = "";
            JFileChooser file = new JFileChooser();
            file.showSaveDialog(this);
            File guardar = file.getSelectedFile();

            if (guardar != null) {
                nombre = file.getSelectedFile().getName();
                try (FileWriter save = new FileWriter(guardar + ".txt")) {
                    save.write(areatexto.getText());
                }
                JOptionPane.showMessageDialog(null, "El archivo se guardó con éxito");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
