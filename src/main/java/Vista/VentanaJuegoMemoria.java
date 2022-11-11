
package Vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Logica.JuegoMemoria;
import java.awt.Font;

/**
 *
 * @author jeanp
 */
public class VentanaJuegoMemoria extends JFrame{
    
    private JLabel jlEtiqueta;
    private JLabel jlNombreJugador;
    private JLabel jlTiempo;
    private JPanel jpContenido;
    private JLabel jlMatriz[][];
    
    public VentanaJuegoMemoria(){
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        //Configuracion de ventana
        setTitle("MEMORIA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(750,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        
        //Configuracion del contenido
        
        jpContenido = new JPanel();
        add(jpContenido);
        
        jlNombreJugador = new JLabel();
        jlNombreJugador.setBounds(150, 400, 100, 20);
        jlNombreJugador.setFont(new Font ("Perpetua Titling MT", Font.ROMAN_BASELINE, 15));
        
        jpContenido.add(jlNombreJugador);
        
        
        //matriz donde se van a mostrar las imagenes en la ventana
            
        
                
        
        
        
    }
    
}
