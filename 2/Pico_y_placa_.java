import java.util.Scanner;

public class Pico_y_placa_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el día de la semana (lunes, martes, etc.): ");
        String dia = sc.nextLine();
        System.out.print("Ingrese el último dígito de la placa del vehículo: ");
        int ultimoDigito = sc.nextInt();
        sc.close();
        boolean restriccion = false;
        int[] digitosRestringidos = {};
    
        switch (dia) {
            case "lunes":
                digitosRestringidos = new int[] {6, 9};
                break;
            case "martes":
                digitosRestringidos = new int[] {2, 3};
                break;
            case "miércoles":
                digitosRestringidos = new int[] {4, 8};
                break;
            case "jueves":
                digitosRestringidos = new int[] {0, 7};
                break;
            case "viernes":
                digitosRestringidos = new int[] {5, 1};
                break;
            default:
                System.out.println("No hay restricciones en fines de semana");
                break;
        }
        for (int i = 0; i < digitosRestringidos.length; i++) {
            if (ultimoDigito == digitosRestringidos[i]) {
                restriccion = true;
                break;
            }
        }
        if (restriccion) {
            System.out.println("El vehículo con placa terminada en " + ultimoDigito + " está sujeto a restricciones de Pico y Placa en " + dia);
        } else {
            System.out.println("El vehículo con placa terminada en " + ultimoDigito + " NO está sujeto a restricciones de Pico y Placa en " + dia);
        }
    }
    
    
}
