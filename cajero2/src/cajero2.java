
import java.util.Scanner;

public class cajero2 {

    public static void main(String[] args) {
        int dinero, resto, mil = 0, qui = 0, dosc = 0, cien = 0;
        Scanner entrada = new Scanner(System.in);
        //Entrada de datos:
        System.out.println("Ingrese el dinero a extraer   ");
        dinero = entrada.nextInt();
        if (dinero > 0) {
            mil = dinero / 1000;
            resto = dinero % 1000;
            System.out.println("La cantidad de billetes de mil es de:  " + mil);
            switch (resto) {
                case (100):
                    cien = 1;
                    System.out.println("La cantidad de billetes de cien es de:  " + cien);
                    break;
                case (200):
                    dosc = 1;
                    System.out.println("La cantidad de billetes de doscientos es de:  " + dosc);
                    break;
                case (300):
                    dosc = 1;
                    cien = 1;
                    System.out.println("La cantidad de billetes de cien es de:  " + cien);
                    System.out.println("La cantidad de billetes de doscientos es de:  " + dosc);
                    break;
                case (400):
                    dosc = 2;
                    System.out.println("La cantidad de billetes de doscientos es de:  " + dosc);
                    break;
                case (500):
                    qui = 1;
                    System.out.println("La cantidad de billetes de quinientos es de:  " + qui);
                    break;
                case (600):
                    qui = 1;
                    cien = 1;
                    System.out.println("La cantidad de billetes de quinientos es de:  " + qui);
                    System.out.println("La cantidad de billetes de cien es de:  " + cien);
                    break;
                case (700):
                    qui = 1;
                    dosc = 1;
                    System.out.println("La cantidad de billetes de quinientos es de:  " + qui);
                    System.out.println("La cantidad de billetes de doscientos es de:  " + dosc);
                    break;
                case (800):
                    qui = 1;
                    dosc = 1;
                    cien = 1;
                    System.out.println("La cantidad de billetes de quinientos es de:  " + qui);
                    System.out.println("La cantidad de billetes de doscientos es de:  " + dosc);
                    System.out.println("La cantidad de billetes de cien es de:  " + cien);
                    break;
                case (900):
                    qui = 1;
                    dosc = 2;
                    System.out.println("La cantidad de billetes de quinientos es de:  " + qui);
                    System.out.println("La cantidad de billetes de doscientos es de:  " + dosc);
                    break;
            }
        } else {
            System.out.println("Valor incorrecto");
        }
    }
}
