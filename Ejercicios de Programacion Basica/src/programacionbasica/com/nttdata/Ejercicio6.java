package programacionbasica.com.nttdata;
import java.util.Scanner;

public class
Ejercicio6 {

    public static void main(String[] args) {
        String frase = "";
        int a;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar una frase con al menos 3 palabras: ");
        frase = teclado.nextLine();

        String[] newStr = frase.split("\\s+");

        for (int i = 0; i < newStr.length; i++) {
            System.out.println(newStr[i]);
            a = newStr[i].length();
            System.out.println(a);


        }
    }
    }