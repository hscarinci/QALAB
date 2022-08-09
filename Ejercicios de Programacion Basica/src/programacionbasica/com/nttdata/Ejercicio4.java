package programacionbasica.com.nttdata;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int x= 0;
        String codigovalido = "4567";
        String codigoingresado = "";
        Scanner cmd = new Scanner(System.in);



        do {System.out.println("Ingresar codigo");
            codigoingresado = cmd.nextLine();
            if (codigoingresado.contentEquals(codigovalido)) {
                System.out.println("es valido"); break;
            } else {

                System.out.println("es invalido");
                System.out.println("Su codigo es " + codigoingresado);
                System.out.println("Fallidos " + x);
                x++;
            }
        }
        while (x < 3) ;
    }
}
