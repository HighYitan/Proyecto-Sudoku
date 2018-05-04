package sudoku;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Casilla extends JTextField{
    private Tablero tablero;
    
    public Casilla(){
       setPreferredSize(new Dimension(30, 30));
       setBorder(BorderFactory.createLineBorder(new Color(90, 0, 182),2, false));
       Font fuenteCubierta = new Font("Verdana", Font.BOLD | Font.ITALIC, 30);
       setFont(fuenteCubierta);
       //setEnabled(false);
       setHorizontalAlignment(JTextField.CENTER);
    }
}
