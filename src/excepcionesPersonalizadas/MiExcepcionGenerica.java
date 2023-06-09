package excepcionesPersonalizadas;

/**
 *
 * @author Ronaldo Vargas
 */
public class MiExcepcionGenerica extends Exception {
    
    private final static String MESSAGE = ""
            + "Error de conversion numerica,"
            + "ingresa un texto que contenga un numero";

    public MiExcepcionGenerica() {
        super(MESSAGE);
    }
    
}
