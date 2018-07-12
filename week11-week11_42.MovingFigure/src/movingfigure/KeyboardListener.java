/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListener implements KeyListener {
    
    private Component comp;
    private Figure figure;
    
    public KeyboardListener(Component component, Figure figure) {
        this.comp = component;
        this.figure = figure;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        switch (ke.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                figure.move(-50, 0);
                comp.repaint();
                break;
            case KeyEvent.VK_RIGHT:
                figure.move(50, 0);
                comp.repaint();
                break;
            case KeyEvent.VK_UP:
                figure.move(0, -50);
                comp.repaint();
                break;
            case KeyEvent.VK_DOWN:
                figure.move(0, 50);
                comp.repaint();
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
