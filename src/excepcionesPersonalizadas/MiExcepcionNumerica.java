package excepcionesPersonalizadas;

/**
 *
 * @author Ronaldo Vargas
 */
public class MiExcepcionNumerica extends Exception{

    private final static String MENSAJE = ""
            +"Error de convercion numerica,"
            +" ingresa un texto que contenga un numero";
    
    public MiExcepcionNumerica() {
        
        //Esta llamando al constructor de la clase padre
        super(MENSAJE);
    }
}
