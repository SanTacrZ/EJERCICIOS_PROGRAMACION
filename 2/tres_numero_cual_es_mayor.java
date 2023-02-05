import java.util.Scanner;

public class tres_numero_cual_es_mayor {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int numero_1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero_2 = sc.nextInt();
        System.out.println("Ingrese el tercer numero");
        int numero_3 = sc.nextInt();
        sc.close();

        int maximo = numero_1;

        if(numero_2>maximo){
            maximo = numero_2;
        }
        if(numero_3>maximo){
            maximo = numero_3;
        }
        System.out.print("El numero mas grande es: "+maximo);
    }
}
