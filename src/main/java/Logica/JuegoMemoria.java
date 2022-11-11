/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

/**
 *
 * @author jeanp
 */
public class JuegoMemoria {
    public static final int intentitos = 3;
    int matriz [][] = new int[4][6];
    int segundos;
    int minutos;
    int puntuacion;
    private JLabel jlMatriz[][];
    
    
    private void matrizImagenes(){
        jlMatriz = new JLabel[4][6];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 5; i++){
            jlMatriz[i][j] = new JLabel();
            jlMatriz[i][j].setSize(jlMatriz[i][j].getWidth(), jlMatriz[i][j].getHeight());
            //Espacios entre imagenes
            jlMatriz[i][j].setBounds(150+(j*50), 30+(j*100), 125, 150);
            }
        }
            
        
    }
    
}
