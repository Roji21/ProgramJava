/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
/**
 *
 * @author Mahasiswa
 */
public class cal1 {
    public cal1(){
        
    }
    public void actionPerformes(ActiveEvent ae) {
        
    }
    
    public static void main(String[] args) {
        JFrame f = new JFrame("Buttons");
        
        Container c = f.getContentPane();
        
        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());
        
        p1.setLayout(new GridLayout(4,4,4,4));
        final JTextField tf = new JTextField(100);
        Font myFontSize = tf.getFont().deriveFont(Font.BOLD,50f);
        tf.setFont(myFontSize);
        c.add(tf,BorderLayout.NORTH);
        
        final JButton n1 =new JButton("1");
        final JButton n2 =new JButton("2");
        final JButton n3 =new JButton("3");
        final JButton n4 =new JButton("4");
        final JButton n5 =new JButton("5");
        final JButton n6 =new JButton("6");
        final JButton n7 =new JButton("7");
        final JButton n8 =new JButton("8");
        final JButton n9 =new JButton("9");
        final JButton n0 =new JButton("0");
        final JButton n11 =new JButton("+");
        final JButton n12 =new JButton("-");
        final JButton n13 =new JButton("*");
        final JButton n14 =new JButton("/");
        final JButton n15 =new JButton("=");
        n1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String num1 = n1.getText();
                String global = tf.getText();
                global = global.concat(num1);
                tf.setText(global);
            }
        });
        n2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String num1 = n2.getText();
                String global = tf.getText();
                global = global.concat(num1);
                tf.setText(global);
            }
        });
        n3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String num1 = n3.getText();
                String global = tf.getText();
                global = global.concat(num1);
                tf.setText(global);
            }
        });
        n4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String num1 = n4.getText();
                String global = tf.getText();
                global = global.concat(num1);
                tf.setText(global);
            }
        });
        n5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String num1 = n5.getText();
                String global = tf.getText();
                global = global.concat(num1);
                tf.setText(global);
            }
        });
        n6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String num1 = n6.getText();
                String global = tf.getText();
                global = global.concat(num1);
                tf.setText(global);
            }
        });
        n7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String num1 = n7.getText();
                String global = tf.getText();
                global = global.concat(num1);
                tf.setText(global);
            }
        });
        n8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String num1 = n8.getText();
                String global = tf.getText();
                global = global.concat(num1);
                tf.setText(global);
            }
        });
        n9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String num1 = n9.getText();
                String global = tf.getText();
                global = global.concat(num1);
                tf.setText(global);
            }
        });
        n0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String num1 = n0.getText();
                String global = tf.getText();
                global = global.concat(num1);
                tf.setText(global);
            }
        });
        n11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String num1 = n11.getText();
                String global = tf.getText();
                global = global.concat(num1);
                tf.setText(global);
            }
        });
        n12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String num1 = n12.getText();
                String global = tf.getText();
                global = global.concat(num1);
                tf.setText(global);
            }
        });
        n13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String num1 = n13.getText();
                String global = tf.getText();
                global = global.concat(num1);
                tf.setText(global);
            }
        });
        n14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String num1 = n14.getText();
                String global = tf.getText();
                global = global.concat(num1);
                tf.setText(global);
            }
        });
        n15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String global = tf.getText();
                int a = Integer.parseInt(global);
                System.out.println(a);
//                ScriptEngineManager mgr = new ScriptEngineManager();
//                ScriptEngine engine = mgr.getEngineByName("JavaScript");
//                try{
//                    String s = engine.eval(global).toString();
//                    tf.setText(s);
//                }catch(ScriptException e1){
//                    e1.printStackTrace();
//                }
            }
        });
        final JButton n16 = new JButton("C");
        n16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String global = tf.getText();
                global = null;
                tf.setText(global);
            }
        });
        p1.add(n0);
        p1.add(n1);
        p1.add(n2);
        p1.add(n3);
        p1.add(n4);
        p1.add(n5);
        p1.add(n6);
        p1.add(n7);
        p1.add(n8);
        p1.add(n9);
        p1.add(n11);
        p1.add(n12);
        p1.add(n13);
        p1.add(n14);
        p1.add(n15);
        p1.add(n16);
        c.add(p1,BorderLayout.CENTER);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);
        f.setVisible(true);
        
                
    }
}
