package sudoku;

import java.awt.*;
import javax.swing.*;

public class CasillaFija extends Casilla {
    private Sudoku sudoku;
    public CasillaFija(String sudoku){
        super();
        this.setText(sudoku);
        setEditable(false);
        //Integer.parseInt();
    }
        
}
