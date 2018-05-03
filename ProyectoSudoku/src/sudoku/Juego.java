package sudoku;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Juego extends JFrame {

    private Semaforo semaforo;
    private Tablero tablero;
    

    public Juego() {
        super("~~~ Sudoku ~~~");
        this.semaforo = new Semaforo();
        semaforo.setJuego(this);
        this.tablero = new Tablero();
        mostrarContenedor();

    }

    public void mostrarContenedor() {
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout());

        titulo(contenedor);
        contenido(contenedor);
    }

    public void titulo(Container contenedor) {
        JPanel encabezado = new JPanel();
        encabezado.setLayout(new FlowLayout());
        JLabel titulo = new JLabel("Sudoku");
        titulo.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 50));
        titulo.setForeground(Color.red);
        encabezado.add(titulo);

        encabezado.setBackground(Color.gray);
        contenedor.add(encabezado, BorderLayout.NORTH);
    }

    public void contenido(Container contenedor) {
        JPanel contenido = new JPanel();
        contenido.setBorder(BorderFactory.createLineBorder(Color.black,5, false));
        GridBagConstraints restriccion = new GridBagConstraints();
        contenido.setLayout(new GridBagLayout());


        restriccion.gridx = 0;
        restriccion.gridy = 0;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 0.1;
        restriccion.weighty = 0.1;
        //Creación de elementos gráficos del sudoku de la primera caja
        //contenido.add(tablero, restriccion);
        //contenido.add(tablero, restriccion);
        //tablero.rellenar();
        contenido.add(tablero, restriccion);
        //gridCaja1.add(casilla, restriccion1);
       
        JButton start = new JButton("Start");

        start.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 30));
        //restriccion2.ipadx = 30;
        restriccion.ipady = 30;
        restriccion.fill = GridBagConstraints.HORIZONTAL;
        restriccion.gridx = 9;
        restriccion.gridy = 3;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 0.5;
        restriccion.weighty = 0.5;
        restriccion.anchor = GridBagConstraints.PAGE_START;
        restriccion.insets = new Insets(10, 10, 10, 10);
        contenido.add(start, restriccion);

        //restriccion2.ipadx = 30;
        //restriccion2.ipady = 30;
        restriccion.fill = GridBagConstraints.HORIZONTAL;
        restriccion.gridx = 9;
        restriccion.gridy = 6;
        restriccion.gridwidth = 1;
        restriccion.weightx = 0.5;
        restriccion.weighty = 0.5;
        restriccion.anchor = GridBagConstraints.CENTER;
        restriccion.insets = new Insets(10, 10, 10, 10);
        semaforo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contenido.add(semaforo, restriccion);

        contenido.setBackground(Color.gray);
        contenedor.add(contenido, BorderLayout.CENTER);
    }

    public Semaforo getSemaforo() {
        return semaforo;
    }

    public void setSemaforo(Semaforo semaforo) {
        this.semaforo = semaforo;
    }
    
}
