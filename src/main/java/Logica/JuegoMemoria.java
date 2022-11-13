
package Logica;

import Usuario.Jugador;
import java.util.Random;


/**
 *
 * @author jeanp
 */
public final class JuegoMemoria {
    int [][] matriz;
    Random aleatorio;
    int segundos = 0;
    int minutos = 0;
    public static String cronometro = "";
    private Jugador jugador;
    
    
    
    public JuegoMemoria(){
        this.jugador = new Jugador();
        //this.tiempo();

    }
   
    public String getJugador(){
        return jugador.getNombre();
        
    }
    
    public void setJugador(String nombre){
        this.jugador.setNombre(nombre);
        
    }
    
    
    public void tiempo(){
        for(minutos = 0; minutos <= 59; minutos++){
            for(segundos = 0; segundos <= 59; segundos++){
                cronometro = minutos + ":" + segundos;
                delaySegundo();
            }
        } 
    }
    
    private static void delaySegundo(){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){}
    }
    
}
