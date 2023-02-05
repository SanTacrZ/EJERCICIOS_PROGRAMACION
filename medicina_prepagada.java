import java.util.Scanner;

public class medicina_prepagada {
    /*pseudocodigo al final */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la categoría (A, B, C): ");
        char category = scanner.next().charAt(0);
    
        switch (category) {
          case 'A':
            System.out.println("La edad de esta categoría es para hasta 25 años");
            System.out.println("La cuota que debe pagar mensual es de: $256.000");
            System.out.println("El copago servicios tipo 1 es de: $18.000. Los servicios son: Exámenes de laboratorio, terapias");
            System.out.println("El copago para servicios tipo 2 es de: $22.000. Los servicios son: Urgencias, Medicina General");
            System.out.println("El copago para servicios tipo 3 es de: $28.500. Los servicios son: Especialistas, Hospitalización diaria");
            break;
          case 'B':
            System.out.println("La edad de esta categoría es para Mayores a 25 años hasta 45 años");
            System.out.println("La cuota que debe pagar mensual es de: $323.500");
            System.out.println("El copago servicios tipo 1 es de: $19.200. Los servicios son: Exámenes de laboratorio, terapias");
            System.out.println("El copago para servicios tipo 2 es de: $24.100. Los servicios son: Urgencias, Medicina General");
            System.out.println("El copago para servicios tipo 3 es de: $29.700. Los servicios son: Especialistas, Hospitalización diaria");
            break;
          case 'C':
            System.out.println("La edad de esta categoría es para Mayores de 45 años");
            System.out.println("La cuota que debe pagar mensual es de: $414.200");
            System.out.println("El copago servicios tipo 1 es de: $22.500. Los servicios son: Exámenes de laboratorio, terapias");
            System.out.println("El copago para servicios tipo 2 es de: $27.800. Los servicios son: Urgencias, Medicina General");
            System.out.println("El copago para servicios tipo 3 es de: $36.700. Los servicios son: Especialistas, Hospitalización diaria");
            break;
          default:
            System.out.println("Categoría inválida. Por favor ingrese A, B o C.");
        }
    }
            /*
            * INICIO

        Declare categoria, monto_mensual, copago_tipo_1, copago_tipo_2, copago_tipo_3

        Leer categoria

        Si categoria es igual a "A"
            monto_mensual = 256000
            copago_tipo_1 = 18000
            copago_tipo_2 = 22000
            copago_tipo_3 = 28500

        Sino si categoria es igual a "B"
            monto_mensual = 323500
            copago_tipo_1 = 19200
            copago_tipo_2 = 24100
            copago_tipo_3 = 29700

        Sino
            monto_mensual = 414200
            copago_tipo_1 = 22500
            copago_tipo_2 = 27800
            copago_tipo_3 = 36700

        Escribir "La edad de esta categoría es para: "

        Si categoria es igual a "A"
            Escribir "Edad hasta 25 años"

        Sino si categoria es igual a "B"
            Escribir "Mayores a 25 años hasta 45 años"

        Sino
            Escribir "Mayores de 45 años"

        Escribir "La cuota que debe pagar mensual es de: $" + monto_mensual

        Escribir "El copago servicios tipo 1 es de: $" + copago_tipo_1 + ". Los servicios son: Exámenes de laboratorio, terapias"

        Escribir "El copago para servicios tipo 2 es de: $" + copago_tipo_2 + ". Los servicios son: Urgencias, Medicina General"

        Escribir "El copago para servicios tipo 3 es de: $" + copago_tipo_3 + ". Los servicios son: Especialistas, Hospitalización diaria"

        FIN
            */
}
