/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package per4;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Mahasiswa
 */
public class contoh {
    public static void main(String[] args) {
        JFrame f = new JFrame("Contoh Menggunakan Buton");
        JButton b = new JButton ("Clik Disini");
        b.setBounds(50,50,95,30);
        JButton b1 = new JButton ("Laa");
        b1.setBounds(50,100,95,30);
        f.add(b);
        f.add(b1);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
