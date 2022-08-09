package programacionbasica.com.nttdata;

public class Ejercicio7 {

    public static void main(String[] args) {
        int arreglo[] = {10, 12, 15, 20};
        double suma, promedio;
        suma = 0;

        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];

        }
        promedio = suma / arreglo.length;
        System.out.println("El promedio es " + promedio);
    }

}
