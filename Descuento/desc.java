import javax.swing.JOptionPane;
public class desc {
    public static void main(String[] args) {
       
        double precio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de tu compra"));
        double apagar = 0;

        if (precio >= 300)
        {
            precio *= 0.80;
            JOptionPane.showMessageDialog(null, "Haz obtenido un descuento del 20%, tu valor a pagar es: " + precio);
        }else if (precio < 300)
        {
            JOptionPane.showMessageDialog(null, "Tu valor a pagar es: " + apagar);
        }
    }
}
