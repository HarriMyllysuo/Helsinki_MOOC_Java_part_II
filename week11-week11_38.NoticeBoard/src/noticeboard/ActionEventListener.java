/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ActionEventListener implements ActionListener {
    
    private JTextField org;
    private JLabel dest;
    
    public ActionEventListener(JTextField origin, JLabel destination) {
        this.org = origin;
        this.dest = destination;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.dest.setText(this.org.getText());
        this.org.setText("");
    }
    
}
