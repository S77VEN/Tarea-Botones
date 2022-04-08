
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ExcepcionNoOrden extends Exception{
    public ExcepcionNoOrden(JPanel panel){
        JOptionPane.showMessageDialog(panel, "No está ordenado.");
    }
    
}
