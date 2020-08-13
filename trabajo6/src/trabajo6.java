
import java.util.Scanner;


/**
 *
 * @author Daniela
 */
public class trabajo6 {

    public static void main(String[] args) {
        
        double a, b, c, area, sp, p;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese el valor de a:   ");
        a = entrada.nextInt();
        
        System.out.println("Ingrese el valor de b:   ");
        b = entrada.nextInt();
        
        System.out.println("Ingrese el valor de c:   ");
        c = entrada.nextInt();
        
        p = a + b + c;
        sp = (a + b + c)/2;
        
        area = Math.sqrt ((sp * (p - a)*(p - b)*(p - c)));
        
        System.out.println("El área del triángulo es   :" +area);
    }
    
}
