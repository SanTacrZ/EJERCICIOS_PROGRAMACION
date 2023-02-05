import java.util.Scanner;

public class Creciente_o_Decreciente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer");
        int numero_1 = sc.nextInt();
        System.out.println("Ingese el segundo numero");
        int numero_2 = sc.nextInt();
        sc.close();

        if ( numero_1 < numero_2){
            System.out.println("El numero esta en orden creciente");

        }else if(numero_1 > numero_2){
            System.out.print("El numero esta en orden decreciente");
        }else{
            System.out.print("Los numero son iguales");
        }
    }
    
}
