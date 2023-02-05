import java.util.Scanner;

public class equivalente_en_pesos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el monto en COP: ");
        double cop = sc.nextDouble();
        sc.close();

        double usd = cop / 3650;
        double eur = cop / 3420;
        double cad = cop / 2283;
        double jpy = cop / 25.7;

        System.out.println(cop + " COP = " + usd + " USD");
        System.out.println(cop + " COP = " + eur + " EUR");
        System.out.println(cop + " COP = " + cad + " CAD");
        System.out.println(cop + " COP = " + jpy + " JPY");
    }
    
    
}
