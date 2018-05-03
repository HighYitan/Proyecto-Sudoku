package sudoku;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.*;
import javax.swing.*;


public class Tablero extends JPanel {

    private Juego juego;
    private Casilla casilla[][] = new Casilla[9][9];

    public Tablero() {
        
        //rellenar();
    }
    public void rellenar(Juego juego){
        //juego.contenido(juego);
        
        GridBagConstraints restriccion = new GridBagConstraints();
        setLayout(new GridBagLayout());
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                JTextField casilla = new JTextField("1");
                casilla.setHorizontalAlignment(JTextField.CENTER);
                casilla.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 30));
                casilla.setEnabled(false);
                casilla.setPreferredSize(new Dimension(30, 30));
                restriccion.ipadx = 20;
                restriccion.ipady = 20;

                restriccion.fill = GridBagConstraints.BOTH;
                restriccion.gridx = i;
                restriccion.gridy = j;
                restriccion.gridwidth = 1;
                restriccion.weightx = 0.1;
                restriccion.weighty = 0.1;
                restriccion.insets = new Insets(1, 1, 1, 1);
                add(casilla, restriccion);
                //casilla.addActionListener();
                //tuputamadre = (JPanel)(juego.getContentPane().getComponent(4));
                //tuputamadre.add(casilla, restriccion1);
            }
        }
    }
}
