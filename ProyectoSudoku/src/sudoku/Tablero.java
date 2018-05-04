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
    
    public void rellenar(Juego juego, Sudoku sudoku){
        //juego.contenido(juego);
        //remove(this);
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
    public int comprobar(int[] array) {

        //comprobar si los numeros son adecuados
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 9 || array[i] < 1) {
                return 3;
            }
        }
        //comprobar si hay alguno repetido y además suman 45

        int suma = 0;
        for (int vuelta = 0; vuelta < array.length; vuelta++) {
            for (int i = 0, cuenta = 0; i < array.length; i++) {

                if (array[i] == vuelta) {
                    cuenta++;
                }

                if (cuenta > 1) {
                    return 2;
                }
            }
            suma += array[vuelta];

        }
        if (suma != 45) {
            return 2;
        } else {
            return 1;
        }

    }
    public int recorridoComprobar() {

        int[] array = new int[9];
        int resultado = 1;

        for (int c = 0; c < 9; c += 3) {
            for (int z = 0; z < 9; z += 3) {
                int w = c;
                if (c == 0) {
                    w = 3;
                }
                for (int x = c, cont = 0; x < w; x++) {
                    for (int y = z; y < w; y++, cont++) {
                        if (casilla[x][y].getText().equals("")) {
                            array[cont] = 0;
                        } else {
                            array[cont] = Integer.parseInt(casilla[x][y].getText());
                        }
                    }
                }
                if (comprobar(array) != 1) {
                    if (resultado != 3) {
                        resultado = (comprobar(array));
                    }
                }
            }
        }

        for (int x = 0; x < casilla.length; x++) {

            for (int y = 0; y < casilla.length; y++) {
                if (casilla[x][y].getText().equals("")) {
                    array[y] = 0;
                } else {
                    array[y] = Integer.parseInt(casilla[x][y].getText());
                }
            }

            if (comprobar(array) != 1) {
                if (resultado != 3) {

                    resultado = (comprobar(array));
                }
            }
        }

        for (int y = 0; y < casilla.length; y++) {

            for (int x = 0; x < casilla.length; x++) {
                if (casilla[x][y].getText().equals("")) {
                    array[y] = 0;
                } else {
                    array[y] = Integer.parseInt(casilla[x][y].getText());
                }
            }
        }

        if (comprobar(array) != 1) {
            if (resultado != 3) {

                resultado = (comprobar(array));
            }
        }

        return resultado;

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
