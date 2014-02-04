package ch.salvomulas.jcalc.main;

/**
 * Calculator class where all the calculations take place
 */
public class Calculator {

    private double result;
    private double actual;

    /**
     * Class constructor
     */
    public Calculator () {
        result = 0;
    }

    /**
     * Gets the final result of the calculation
     * @return the final result
     */
    public double getResult () {
        return result;
    }

    /**
     * Updates the actual input value
     * @param actual the actual number inserted by the user
     */
    public void updateActual (double actual) {
        this.actual = actual;
    }

    /**
     * Adds the source to the actual result
     * @param source second number for the addition
     */
    public void add (double source) {
        result =+ source;
    }

    /**
     * Adds the source to the actual result
     * @param source second number for the subtraction
     */
    public void subtract (double source) {
        result =- source;
    }

    /**
     * Adds the source to the actual result
     * @param source second number for the multiplication
     */
    public void multiply (double source) {
        result = result * source;
    }

    /**
     * Adds the source to the actual result
     * @param source second number for the division
     */
    public void divide (double source) {
        try {
            result = result / source;
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
        }
    }

    /**
     * Resets the result to zero
     */
    public void reset () {
        result = 0;
    }

}