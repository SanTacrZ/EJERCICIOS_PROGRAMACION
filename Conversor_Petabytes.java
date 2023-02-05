import java.util.Scanner;

public class Conversor_Petabytes {
        /*
    Algoritmo "Calcular valores equivalentes"

    Inicio
    real petabytes
    real terabytes, gigabytes, megabytes, kilobytes

    Escribir "Ingrese la cantidad en Petabytes:"
    Leer petabytes

    terabytes <- petabytes / 1.0
    gigabytes <- petabytes / (1.0 * 1024)
    megabytes <- petabytes / (1.0 * 1024 * 1024)
    kilobytes <- petabytes / (1.0 * 1024 * 1024 * 1024)

    Escribir "Terabytes: ", terabytes
    Escribir "Gigabytes: ", gigabytes
    Escribir "Megabytes: ", megabytes
    Escribir "Kilobytes: ", kilobytes

    Fin
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en Petabytes: ");
        float petabytes = (float)scanner.nextFloat();

        float terabytes = (float)(petabytes / 1.0);
        float gigabytes = (float)(petabytes / (1.0 * 1024));
        float megabytes = (float)(petabytes / (1.0 * 1024 * 1024));
        float kilobytes = (float)(petabytes / (1.0 * 1024 * 1024 * 1024));
        System.out.println("*****************************************");
        System.out.println("Terabytes: " + terabytes);
        System.out.println("Gigabytes: " + gigabytes);
        System.out.println("Megabytes: " + megabytes);
        System.out.println("Kilobytes: " + kilobytes);
        System.out.println("*****************************************");
    }
    
}
