package sudoku;
import java.awt.*;
import javax.swing.*;

public class Juego extends JFrame {
    public Juego(){
        super("~~~ Sudoku ~~~");
        mostrarContenedor();
    }
    public void mostrarContenedor(){
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Container contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout());
        
        
        titulo(contenedor);
        contenido(contenedor);
        
    }   
    public void titulo(Container contenedor){
        JPanel encabezado = new JPanel();
        encabezado.setLayout(new FlowLayout());
        JLabel titulo = new JLabel("Sudoku");
        titulo.setFont(new Font("Verdana", Font.BOLD|Font.ITALIC, 50));
        titulo.setForeground(Color.red);
        encabezado.add(titulo);
        
        encabezado.setBackground(Color.gray);
        contenedor.add(encabezado, BorderLayout.NORTH);
    }
    public void contenido(Container contenedor){
        JPanel contenido = new JPanel();
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints restriccion = new GridBagConstraints();
        contenido.setLayout(gridbag);

        //Creación de cajas
        JPanel box1 = new JPanel();
        box1.setLayout(new BoxLayout(box1, BoxLayout.PAGE_AXIS));
        box1.setBorder(BorderFactory.createLineBorder(Color.black, 5, false));
        //GridBagLayout interno de la primera caja "box1"
        JPanel gridCaja1 = new JPanel();
        GridBagLayout gridbag1 = new GridBagLayout();
        GridBagConstraints restriccion1 = new GridBagConstraints();
        gridCaja1.setLayout(gridbag1);
        box1.add(gridCaja1, restriccion1);
      
        //restriccion.ipady = 100;
        restriccion.insets = new Insets(10,10,10,10);
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.gridwidth = 3;
        restriccion.gridheight = 1;
        restriccion.weightx = 0.75;
        restriccion.weighty = 0.75;
        restriccion.gridx = 0;
        restriccion.gridy = 0;
        restriccion.anchor = GridBagConstraints.PAGE_START;
        //Añadimos un BoxLayout dentro de mi gridLayout contenedor principal
        contenido.add(box1, restriccion);
        
        
        JPanel box2 = new JPanel();
        box2.setLayout(new BoxLayout(box2, BoxLayout.PAGE_AXIS));
        box2.setBorder(BorderFactory.createLineBorder(Color.black, 5, false));
        
        JPanel gridCaja2 = new JPanel();
        GridBagLayout gridbag2 = new GridBagLayout();
        GridBagConstraints restriccion2 = new GridBagConstraints();
        gridCaja2.setLayout(gridbag2);
        box2.add(gridCaja2, restriccion2);
        
        restriccion.weightx = 0.25;
        restriccion.weighty = 0.25;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.gridx = 3;
        restriccion.gridy = 0;
        restriccion.fill = GridBagConstraints.BOTH;
        
        contenido.add(box2, restriccion);
        
        //Creación de elementos gráficos del sudoku de la primera caja
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                JTextField casilla = new JTextField("1");
                casilla.setHorizontalAlignment(JTextField.CENTER);
                casilla.setHorizontalAlignment(JTextField.CENTER);
                casilla.setFont(new Font("Verdana", Font.BOLD|Font.ITALIC, 30));
                casilla.setEnabled(false);
                restriccion1.ipadx = 20;

                restriccion1.fill = GridBagConstraints.BOTH;
                restriccion1.gridx = i;
                restriccion1.gridy = j;
                restriccion1.gridwidth = 1;
                restriccion1.weightx = 0.1;
                restriccion1.weighty = 0.1;
                restriccion1.anchor = GridBagConstraints.PAGE_START;
                restriccion1.insets = new Insets(1,1,1,1);
                gridCaja1.add(casilla, restriccion1);
            }
        }
        
        JButton start = new JButton("Start");

        start.setFont(new Font("Verdana", Font.BOLD|Font.ITALIC, 30));
        //restriccion2.ipadx = 30;
        restriccion2.ipady = 30;
        restriccion2.fill = GridBagConstraints.HORIZONTAL;
        restriccion2.gridx = 0;
        restriccion2.gridy = 0;
        restriccion2.gridwidth = 1;
        restriccion2.weightx = 0.5;
        restriccion2.weighty = 0.5;
        restriccion2.anchor = GridBagConstraints.PAGE_START;
        restriccion2.insets = new Insets(10,10,10,10);
        gridCaja2.add(start, restriccion2);
        
        contenido.setBackground(Color.gray);
        contenedor.add(contenido, BorderLayout.CENTER);
    }
}
