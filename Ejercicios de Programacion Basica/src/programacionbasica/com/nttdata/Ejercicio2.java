package programacionbasica.com.nttdata;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 2");

        int maquina;
        maquina = 4;

        switch (maquina) {
            case 0:
                System.out.println("Haz marcado la opcion Llamar"); break;
            case 1:
                System.out.println("Haz marcado la opcion Enviar mensaje");break;
            case 2:
                System.out.println("Haz marcado la opcion Apagar");break;
            case 3:
                System.out.println("Haz marcado la opcion Reinciar");break;
            case 4:
                System.out.println("Haz marcado la opcion Autodestruir");break;
            default:
                System.out.println("No existe la opcion");
        }

    }

}
