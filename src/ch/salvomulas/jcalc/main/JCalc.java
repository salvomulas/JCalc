package ch.salvomulas.jcalc.main;
import ch.salvomulas.jcalc.view.*;

import javax.swing.*;

/**
 * JCalc - simple cross-platform Java calculator
 * Developed by Salvatore Mulas
 * @author Salvatore Mulas
 * @version 1.0
 */
public class JCalc {

    /**
     * Main method to run the application
     * @param args
     */
    public static void main (String [] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                    new Window();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
            }
        });
    }

}