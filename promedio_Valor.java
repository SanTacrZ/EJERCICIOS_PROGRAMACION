import java.util.Scanner;

public class promedio_Valor {
    /*
 * Inicio
    Declarar establecimiento1, establecimiento2, establecimiento3, promedio como real
    Para i <- 1 hasta 3 hacer
        Leer "Ingrese el valor del producto en el establecimiento " + i + ":"
        Si i = 1 entonces
            establecimiento1 <- valor leido
        Sino si i = 2 entonces
            establecimiento2 <- valor leido
        Sino
            establecimiento3 <- valor leido
        Fin si
    Fin para
    promedio <- (establecimiento1 + establecimiento2 + establecimiento3) / 3
    Escribir "Valor del producto en el establecimiento 1: ", establecimiento1
    Escribir "Valor del producto en el establecimiento 2: ", establecimiento2
    Escribir "Valor del producto en el establecimiento 3: ", establecimiento3
    Escribir "Valor promedio del producto: ", promedio
Fin
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float establecimiento1, establecimiento2, establecimiento3, promedio;
        System.out.print("Ingrese el valor del producto en el establecimiento 1: ");
        establecimiento1 = scanner.nextFloat();
        System.out.print("Ingrese el valor del producto en el establecimiento 2: ");
        establecimiento2 = scanner.nextFloat();
        System.out.print("Ingrese el valor del producto en el establecimiento 3: ");
        establecimiento3 = scanner.nextFloat();
        promedio = (establecimiento1 + establecimiento2 + establecimiento3) / 3;
        System.out.println("Valor del producto en el establecimiento 1: " + establecimiento1);
        System.out.println("Valor del producto en el establecimiento 2: " + establecimiento2);
        System.out.println("Valor del producto en el establecimiento 3: " + establecimiento3);
        System.out.println("Valor promedio del producto: " + promedio);
    }
}

