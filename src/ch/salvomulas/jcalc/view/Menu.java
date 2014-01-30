package ch.salvomulas.jcalc.view;
import javax.swing.*;

/**
 * Menubar class for the main window
 */
public class Menu extends JMenuBar implements Components {

    private JMenu edit, view, help;
    private JMenuItem undo, redo, about;
    private JCheckBoxMenuItem viewSimple;

    public Menu() {
        this.initComponents();
        this.layoutComponents();
    }

    @Override
    public void initComponents() {
        undo = new JMenuItem ("Undo");
        redo = new JMenuItem ("Redo");
        viewSimple = new JCheckBoxMenuItem("Simple");
        about = new JMenuItem ("About");
        edit = new JMenu ("Edit");
        view = new JMenu ("View");
        help = new JMenu ("Help");
    }

    @Override
    public void addEvents() {

    }

    @Override
    public void layoutComponents() {
        this.add(edit);
        this.add(view);
        this.add(help);
        edit.add(undo);
        edit.add(redo);
        view.add(viewSimple);
        help.add(about);
    }

}
