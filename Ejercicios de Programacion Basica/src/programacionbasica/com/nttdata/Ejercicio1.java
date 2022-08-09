package programacionbasica.com.nttdata;

public class Ejercicio1 {
    /*DECLARAR LA VARIABLE “DIVISION1” CUYO VALOR SEA IGUAL ALA DIVISIÓN ENTRE LA VARIABLE “C” Y “B” RESPECTIVAMENTE;Y VALIDAR SI EL RESULTADO ES UN NUMERO POSITIVO,NEGATIVO, IGUAL A CERO O DIVISIÓN NO POSIBLE.*/
    public static void main(String[] args) {
        //Ejercicio 1
        //Declaracion
        int DIVISION1;
        int C;
        int B;
        //Inicailiazar o asiganacion
        C = -3;
        B = 1;
        DIVISION1 = C / B;

        System.out.println("El numero es " + DIVISION1);

        if (DIVISION1 > 0) {
            System.out.println("Es un numero positvo");
        } else if (DIVISION1 < 0) {
            System.out.println("Es un numero negativo");
        } else {
            System.out.println("Igual a cero o division no posible");
        }
    }
}
