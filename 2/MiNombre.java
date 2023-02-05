import java.util.Scanner;

public class MiNombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es su nombre");
        String nombre = sc.nextLine();
        sc.close();
        System.out.println("Hola "+ nombre);
    }
    
}
