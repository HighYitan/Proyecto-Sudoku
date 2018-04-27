package sudoku;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class EventoBotonPulsado implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        if(str.equals("¡Púlsame!")){
            System.out.println("¡Gracias!");
        }
        else if (str.equals("Limado")){
            System.out.println("Soy Jesucristo");
        }
    }
}
