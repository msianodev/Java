package com.example.eventos;

import java.awt.event.*;
import javax.swing.*;

public class Eventos2 extends JPanel implements WindowListener { // Implemento la interfaz WindowListener, estoy
                                                                 // obligado a implementar los 7 métodos
    public Eventos2() {

    }

    public void windowActivated(WindowEvent e) { // Activar ventana, se puede interactuar con ella. Es cuando volves a
                                                 // seleccionar la ventana (sin minimzar ni maximizar)
        System.out.println("Ventana activada");
    }

    public void windowClosed(WindowEvent e) { // Cerrar ventana, se ejecuta al cerrar la ventana, la diferencia con
                                              // closing es que este se ejecuta al cerrar la ventana
        System.out.println("Ventana cerrada");
    }

    public void windowClosing(WindowEvent e) { // Cerrar ventana, se ejecuta al cerrar la ventana la diferencia con
                                               // closed es que este se ejecuta antes de cerrar la ventana
        System.out.println("Cerrando ventana");
    }

    public void windowDeactivated(WindowEvent e) { // Desactivar ventana, no se puede interactuar con ella. Es cuando se
                                                   // selecciona otro programa y la ventana queda sin minimizar ni
                                                   // maximizar
        System.out.println("Ventana desactivada");
    }

    public void windowDeiconified(WindowEvent e) { // Restaurar ventana, despues de minimizar, la ventana se abre y
                                                   // aparece el cartel de restaurada y luego activada
        System.out.println("Ventana restaurada");
    }

    public void windowIconified(WindowEvent e) { // Minimizar ventana, sucede el evento al minimizar la ventana, también
                                                 // al minimizar va a lanzar ventana desactivada
        System.out.println("Ventana minimizada");
    }

    public void windowOpened(WindowEvent e) { // Al abrir la ventana, ni bien compilamos el programa aparecerá este
                                              // evento con su mensaje
        System.out.println("Ventana abierta");
    }

}
