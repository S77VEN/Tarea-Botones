
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Ventana extends JFrame{
    int pos = 0;
    int suma = 0;
    public JPanel panel;
    public Ventana(){
        this.setSize(300,100);
        componentes();
    }
    private void componentes(){
        paneles();
        botones();
        }
    private void paneles(){
        panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setBackground(Color.RED);
    }
    public void presionar(JButton boton){
        int valorB = Integer.parseInt(boton.getName());
        try {
            if (pos == 0 & valorB == 1){
                pos = 1;}
            else{
                if (pos == 1 & valorB == 2){
                    pos = 2;}
                else{
                    if (pos == 2 & valorB == 3){
                        pos = 0;
                        JOptionPane.showMessageDialog(panel, "Lo lograste.");}
                    else{
                        throw new ExcepcionNoOrden(panel);}
                }
            }
        } catch (Exception e) {
            pos = 0;
        }  
    }
   
    private void botones(){
        JButton b1 = new JButton();
        JButton b2 = new JButton();
        JButton b3 = new JButton();
        b1.setName("1");
        b2.setName("2");
        b3.setName("3");
        b1.setText("Click1");
        b2.setText("Click2");
        b3.setText("Click3");
        
        ActionListener accion1 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                presionar(b1);
            }   
        };
        ActionListener accion2 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                presionar(b2);
            }    
        };
        ActionListener accion3 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                presionar(b3);
            } 
        };
            
        b1.addActionListener(accion1);
        b2.addActionListener(accion2);
        b3.addActionListener(accion3);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
    }
}