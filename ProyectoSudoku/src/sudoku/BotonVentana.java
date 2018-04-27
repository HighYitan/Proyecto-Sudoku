package sudoku;
import java.awt.*;
import javax.swing.*;

public class BotonVentana extends JFrame {
 public BotonVentana() {
 super("Botón");
 setSize(200,100);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 Container cp = getContentPane();
 cp.setLayout(new FlowLayout());
 
    JButton boton = new JButton("¡Púlsame!");
    boton.addActionListener(new EventoBotonPulsado());
    cp.add(boton);
    
    JButton boton2 = new JButton("Limado");
    boton2.addActionListener(new EventoBotonPulsado());
    cp.add(boton2);
 }
}