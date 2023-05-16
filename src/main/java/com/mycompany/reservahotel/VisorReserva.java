package com.mycompany.reservahotel;

/* @author Manuel 
 * @date 12/05/2023
 * @time 14:20:11
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VisorReserva extends JFrame {

    public VisorReserva() {
        setTitle("Hotel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel tituloLabel = new JLabel("Bienvenido al Hotel");
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 24));

        JLabel descripcionLabel = new JLabel("Este es un hotel de lujo ubicado en un lugar paradisíaco.");
        ImageIcon imagenFondo = new ImageIcon("src/main/resources/portada.png");

        JLabel etiquetaFondo = new JLabel(imagenFondo);
        etiquetaFondo.setLayout(new BorderLayout());

        JButton botonReservar = new JButton("Reservar ahora");
        botonReservar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(VisorReserva.this, "¡Reserva realizada con éxito!");
            }
        });

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.CENTER;

        panel.add(tituloLabel, gbc);

        gbc.gridy = 1;
        panel.add(descripcionLabel, gbc);
        gbc.gridy = 2;

        panel.add(botonReservar, gbc);
        gbc.gridy = 3;
        panel.add(etiquetaFondo, gbc);

        getContentPane().add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}