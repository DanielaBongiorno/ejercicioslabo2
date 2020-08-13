
import java.util.Scanner;


/**
 *
 * @author Daniela
 */
public class trabajo1 {

    public static void main(String[] args) {
        
        int num, hora, resto, min, seg;
        Scanner entrada = new Scanner (System.in);
        num = 4452
                
        //No hay entrada de datos
        
        
        //Proceso:
        hora = num/3600;
        resto = num%3600;
        min = resto/60;
        seg = resto%60;
        
        //Mostrar en pantalla:
        System.out.println("Horas:  " +hora);
        System.out.println("Minutos:  " +min);
        System.out.println("Segundos:  " +seg);
          
    }
    
}
