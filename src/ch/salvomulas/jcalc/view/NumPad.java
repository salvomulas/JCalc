package ch.salvomulas.jcalc.view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The numeric pad panel for the main window
 */
public class NumPad extends JPanel implements Components, ActionListener {

    private JButton [] num;
    private JButton dzero, dot;

    /**
     * Class constructor
     */
    public NumPad() {
        this.setLayout(new GridLayout(4,3,5,5));
        this.initComponents();
        this.addEvents();
        this.layoutComponents();
    }

    @Override
    public void initComponents() {
        num = new JButton [10];
        dzero = new JButton("00");
        dot = new JButton (".");
        for (int i = 0; i<num.length; i++) {
            num[i] = new JButton (Integer.toString(i));
        }
    }

    public void addEvents() {
        dzero.addActionListener(this);
        dot.addActionListener(this);
        dzero.setFocusable(false);
        dot.setFocusable(false);
        for (int i = 0; i<num.length; i++) {
            num[i].addActionListener(this);
            num[i].setFocusable(false);
        }
    }

    @Override
    public void layoutComponents() {
        this.add(num[7]);
        this.add(num[8]);
        this.add(num[9]);
        this.add(num[4]);
        this.add(num[5]);
        this.add(num[6]);
        this.add(num[1]);
        this.add(num[2]);
        this.add(num[3]);
        this.add(num[0]);
        this.add(dzero);
        this.add(dot);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.num[0]) {
            System.out.println("Button 0 pressed");
        } else if (e.getSource() == this.num[1]) {
            System.out.println("Button 1 pressed");
        } else if (e.getSource() == this.num[2]) {
            System.out.println("Button 2 pressed");
        } else if (e.getSource() == this.num[3]) {
            System.out.println("Button 3 pressed");
        } else if (e.getSource() == this.num[4]) {
            System.out.println("Button 4 pressed");
        } else if (e.getSource() == this.num[5]) {
            System.out.println("Button 5 pressed");
        } else if (e.getSource() == this.num[6]) {
            System.out.println("Button 6 pressed");
        } else if (e.getSource() == this.num[7]) {
            System.out.println("Button 7 pressed");
        } else if (e.getSource() == this.num[8]) {
            System.out.println("Button 8 pressed");
        } else if (e.getSource() == this.num[9]) {
            System.out.println("Button 9 pressed");
        } else if (e.getSource() == this.dzero) {
            System.out.println("Button 00 pressed");
        } else if (e.getSource() == this.dot) {
            System.out.println("Button dot pressed");
        }
    }
}
