package com.example.eventos;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.*;

public class Eventos1 extends JPanel implements ActionListener {

    JButton botonAzul = new JButton("Boton Azul");
    JButton botonAmarillo = new JButton("Boton Amarillo");
    JButton botonRojo = new JButton("Boton Rojo");

    public Eventos1() { // constructor
        add(botonAzul); // agrego el boton a la capa
        botonAzul.addActionListener(this); // agrego el evento al boton, this es el objeto que implementa la interfaz
        // desencadeno un evento de tipo Listener que es como hacer click.

        add(botonAmarillo);
        botonAmarillo.addActionListener(this);

        add(botonRojo);
        botonRojo.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) { // (obligatorio) implemento el metodo de la interfaz ActionListener
        Object botonPulsado = e.getSource(); // obtengo el objeto que ha desencadenado el evento
        if (botonPulsado == botonAzul) {
            setBackground(Color.BLUE);
        } else if (botonPulsado == botonAmarillo) {
            setBackground(Color.YELLOW);
        } else {
            setBackground(Color.RED);
        }
    }
}
