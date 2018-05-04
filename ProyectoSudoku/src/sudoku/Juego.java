package sudoku;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

public class Juego extends JFrame {

    private Semaforo semaforo;
    private Tablero tablero;
    private Sudoku sudoku;
    private ArrayList<Boton> botones;

    public Juego() {
        super("~~~ Sudoku ~~~");
        this.remove(this);
        this.revalidate();
        this.repaint();
        this.semaforo = new Semaforo();
        semaforo.setJuego(this);
       // this.tablero = new Tablero();
        this.sudoku = new Sudoku();
        
        this.tablero = new Tablero();
        
        tablero.rellenar(this, sudoku);
        this.botones = new ArrayList<Boton>();
        mostrarContenedor();

    }
    public void nuevoTablero(){
        this.remove(this);
        this.revalidate();
        this.repaint();
      this.semaforo = new Semaforo();
        semaforo.setJuego(this);
       // this.tablero = new Tablero();
        this.sudoku = new Sudoku();
        
        this.tablero = new Tablero();
        tablero.reiniciar(this, sudoku);
        
         this.botones = new ArrayList<Boton>();
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout());
        contenido(contenedor);
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

        encabezado.setBorder(BorderFactory.createLineBorder(new Color(90, 0, 182),10, false));
        encabezado.setBackground(Color.gray);
        contenedor.add(encabezado, BorderLayout.NORTH);
    }

    public Container contenido(Container contenedor) {
        remove(this);
        this.revalidate();
        this.repaint();
        JPanel contenido = new JPanel();
        contenido.setBorder(BorderFactory.createLineBorder(Color.BLACK,10, false));
        GridBagConstraints restriccion = new GridBagConstraints();
        contenido.setLayout(new GridBagLayout());

        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.gridx = 0;
        restriccion.gridy = 0;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 2;
        restriccion.weightx = 0.75;
        restriccion.weighty = 0.75;
        //Creación de elementos gráficos del sudoku de la primera caja
        //contenido.add(tablero, restriccion);
        //contenido.add(tablero, restriccion);
        //tablero.rellenar();
        
        //tablero.rellenar();
        contenido.add(tablero, restriccion);
        
        //gridCaja1.add(casilla, restriccion1);
       
        Boton start = crearBoton("~ Sudo-ku ~");
        //Boton botoner = (new Boton());
        start.setAccionar(1);
        start.setBackground(new Color(90, 0, 182));
        start.setBorder(BorderFactory.createLineBorder(Color.BLACK,6, false));
        start.setForeground(Color.red);
        start.setFocusPainted(false);
        start.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 30));
        
        //restriccion2.ipadx = 30;
        restriccion.ipady = 30;
        restriccion.fill = GridBagConstraints.HORIZONTAL;
        restriccion.gridx = 9;
        restriccion.gridy = 0;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 0.25;
        restriccion.weighty = 0.25;
        restriccion.anchor = GridBagConstraints.PAGE_START;
        restriccion.insets = new Insets(30, 10, 10, 10);
        
        contenido.add(start, restriccion);

        //restriccion2.ipadx = 30;
        //restriccion2.ipady = 30;
        restriccion.fill = GridBagConstraints.HORIZONTAL;
        restriccion.gridx = 9;
        restriccion.gridy = 1;
        restriccion.gridwidth = 1;
        restriccion.weightx = 0.25;
        restriccion.weighty = 0.25;
        restriccion.anchor = GridBagConstraints.PAGE_START;
        restriccion.insets = new Insets(10, 10, 10, 10);
        semaforo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contenido.add(semaforo, restriccion);

        contenido.setBackground(Color.gray);
        contenedor.add(contenido, BorderLayout.CENTER);
        return contenido;
    }

    public Semaforo getSemaforo() {
        return semaforo;
    }
    public Tablero getTablero() {
        return tablero;
    }
    public Boton crearBoton(String texto) {
        Boton boton = new Boton(texto);
        boton.setJuego(this);
        botones.add(boton);
        return boton;
    }
    public void setSemaforo(Semaforo semaforo) {
        this.semaforo = semaforo;
    }
    
}
