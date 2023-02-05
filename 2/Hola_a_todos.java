import java.util.Scanner;

public class Hola_a_todos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cual es su nombre");
        String nombre = sc.nextLine();
        sc.close();
        
        if ( nombre.equals("Juan")||nombre.equals("Felipe")||nombre.equals("Ana")){
            System.out.print("Hola "+nombre+ ", que tengas un buen dia");
        }else{
            System.out.print("");
        }
    }
    
}
