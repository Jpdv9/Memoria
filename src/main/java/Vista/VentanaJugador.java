
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author jeanp
 */
public class VentanaJugador extends JFrame{
    private JLabel jlNombre;
    private JTextField txtNombre;
    private JButton btnIniciar;
    private JButton btnAtras;
    private JPanel jpContenido;
    
    public VentanaJugador(){
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        //Configuracion de ventana
        setTitle("MEMORIA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        
        //Configuracion del contenido
        jpContenido = new JPanel();
        add(jpContenido);
        
        jlNombre = new JLabel("Escriba tu nombre");
        jlNombre.setBounds(175,70,170,50);
        jlNombre.setFont(new Font("Perpetua Titling MT", Font.ROMAN_BASELINE, 15));
        
        txtNombre = new JTextField("");
        txtNombre.setBounds(148,150,200,30);
        txtNombre.setHorizontalAlignment(JTextField.CENTER);
        txtNombre.setForeground(Color.GRAY);
        txtNombre.setFont(new Font("arial", Font.BOLD, 20));
        
        
        btnIniciar = new JButton("INICIAR");
        btnIniciar.setBounds(175,200,150,40);
        btnIniciar.setAlignmentX(JButton.CENTER_ALIGNMENT);
        btnIniciar.setFocusable(false);
        btnIniciar.setFont(new Font ("Agency FB",Font.BOLD,25));
        
        btnAtras = new JButton ("ATRAS");
        btnAtras.setBounds(200,250,100,40);
        btnAtras.setAlignmentX(JButton.CENTER_ALIGNMENT);
        btnAtras.setFocusable(false);
        btnAtras.setFont(new Font ("Agency FB",Font.BOLD,25));
        
        jpContenido.setSize(500,400);
        jpContenido.setBounds(0,0,500,500);
        jpContenido.setLayout(null);
        
        jpContenido.add(jlNombre);
        jpContenido.add(txtNombre);
        jpContenido.add(btnIniciar);
        jpContenido.add(btnAtras);
        
        
        ActionListener iniciar = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                VentanaJuegoMemoria ventanajuegomemoria = new VentanaJuegoMemoria();
                dispose();
            }
        };
        
        btnIniciar.addActionListener(iniciar);
        
        ActionListener regresar = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                ventanaInicio ventanainicio = new ventanaInicio();
                dispose();
            }
        };
        
        btnAtras.addActionListener(regresar);
    }
    
}
