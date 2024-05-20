package com.example.eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Eventos3 implements KeyListener {

    @Override
    public void keyPressed(KeyEvent e) { // se ejecuta cuando el usuario presiona una tecla
        int codigo = e.getKeyCode(); // obtengo el código de la tecla presionada
        System.out.println(codigo); // muestro el código de la tecla presionada
    }

    @Override
    public void keyTyped(KeyEvent e) { // se ejecuta cuando el usuario presiona y suelta una tecla
        char letra = e.getKeyChar(); // obtengo la letra presionada
        System.out.println(letra); // muestro la letra presionada
    }

    @Override
    public void keyReleased(KeyEvent e) { // se ejecuta cuando el usuario suelta una tecla

    }
}
