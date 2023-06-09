package exepciones;

import excepcionesPersonalizadas.MiExcepcionNumerica;
import excepcionesPersonalizadas.MiExcepcionGenerica;

/**
 *
 * @author Ronaldo Vargas
 */
public class Utilitario {
    
    public static int convertir(String numeroEnTexto)
        throws MiExcepcionNumerica, MiExcepcionGenerica {
        try{
           return Integer.parseInt(numeroEnTexto); 
        } catch(NumberFormatException s){
            throw new MiExcepcionNumerica();
        } catch(Exception ex){
            throw new MiExcepcionGenerica();
        }
    }
}
