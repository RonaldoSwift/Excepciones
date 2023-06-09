package exepciones;

import excepcionesPersonalizadas.MiExcepcionGenerica;
import excepcionesPersonalizadas.MiExcepcionNumerica;

/**
 *
 * @author Ronaldo Vargas
 */
public class Exepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MiExcepcionGenerica {
        
        try{
        String valorNumerico = "16";
        int numero = Utilitario.convertir(valorNumerico);
        System.out.print("El numero es: "+ numero);
        
        } catch (MiExcepcionNumerica e){
            
            System.err.println(e.getMessage());
            
        }catch (MiExcepcionGenerica e){
            
            System.err.println(e.getMessage());
            
        }
    }  
}
