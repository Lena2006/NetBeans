/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC1.view;

import MVC1.controller.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.text.View;

/**
 *
 * @author user
 */
public class SwingView implements ActionListener, View {
    private JFrame frame;
    private JList<String> list;
    private JButton add;
    private JButton remove;
    private JTextField field;
    private Controller controller;
     public SwingView() {
         initComponents();
         
     }

    public SwingView() {
    }

  

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSourse() == add) {
            controller.addAction(field.getText());
        } else if (e.getSource() == remove) {
            controller.removeAction(list.getSelectedValue());
            list.clearSelection();
        }
    }
    @Override
    public void dispose() {
        frame.dispose();
    }
    @Override
    public void 
            
}
