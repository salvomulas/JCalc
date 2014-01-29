package ch.salvomulas.jcalc.view;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Main view class for the GUI
 */
public class Window extends JFrame implements Components {

    private JPanel panel;
    private JTextField display;
    private JButton equals;

    /**
     * Method constructor
     */
    public Window () {
        super("JCalc");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        initComponents();
        layoutComponents();
    }

    @Override
    public void initComponents () {
        setVisible(true);
        equals = new JButton("=");
        panel = new JPanel (new BorderLayout(10,10));
        display = new JTextField();
    }

    @Override
    public void layoutComponents () {
        add(panel);
        display.setFont(new Font("SansSerif", Font.BOLD, 20));
        panel.add(display, BorderLayout.PAGE_START);
        panel.add(new OperationPad(), BorderLayout.LINE_START);
        panel.add(new NumPad(), BorderLayout.CENTER);
        panel.add(equals, BorderLayout.LINE_END);
        pack();
    }

}