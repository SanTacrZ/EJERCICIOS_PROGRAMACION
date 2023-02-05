import java.util.Scanner;

public class factorial {
    
    
    
    public static int factorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
        factorial = factorial * i;
        }
        return factorial;
    }

    public static int combinatoria(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, i;
        double resultado = 0;
        double x;

        System.out.print("Ingrese el valor de n: ");
        n = entrada.nextInt();

        System.out.print("Ingrese el valor de x: ");
        x = entrada.nextDouble();

        for (i = 0; i <= n; i++) {
        resultado = resultado + combinatoria(n, i) * Math.pow(1-x, n-i) * Math.pow(x, i);
        System.out.println("El resultado es: " + resultado);
        }

        
          
    
    }
    
    
}
