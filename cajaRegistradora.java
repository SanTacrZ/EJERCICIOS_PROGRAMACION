import java.util.Scanner;
class CajaRegistradora {
    /*
 * algoritmo "Procesar Venta"
    real valorVenta, valorIva, valorTotal, valorPagado, valorDevuelto

    leer valorVenta
    valorIva = valorVenta * 0.19
    valorTotal = valorVenta + valorIva
    escribir "El valor total a pagar es: ", valorTotal
    leer valorPagado
    valorDevuelto = valorPagado - valorTotal
    escribir "El valor a devolver al cliente es: ", valorDevuelto
    escribir "********** FIN de la Transacción********"
    
finAlgoritmo

 */
    public static void main(String[] args) {
        procesarVenta();
    }
    public static void procesarVenta() {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar el valor de la venta
            System.out.print("Ingrese el valor de la venta: ");
            float valorVenta = (float)scanner.nextDouble();

            // Calcular el valor del IVA
            float valorIva = (float) (valorVenta * 0.19);

            // Calcular el valor total que debe pagar el cliente
            float valorTotal = valorVenta + valorIva;

            // Mostrar al cliente el valor total que debe pagar
            System.out.println("El valor total a pagar es: " + valorTotal);

            // Ingresar el valor que paga el cliente
            System.out.print("Ingrese el valor que paga el cliente: ");
            float valorPagado = (float)scanner.nextDouble();

            // Calcular el valor a devolver al cliente
            float valorDevuelto = valorPagado - valorTotal;

            // Mostrar el valor a devolver al cliente
            System.out.println("El valor a devolver al cliente es: " + valorDevuelto);
        }

        // Escribir ********** FIN de la Transacción********
        System.out.println("********** FIN de la Transacción********");
    }
}
