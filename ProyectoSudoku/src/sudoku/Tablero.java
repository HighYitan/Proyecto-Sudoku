package sudoku;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.*;
import javax.swing.*;


public class Tablero extends JPanel {

    private Juego juego;
    private Sudoku sudoku;
    private Casilla casilla[][] = new Casilla[9][9];

    public Tablero() {
        //rellenar(juego,sudoku).remove(juego);
        setBorder(BorderFactory.createLineBorder(new Color(90, 0, 182),2, false));
        //rellenar();
    }
    public void reiniciar(Juego juego, Sudoku sudoku){
        String[][] sudokuRandom = (new Sudoku().getRandomSudoku());
        GridBagConstraints restriccion = new GridBagConstraints();
        setLayout(new GridBagLayout());
        String[][] sudokuVacio = {
            {"0", "0", "0", "0", "0", "0", "0", "0", "0"},
            {"0", "0", "0", "0", "0", "0", "0", "0", "0"},
            {"0", "0", "0", "0", "0", "0", "0", "0", "0"},
            {"0", "0", "0", "0", "0", "0", "0", "0", "0"},
            {"0", "0", "0", "0", "0", "0", "0", "0", "0"},
            {"0", "0", "0", "0", "0", "0", "0", "0", "0"},
            {"0", "0", "0", "0", "0", "0", "0", "0", "0"},
            {"0", "0", "0", "0", "0", "0", "0", "0", "0"},
            {"0", "0", "0", "0", "0", "0", "0", "0", "0"} 
        };
        for (int k = 0; k < 9; k++) {
            for (int l = 0; l < 9; l++) {
                if (sudokuRandom[k][l] != "0") {
                    CasillaFija casillaFija = new CasillaFija(sudokuVacio[k][l]);
                    casillaFija.setForeground(new Color(90, 0, 182));
                    add(casillaFija, restriccion);
                    casilla[k][l] = casillaFija;
                } else {
                    CasillaVariable casillaVariable = new CasillaVariable();
                    casillaVariable.setForeground(Color.red);
                    add(casillaVariable, restriccion);
                    casilla[k][l] = casillaVariable;
                }
            }
        }
        
    }
    public void rellenar(Juego juego, Sudoku sudoku){
        //juego.contenido(juego);
        remove(this);
        //remove(juego);

        String[][] sudokuRandom = (new Sudoku().getRandomSudoku());
        GridBagConstraints restriccion = new GridBagConstraints();
        setLayout(new GridBagLayout());
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Casilla casilla1 = new Casilla();
                
                casilla1.setText("");
                //JTextField casilla = new JTextField("1");
                restriccion.ipadx = 20;
                restriccion.ipady = 20;

                restriccion.fill = GridBagConstraints.BOTH;
                restriccion.gridx = j;
                restriccion.gridy = i;
                restriccion.gridwidth = 1;
                restriccion.weightx = 0.1;
                restriccion.weighty = 0.1;
                restriccion.insets = new Insets(1, 1, 1, 1);
                if (sudokuRandom[i][j] != "0") {
                    CasillaFija casillaFija = new CasillaFija(sudokuRandom[i][j]);
                    casillaFija.setForeground(new Color(90, 0, 182));
                    add(casillaFija, restriccion);
                    casilla[i][j] = casillaFija;
                } else {
                    CasillaVariable casillaVariable = new CasillaVariable();
                    casillaVariable.setForeground(Color.red);
                    add(casillaVariable, restriccion);
                    casilla[i][j] = casillaVariable;
                }
                //this.add(casilla1, restriccion);
                //casilla.addActionListener();
                //tuputamadre = (JPanel)(juego.getContentPane().getComponent(4));
                //tuputamadre.add(casilla, restriccion1);
            }
        }
        //return juego;
    }
   
    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }
    
    public Casilla[][] getCasillas() {
        return casilla;
    }

    public void setCaselles(Casilla[][] caselles) {
        this.casilla = casilla;
    }
}
