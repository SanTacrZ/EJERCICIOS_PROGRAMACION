import java.util.Scanner;

public class Ecuacion {
    /*Algoritmo "Calcular valores equivalentes"

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
        System.out.print("Ingresa el valor de X: ");
        float x = scanner.nextFloat();

        float y = (float)((6 * Math.pow(x, 2)) + (7 * x) - 15);

        System.out.println("El valor de Y es: " + y);
    }
    
}
