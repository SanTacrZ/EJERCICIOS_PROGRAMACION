import java.util.Scanner;

public class Piscina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el volumen de agua en metros cúbicos: ");
        int volumen = sc.nextInt();
        System.out.print("Ingrese la temperatura deseada en grados Celsius: ");
        int temperatura = sc.nextInt();
        sc.close();

        if (volumen < 100 || volumen > 225) {
            System.out.println("Volumen de agua inválido. Debe estar entre 100 y 225 metros cúbicos.");
        } else if (temperatura < 75 || temperatura > 90) {
            System.out.println("Temperatura inválida. Debe estar entre 75 y 90 grados Celsius.");
        } else {
            double salinidad = 0;
            if (temperatura >= 75 && temperatura <= 80) {
                if (volumen >= 100 && volumen <= 150) {
                    salinidad = 0.75;
                }
            } else if (temperatura >= 81 && temperatura <= 85) {
                if (volumen >= 151 && volumen <= 175) {
                    salinidad = 0.80;
                }
            } else if (temperatura >= 86 && temperatura <= 90) {
                if (volumen >= 176 && volumen <= 225) {
                    salinidad = 0.90;
                }
            }
            if (salinidad != 0) {
                System.out.println("El nivel de salinidad debe estar en " + salinidad + ".");
            } else {
                System.out.println("Combinación inválida de temperatura y volumen. Por favor, vuelva a revisar las condiciones.");
            }
        }
    }
}

