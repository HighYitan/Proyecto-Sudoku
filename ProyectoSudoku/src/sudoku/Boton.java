package sudoku;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Boton extends JButton{
    private Juego juego;
    private Sudoku sudoku;
    private Tablero tablero;
    public void EventoNuevaPartida(Juego juego) {
        juego = juego;
    }
    public class EventoStart implements ActionListener {
       
        public void actionPerformed(ActionEvent e) {
            //Boton.this.juego.getSemaforo().setAmarillo();
            //Boton.this.tablero.rellenar(juego, sudoku);
            //Boton.this.juego.enable();
            //Boton.this.juego.contenido(contenedor).remove(this.tablero);
            //Boton.this.juego.remove(juego.contenido(juego));
            //Boton.this.juego.contenido(juego).remove(juego);
            //Boton.this.tablero.rellenar(juego,sudoku).remove(juego);
            //Boton.this.juego.remove(this);
            //Boton.this.tablero.remove(tablero);
            //Boton.this.juego.getTablero().remove(tablero.rellenar(juego,sudoku));
            Juego juego1 = new Juego();
            Boton.this.juego.getTablero().setJuego(juego1);
            
            Juego juego2 = Boton.this.juego;
            Sudoku sudoku1 = new Sudoku();
            Boton.this.juego.contenido(juego);
            Boton.this.juego.getTablero().rellenar(juego, sudoku);
            //Boton.this.juego.getSemaforo().setAmarillo();
        }
    }
    public void setAccionar(int algia) {
        switch (algia) {
            case 1:
            addActionListener(new Boton.EventoStart());
            break;
        }
    }
    public Boton(String texto) {
        super(texto);

    }
    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }
    public Tablero getTablero() {
        return tablero;
    }
    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }
    public Sudoku getSudoku() {
        return sudoku;
    }
    public void setSudoku(Sudoku sudoku) {
        this.sudoku = sudoku;
    }
}
