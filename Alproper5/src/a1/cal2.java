/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author Mahasiswa
 */
public class cal2  {
    JButton b10,b11,b12,b13,b14,b15;
    JButton b[] = new JButton[10];
    int i,r,n1,n2;
    JTextField res = new JTextField(100);;
    char op;
    public cal2(){
        JFrame a = new JFrame("Calculator");
        a.setLayout(new BorderLayout());
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4,4));
        for (int j = 0; j <= 9; j++) {
            b[j] = new JButton(j+"");
            p.add(b[j]);
            b[j].addActionListener(null);
        }
        b10 = new JButton("+");
        p.add(b10);
        b10.addActionListener(null);
        
        b10 = new JButton("-");
        p.add(b10);
        b10.addActionListener(null);
        
        b10 = new JButton("*");
        p.add(b10);
        b10.addActionListener(null);
        
        b10 = new JButton("/");
        p.add(b10);
        b10.addActionListener(null);
        
        b10 = new JButton("=");
        p.add(b10);
        b10.addActionListener(null);
        
        b10 = new JButton("c");
        p.add(b10);
        b10.addActionListener(null);
        
        
        a.add(p,BorderLayout.CENTER);
        a.add(res,BorderLayout.NORTH);
        a.setVisible(true);
        a.setSize(400,400);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void ationPerformed(ActionEvent ae){
        JButton pb = (JButton) ae.getSource();
        if (pb == b15){
            r = n1 = n2 = 0;
            res.setText("");
        }else if (pb == b14){
            n2 = Integer.parseInt((res.getText()));
            eval();
            res.setText(""+r);
        }else{
            boolean opf = false;
            if(pb == b10){
                op = '+';
                opf=true;
            }
            if(pb == b11){
                op = '-';
                opf = true;
            }
            if (pb == b12){
                op = '*';
                opf = true;
            }
            if (pb == b13){
                op = '/';
                opf = true;
            }
            if (opf == false){
                for (int j = 0; j < 10; j++) {
                    if(pb == b[j]){
                        String t = res.getText();
                        t+=j;
                        res.setText(""+j);
                    }
                }
            }else{
                n1 = Integer.parseInt(res.getText());
                res.setText("");
            }
            
        }
    }
    int eval(){
        switch(op){
            case '+':
                r = n1+n2;
                break;
            case '-':
                r = n1-n2;
                break;
            case '*':
                r = n1*n2;
                break;
            case '/':
                r = n1/n2;
                break;
        }
        return 0;
    }
    public static void main(String[] args) {
        new cal2();
    }
}
