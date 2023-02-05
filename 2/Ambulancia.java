import java.util.Scanner;

public class Ambulancia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese pareja de coordenadas");
        int n = sc.nextInt(); // número de parejas de coordenadas
        System.out.print("coordenadas de la urgencia xu");
        int xu = sc.nextInt(); // coordenada x de la urgencia
        System.out.print("coordenadas de la urgencia yu");
        int yu = sc.nextInt(); // coordenada y de la urgencia
        double minDistance = Double.MAX_VALUE;
        int closestAmbulanceX = 0;
        int closestAmbulanceY = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("coordenadas de la ambulancia");
            int x = sc.nextInt(); // coordenada x de la ambulancia
            System.out.print("coordenadas de la ambulancia");
            int y = sc.nextInt(); // coordenada y de la ambulancia
            double distance = Math.sqrt(Math.pow(x - xu, 2) + Math.pow(y - yu, 2));
            if (distance < minDistance) {
                minDistance = distance;
                closestAmbulanceX = x;
                closestAmbulanceY = y;
            }
        }
        System.out.println("La ambulancia más cercana se encuentra en las coordenadas (" + closestAmbulanceX + ", " + closestAmbulanceY + ") y su distancia al accidente es de " + minDistance);
        sc.close(); // close the scanner
    }    
}
