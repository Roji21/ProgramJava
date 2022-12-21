/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package per41;

import javax.swing.JFrame;
import javax.swing.JComboBox;

/**
 *
 * @author Mahasiswa
 */
public class contoh {
    public static void main(String[] args) {
        JFrame f = new JFrame("Contoh Combo");
        String a [] = {"laa1","laa2","laa"};
        JComboBox cb = new JComboBox(a);
        cb.setBounds(50,100,95,30);
        f.add(cb);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
