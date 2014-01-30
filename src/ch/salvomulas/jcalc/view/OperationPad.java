package ch.salvomulas.jcalc.view;
import javax.swing.*;
import java.awt.*;

/**
 * The operations panel for the main window
 */
public class OperationPad extends JPanel implements Components {

    private JButton add, subtract, multiply, divide;

    /**
     * Class constructor
     */
    public OperationPad () {
        this.setLayout(new GridLayout(4, 1, 5, 5));
        this.initComponents();
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

    }
}
