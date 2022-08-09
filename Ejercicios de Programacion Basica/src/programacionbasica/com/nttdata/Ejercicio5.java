package programacionbasica.com.nttdata;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a = 0, b =1 , c, n;

        System.out.println("Ingresar cantidad de elementos para la serie: ");
        n = teclado.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(a);
            c = a+b;
            a=b;
            b=c;
        }
    }
    }

