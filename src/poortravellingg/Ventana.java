
package poortravellingg;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {
   public JPanel panel; 
    public Ventana()      
    {
       
        this.setSize(1000, 1000);//tamaño de la ventana
       
        setTitle("POOL TRAVELLING");
        setLocationRelativeTo(null);//pone la ventana en el centro de la pantalla independientemenete del tipo de pantalla que seas
     
        crearPanel();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void crearPanel()
    {
        panel=new JPanel();
        panel.setBackground(Color.MAGENTA);
        this.getContentPane().add(panel);
        JLabel etiqueta= new JLabel("BIENVENIDO A POORTRAVELLING");
        etiqueta.setForeground(Color.WHITE);//cambia color de la letra
        etiqueta.setOpaque(true);// se cambia el diseño por defecto
        etiqueta.setBackground(Color.BLACK);// cambia color  de fondo de la etiqueta(bienvenid a poor)
        etiqueta.setFont(new Font("arial", 1, 45)); // tipo, estilo y tamaño
        JLabel etiqueta2Imagen= new JLabel(new ImageIcon("imagen.jpg"));//agrega imagen
        
        panel.add(etiqueta2Imagen);
        panel.add(etiqueta);
        
        
    }
    private void colocarBotones()
    {
        JButton boton1= new JButton();
      panel.add(boton1);
        
    }
    
}
