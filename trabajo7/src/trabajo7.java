
import java.util.Scanner;


/**
 *
 * @author Daniela
 */
public class trabajo7 {
    public static void main(String[] args) {
      
        int num, a, resto1, b, c;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese el valor de 3 cifras   :");
        num = entrada.nextInt();
        
        a = num/100;
        resto1 = num%100;
        b = resto1/10;
        c = resto1%10;
        
        
        System.out.println ("El primer número es   :" +a);
        System.out.println ("El segundo número es   :" +b);
        System.out.println ("El tercer número es   :" +c);
    }
    
}
