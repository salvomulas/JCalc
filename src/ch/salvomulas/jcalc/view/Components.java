package ch.salvomulas.jcalc.view;

/**
 * Interface for the declaration of required methods within the View
 */
public interface Components {

    /**
     * Method for initialisation of all GUI components
     */
    public void initComponents ();

    /**
     * Method for adding several events to the class
     */
    public void addEvents();

    /**
     * Method for drawing the layout of all initialised components
     */
    public void layoutComponents ();

}
