package ch.salvomulas.jcalc.view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The operations panel for the main window
 */
public class OperationPad extends JPanel implements Components, ActionListener {

    private JButton add, subtract, multiply, divide;

    /**
     * Class constructor
     */
    public OperationPad () {
        this.setLayout(new GridLayout(4, 1, 5, 5));
        this.initComponents();
        this.addEvents();
        this.layoutComponents();
    }

    @Override
    public void initComponents() {
        add = new JButton("+");
        subtract = new JButton("-");
        multiply = new JButton("*");
        divide = new JButton("/");
    }

    @Override
    public void layoutComponents() {
        this.add(add);
        this.add(subtract);
        this.add(multiply);
        this.add(divide);
    }

    @Override
    public void addEvents() {
        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        add.setFocusable(false);
        subtract.setFocusable(false);
        multiply.setFocusable(false);
        divide.setFocusable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.add) {
            System.out.println("Button ADD pressed");
        } else if (e.getSource() == this.subtract) {
            System.out.println("Button SUBTRACT pressed");
        } else if (e.getSource() == this.multiply) {
            System.out.println("Button MULTIPLY pressed");
        } else if (e.getSource() == this.divide) {
            System.out.println("Button DIVIDE pressed");
        }
    }
}
