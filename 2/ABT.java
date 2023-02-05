import java.util.Scanner;

public class ABT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int A = sc.nextInt();
        System.out.print("ingrrese el segundo numero: ");
        int B = sc.nextInt();
        sc.close();

        A = A - B;
        B = B + A;
        A = B - A;
        int T = A - B;

        System.out.println("A="+A);
        System.out.println("B="+B);
        System.out.println("T="+T);
    }
}
