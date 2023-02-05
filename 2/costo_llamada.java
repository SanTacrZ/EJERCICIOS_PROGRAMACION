import java.util.Scanner;

public class costo_llamada {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese la duracion de la llamada: ");
        int duracion = sc.nextInt();
        sc.close();

        double costo = 0;
        if (duracion <= 3) {
            costo = 0.5;
        } else {
            costo = 0.5 + 0.1 * (duracion - 3);
        }
        System.out.println("El costo de llamada es $" + costo);
    }
}
