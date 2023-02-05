import java.util.Scanner;

public class Ejericio_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el numero " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }
        System.out.print("ingrese el numero averificar: ");
        int verificar = sc.nextInt();
        sc.close();
        boolean contiene = false;
        for (int i = 0; i < 5; i++) {
            if (numeros[i] == verificar) {
                contiene = true;
                break;
            }
        }
        if (contiene) {
            System.out.println("El "+verificar + " esta contenido en los 5 numeros");
        } else {
            System.out.println("El "+verificar + " no esta contenido en los 5 numeros");
        }
    }
}
