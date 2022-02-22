import javax.swing.JOptionPane;
import java.util.ArrayList;
public class ala {
    public static void main(String[] args) {
        
        ArrayList<Integer> numero = new ArrayList<>();
    
        for (int i = 0; i < 5; i++)
        {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));
        numero.add(n);
        }
        JOptionPane.showMessageDialog(null, "Tus numeros son" + numero);
    }
}
