package sudoku;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Casilla extends JTextField{
    private Tablero tablero;
    
    public Casilla(){
       setPreferredSize(new Dimension(30, 30));
       Font fuente = new Font("Verdana", Font.BOLD | Font.ITALIC, 30);
       setFont(fuente);
       setEnabled(false);
       setHorizontalAlignment(JTextField.CENTER);
    }
}
