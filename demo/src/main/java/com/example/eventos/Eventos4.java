package com.example.eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Eventos4 implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        // System.out.println("Coordenada X" + e.getX() + " Coordenada Y" + e.getY());
        // // Coordenadas del ratón
        // System.out.println("Cantidad de clicks: " + e.getClickCount()); // veriricar
        // si hacemos doble click
        // throw new UnsupportedOperationException("Unimplemented method
        // 'mouseClicked'");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
            System.out.println("Se ha pulsado el botón izquierdo del ratón");
        } else if (e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
            System.out.println("Se ha pulsado la rueda del ratón");
        } else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
            System.out.println("Se ha pulsado el botón derecho del ratón");
        }
        // throw new UnsupportedOperationException("Unimplemented method
        // 'mousePressed'");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Se ha soltado el botón del ratón");
        // throw new UnsupportedOperationException("Unimplemented method
        // 'mouseReleased'");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("El ratón ha entrado en la ventana");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'mouseEntered'");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("El ratón ha salido de la ventana");
        // throw new UnsupportedOperationException("Unimplemented method
        // 'mouseExited'");
    }

}
