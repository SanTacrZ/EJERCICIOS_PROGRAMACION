import java.util.Scanner;

public class binomio {

    public class ExpansiónBinomial {
        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Ingrese el valor de n: ");
                int n = scanner.nextInt();
                System.out.print("Ingrese el valor de x: ");
                int x = scanner.nextInt();
   
                for (int i = 0; i <= n; i++) {
                    int coeficiente = coeficienteBinomial(n, i);
                    int valor = coeficiente * (int) Math.pow(x, i);
                    System.out.println(coeficiente + "x^" + i + " = " + valor);
                }
            }
        }
    
        public static int coeficienteBinomial(int n, int k) {
            int resultado = 1;
            for (int i = 0; i < k; i++) {
                resultado = resultado * (n - i);
                resultado = resultado / (i + 1);
            }
            return resultado;
        }
    }
}
    


