import java.util.Scanner;

public class pico_y_placa {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el dia de la semana (Lunes, Martes, Miercoles, etc.): ");
        String dia = sc.nextLine();
        System.out.print("Ingrese el ultimo digito de la placa: ");
        int Ultimo_digito = sc.nextInt();
        sc.close();

        boolean restriccion = false;
        int[] restriccion_digito = {};

        switch (dia) {
            case "lunes":
            restriccion_digito = new int[] {1, 2};
                break;
            case "Martes":
            restriccion_digito = new int[] {3, 4};
                break;
            case "Miercoles":
            restriccion_digito = new int[] {5, 6};
                break;
            case "jueves":
            restriccion_digito = new int[] {7, 8};
                break;
            case "Viernes":
            restriccion_digito = new int[] {9, 0};
                break;
            default:
                System.out.println("Sin restricciones los fines de semana");
                break;
        }
        for (int i = 0; i < restriccion_digito.length; i++) {
            if (Ultimo_digito == restriccion_digito[i]) {
                restriccion = true;
                break;
            }
        }
        if (restriccion) {
            System.out.println("El auto con placa terminada en " + Ultimo_digito + " está sujeto a las restricciones de Pico y Placa el " + dia);
        } else {
            System.out.println("El auto con placa terminada en " + Ultimo_digito + " NO está sujeto a restricciones de Pico y Placa el " + dia);
        }
    }
    
    
}
