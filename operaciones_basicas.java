import java.util.Scanner;

public class operaciones_basicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        float sum, sub, div, mul, sq1, sq2, total;
        
        // Solicitar números al usuario
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextInt();
        
        // Realizar operaciones
        sum = num1 + num2;
        sub = num1 - num2;
        div = (float) num1 / num2;
        mul = num1 * num2;
        sq1 = (float)Math.pow(num1, 2);
        sq2 = (float)Math.pow(num2, 2);
        
        // Imprimir resultados
        System.out.println("La suma es: " + sum);
        System.out.println("La resta es: " + sub);
        System.out.println("La división es: " + div);
        System.out.println("La multiplicación es: " + mul);
        System.out.println("El cuadrado del primer número es: " + sq1);
        System.out.println("El cuadrado del segundo número es: " + sq2);
        
        // Sumar todos los resultados
        total = sum + sub + div + mul + sq1 + sq2;
        System.out.println("La suma de todos los resultados es: " + total);
    }
    
}
/*
 * Algoritmo "Operaciones básicas"

// Declarar variables
num1, num2, sum, sub, div, mul, sq1, sq2, total

// Solicitar números al usuario
Escribir "Ingrese el primer número: "
Leer num1
Escribir "Ingrese el segundo número: "
Leer num2

// Realizar operaciones
sum = num1 + num2
sub = num1 - num2
div = num1 / num2
mul = num1 * num2
sq1 = num1 ^ 2
sq2 = num2 ^ 2

// Imprimir resultados
Escribir "La suma es: ", sum
Escribir "La resta es: ", sub
Escribir "La división es: ", div
Escribir "La multiplicación es: ", mul
Escribir "El cuadrado del primer número es: ", sq1
Escribir "El cuadrado del segundo número es: ", sq2

// Sumar todos los resultados
total = sum + sub + div + mul + sq1 + sq2
Escribir "La suma de todos los resultados es: ", total
 */
