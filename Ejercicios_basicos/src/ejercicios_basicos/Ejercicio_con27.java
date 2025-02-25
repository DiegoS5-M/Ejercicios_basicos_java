
package ejercicios_basicos;
import java.util.Scanner;

public class Ejercicio_con27 {
    Scanner op = new Scanner(System.in);
    private double totalVentas;
    private String resumenVentas;

    
    public Ejercicio_con27() {
        
        this.totalVentas = 0;
        this.resumenVentas = "";
    }

    
    public void registrarVentas() {
        char continuar;

        do {
            System.out.print("Ingrese el nombre del producto: ");
            String producto = op.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            while (!op.hasNextDouble()) {
                System.out.println("⚠️ Entrada inválida. Ingrese un número válido.");
                op.next(); 
            }
            double precio = op.nextDouble();

            System.out.print("Ingrese la cantidad vendida: ");
            while (!op.hasNextInt()) {
                System.out.println("⚠️ Entrada inválida. Ingrese un número válido.");
                op.next(); 
            }
            int cantidad = op.nextInt();
            op.nextLine(); 

            double totalProducto = precio * cantidad;
            totalVentas += totalProducto;

            
            resumenVentas += String.format("- %s: %d unidades x $%.2f = $%.2f\n", producto, cantidad, precio, totalProducto);

            
            System.out.print("¿Desea registrar otra venta? (S/N): ");
            continuar = op.nextLine().toUpperCase().charAt(0);

        } while (continuar == 'S');

        mostrarResultados();
    }

    
    private void mostrarResultados() {
        System.out.println(" Resumen de ventas:");
        System.out.println(resumenVentas);
        System.out.println(" Total de ventas: $" + totalVentas);
    }
}
