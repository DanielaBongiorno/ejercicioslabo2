
import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class trabajo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double rad;
        double pi;
        double cubo;
        double vol;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese el radio de la esfera   :");
        rad = entrada.nextInt();
        
        cubo = rad * rad * rad;
        
        vol = (4* 3.1416 * cubo)/3;
        
        System.out.println("El volumen de la esfera es   :" +vol);
    
    }
    
}
