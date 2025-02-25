
package ejercicios_basicos;
import java.util.Scanner;

public class Ejercicio_con22 {
    
   Scanner op = new Scanner(System.in);
    private String listaVentas; // Acumulador de texto para almacenar los productos vendidos
    private double totalVentas; // Acumulador del monto total

    
    public Ejercicio_con22() {
        
        this.listaVentas = "";
        this.totalVentas = 0.0;
    }

    
    public void registrarVentas() {
        char continuar;
        do {
            System.out.print("Ingrese el nombre del producto: ");
            op.nextLine(); // Limpiar buffer
            String producto = op.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            double precio = op.nextDouble();

            // Agregar venta al acumulador de texto
            listaVentas += " " + producto + " - $" + String.format("%.2f", precio) + "\n";

            // Sumar al total de ventas
            totalVentas += precio;

            System.out.print("¿Desea agregar otra venta? (S/N): ");
            continuar = op.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        mostrarResumen();
    }

    
    private void mostrarResumen() {
        System.out.println(" **Resumen de Ventas:**");
        if (listaVentas.isEmpty()) {
            System.out.println("️ No se registraron ventas.");
        } else {
            System.out.println(listaVentas);
            System.out.println(" **Total de Ventas:** $" + String.format("%.2f", totalVentas));
        }
    } 
    
}
