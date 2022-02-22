import javax.swing.JOptionPane;
import java.util.ArrayList;
public class DaVinvi {
    public static void main(String[] args) {
        //Encriptar 
        String frase = JOptionPane.showInputDialog("Ingresa una frase");
        int [] numero = new int[frase.length()];
        for(int i = 0; i < frase.length() ;i++)
        {
            int ascii = (int) frase.charAt(i);
            numero[i] = (ascii);
        }

        for(int i = 0; i < numero.length; i++)
            {
                numero[i] += 5;
            }

        for(int x : numero)
        {
            char y = (char) x;
            System.out.print(y);
        }
    }
}
