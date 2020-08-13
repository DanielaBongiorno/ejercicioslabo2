
import java.util.Calendar;
import java.util.Scanner;


/**
 *
 * @author Daniela
 */
public class trabajo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int nacimiento, actual, fecha;
        Scanner entrada = new Scanner (System.in);
        
        //Entrada de datos:
        System.out.println("Ingrese su fecha de nacimiento   ");
        nacimiento = entrada.nextInt();
        
        //Proceso:
        actual = Calendar.getInstance().get(Calendar.YEAR);
        fecha = actual - nacimiento;
        
        System.out.println("La edad es de años:  " +fecha);
        
    }
    
}
