package ch.salvomulas.jcalc.view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Main view class for the GUI
 */
public class Window extends JFrame implements Components, ActionListener {

    private JPanel panel;
    private JTextField display;
    private JButton equals;

    /**
     * Method constructor
     */
    public Window () {
        super("JCalc");
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.setResizable(false);
        this.setJMenuBar(new Menu());
        this.initComponents();
        this.addEvents();
        this.layoutComponents();
    }

    @Override
    public void initComponents () {
        this.setVisible(true);
        equals = new JButton("=");
        equals.setFocusable(false);
        panel = new JPanel (new BorderLayout(10,10));
        display = new JTextField();
        display.setFocusable(false);
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
        this.addKeyListener(new MainKeyListener());
        equals.addActionListener(this);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.equals) {
            System.out.println("Button EQUALS pressed");
        }
    }

    /**
     * Inner class for implementing the KeyListener on the entire window
     */
    class MainKeyListener extends KeyAdapter {
        public void keyTyped (KeyEvent e) {
            System.out.println(e.getKeyChar()+" Key pressed");
        }
    }

}