package ch.salvomulas.jcalc.view;
import javax.swing.*;
import java.awt.*;

/**
 * The numeric pad panel for the main window
 */
public class NumPad extends JPanel implements Components {

    private JButton [] num;
    private JButton dzero, dot;

    /**
     * Class constructor
     */
    public NumPad() {
        setLayout(new GridLayout(4,3,5,5));
        initComponents();
        layoutComponents();
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

    @Override
    public void layoutComponents() {
        add(num[7]);
        add(num[8]);
        add(num[9]);
        add(num[4]);
        add(num[5]);
        add(num[6]);
        add(num[1]);
        add(num[2]);
        add(num[3]);
        add(num[0]);
        add(dzero);
        add(dot);
    }

}
