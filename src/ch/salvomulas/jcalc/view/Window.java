package ch.salvomulas.jcalc.view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.initComponents();
        this.addEvents();
        this.layoutComponents();
    }

    @Override
    public void initComponents () {
        this.setVisible(true);
        equals = new JButton("=");
        panel = new JPanel (new BorderLayout(10,10));
        display = new JTextField();
    }

    @Override
    public void addEvents() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showConfirmDialog(Window.this,"Please confirm if you want to exit the application","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE);
                if (confirm == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
    }

    @Override
    public void layoutComponents () {
        this.add(panel);
        display.setFont(new Font("SansSerif", Font.BOLD, 20));
        panel.add(display, BorderLayout.PAGE_START);
        panel.add(new OperationPad(), BorderLayout.LINE_START);
        panel.add(new NumPad(), BorderLayout.CENTER);
        panel.add(equals, BorderLayout.LINE_END);
        this.pack();
    }

}