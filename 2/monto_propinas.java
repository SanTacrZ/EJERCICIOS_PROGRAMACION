import java.util.Scanner;

public class monto_propinas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese el monto pagado: ");
        double monto = sc.nextDouble();
        System.out.print("Ingrese el nivel de satisfaccion (1 = Baja, 2 = Media, 3 = Alta): ");
        int satisfaccion = sc.nextInt();
        sc.close();

        double tip = 0;
        if (satisfaccion == 1) {
            tip = monto * 0.03;
        } else if (satisfaccion == 2) {
            tip = monto * 0.07;
        } else if (satisfaccion == 3) {
            tip = monto * 0.10;
        } else {
            System.out.println("nivel de satisfaccion baja.");
        }
        double tax = monto * 0.08;
        double total = monto + tip + tax;

        System.out.println("Monto propia: $" + tip);
        System.out.println("Cantidad impuesto: $" + tax);
        System.out.println("Total monto a pagar: $" + total);
    }
    
    
}
