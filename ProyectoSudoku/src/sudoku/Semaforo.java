package sudoku;

import java.awt.*;
import javax.swing.*;

public class Semaforo extends JLabel{
    
    private Juego juego;
    
    public Semaforo(){
        //ImageIcon img = new ImageIcon(getClass().getResource("yitan.jpg"));
        //JLabel imagen = new JLabel(img);
        //this.setIcon(new ImageIcon("yitan.jpg"));
        this.setIcon(new ImageIcon(getClass().getResource("yitan.jpg")));
    }
    public Juego getJuego(){
        return juego;
    }
    public void setJuego(Juego juego){
        this.juego = juego;
    }
}
