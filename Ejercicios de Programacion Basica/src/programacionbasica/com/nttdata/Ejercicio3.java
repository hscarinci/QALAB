package programacionbasica.com.nttdata;

public class Ejercicio3 {
    /*Declarar una variable flotante (v1) y dividirla entre otra variable (v2) flotante hasta que su valor
       sea menor o igual a 1. Utilizar la sentencia While e imprimir el valor de la primera variable (v1)
       en cada iteración.
   Casos de Prueba:
   v1 = 50, v2 = 3. Salida: “16.666666”, “5.5555553”, “1.8518518”, “0.61728394”
   v1 = 100.6, v2 = 4.5. Salida: “22.355555”, “4.967901”, “1.103978”, “0.24532846”*/
    public static void main(String[] args) {
        System.out.println("Ejercicio 3");
        //Declarar una variable flotante (v1) y dividirla entre otra variable (v2)
        double v1;
        double v2;
        double salida;
        v1= 50;
        v2=3;
        double temp;
        double temp1;
        double temp2;

        int i = 4;
        while ( i >= 1){

            salida = v1 / v2;
            v1 = salida;
            System.out.println(salida);
            i--;

        }
    }

    }
