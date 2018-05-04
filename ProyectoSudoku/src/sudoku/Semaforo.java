package sudoku;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Semaforo extends JLabel /*implements ActionListener*/{
    
    private Juego juego;
    
    public Semaforo(){
        //ImageIcon img = new ImageIcon(getClass().getResource("yitan.jpg"));
        //JLabel imagen = new JLabel(img);
        //this.setIcon(new ImageIcon("yitan.jpg"));
        this.setIcon(new ImageIcon(getClass().getResource("yitan.jpg")));
        //this.revalidate();
        //this.repaint();
    }
    public void setRojo() {
        this.setIcon(new ImageIcon(getClass().getResource("suicidio.jpg")));
        juego.revalidate();
        juego.repaint();
    }
    
    public void setAmarillo() {
        this.setIcon(new ImageIcon(getClass().getResource("yitan.jpg")));
        juego.revalidate();
        juego.repaint();
    }
    
    public void setVerde() {
        this.setIcon(new ImageIcon(getClass().getResource("salvador.jpg"))); 
        juego.revalidate();
        juego.repaint();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //@Override
    public void actionPerformed(ActionEvent e){
        for(int i = 0; i<9;i++){
            for(int j = 0; j<9;j++){
                for(int cuadrantesFila = 0; cuadrantesFila<3;cuadrantesFila++){
                    for(int cuadrantesColumna = 0; cuadrantesColumna<3;cuadrantesColumna++){
                        
                    }
                }
            }
        }
    }
    public Juego getJuego(){
        return juego;
    }
    public void setJuego(Juego juego){
        this.juego = juego;
    }
}
