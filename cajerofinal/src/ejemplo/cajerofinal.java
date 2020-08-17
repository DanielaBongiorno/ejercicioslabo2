package ejemplo;

import java.util.Scanner;

public class cajerofinal {

    public static void main(String[] args) {
        int dinero, resto, resto2, resto3, resto4, qui, dosc, cien, mil;

        Scanner entrada = new Scanner(System.in);
        //Entrada de datos:
        System.out.println("Ingrese el dinero a extraer   ");
        dinero = entrada.nextInt();

        mil = dinero / 1000;
        resto = dinero % 1000;

        qui = resto / 500;
        resto2 = resto % 500;

        dosc = resto2 / 200;
        resto3 = resto2 % 200;

        cien = resto3 / 100;
        resto4 = resto3 / 100;

        System.out.println("La cantidad de billetes de mil es de:  " + mil);
        System.out.println("La cantidad de billetes de quinientos es de:  " + qui);
        System.out.println("La cantidad de billetes de doscientos es de:  " + dosc);
        System.out.println("La cantidad de billetes de cien es de:  " + cien);

    }
}
