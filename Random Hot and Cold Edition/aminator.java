import java.io.Console;
import java.util.Scanner;

public class aminator {    
   public static void main(String[] args) {
       int random = (int) (Math.random()*100);
       System.out.println ("Adivina mi batería");
       Scanner sc = new Scanner(System.in);
       int numusuario = sc.nextInt();
       int x = 1;
       System.out.println(random);

       while(random != numusuario)
        {
            x++;
            if(numusuario > random && numusuario < random+10 || numusuario  < random && numusuario > random-10)
            {
                System.out.println ("MUYYYY CERCAAA, intentalo de nuevo");
                numusuario = sc.nextInt();
            }
            if(numusuario > random+11 && numusuario < random || numusuario  < random-11 && numusuario > random-20)
            {
                System.out.println ("CERCA PERO NO TAN CERCA, intentalo de nuevo"); 
                numusuario = sc.nextInt();  
            }
            if(numusuario > random+21 && numusuario < random+30 || numusuario  < random-21 && numusuario > random-30)
            {
                System.out.println ("NI LEJOS NI CERCA, intentalo de nuevo"); 
                numusuario = sc.nextInt();  
            }
            if(numusuario > random+31 && numusuario < random+60 || numusuario  < random-31 && numusuario > random-60)
            {
                System.out.println ("LEJOS, intentalo de nuevo"); 
                numusuario = sc.nextInt();  
            }
            if(numusuario > random+61 && numusuario < random+100 || numusuario  < random-61 && numusuario > random-100)
            {
                System.out.println ("MUYYYY LEJOOOS, intentalo de nuevo"); 
                numusuario = sc.nextInt();  
            }
            
        }
        System.out.println ("Lo lograste en " + x + " intentos bb");
    }
}


