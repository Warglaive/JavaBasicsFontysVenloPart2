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

/**
 *
 * @author Warglaive
 */
public class ActionEventListener implements ActionListener {
    
    private JTextField origin;
    private JLabel dest;
    
    public ActionEventListener(JTextField fField, JLabel label) {
        this.origin = fField;
        this.dest = label;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.dest.setText(this.origin.getText());
        this.origin.setText("");
    }
}
