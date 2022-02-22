import java.util.Scanner;

public class negative {
    public static void main(String[] args) {
    System.out.println ("Ingresa un número");
    Scanner sc = new Scanner(System.in);
    int numusuario = sc.nextInt();
    int x = 1;

    while(numusuario >= 0)
        {
            x++;
            if(numusuario>=0)
            {
                System.out.println ("Error NUMERO REQUERIDO NO INGRESADO");
                numusuario = sc.nextInt();
            }
        }
        System.out.println ("Sos un genio Che solo tardaste " + x + " intentos :)");
    }
}
