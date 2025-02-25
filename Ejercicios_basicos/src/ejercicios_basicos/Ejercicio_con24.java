
package ejercicios_basicos;
import java.util.Scanner;

public class Ejercicio_con24 {
    Scanner op = new Scanner(System.in);
    private String listaProductos; // Acumulador de productos
    private double totalCompra; // Acumulador del total

    // 🔹 Constructor: Inicializa variables
    public Ejercicio_con24() {
        
        this.listaProductos = "";
        this.totalCompra = 0.0;
    }

    // 🔹 Método 1: Agregar productos al carrito
    public void realizarCompra() {
        char continuar;

        do {
            System.out.print("Ingrese el nombre del producto: ");
            String producto = op.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            double precio = op.nextDouble();
            op.nextLine(); // Limpiar buffer

            // Agregar información al acumulador de texto
            listaProductos += " " + producto + " - $" + precio + "\n";
            totalCompra += precio; // Sumar al total

            // Preguntar si desea agregar otro producto
            System.out.print("¿Desea agregar otro producto? (S/N): ");
            continuar = op.nextLine().toUpperCase().charAt(0);

        } while (continuar == 'S');

        mostrarResumen();
    }

    // 🔹 Método 2: Mostrar resumen de la compra
    private void mostrarResumen() {
        System.out.println(" **Resumen de su Compra:**");
        if (listaProductos.isEmpty()) {
            System.out.println(" No se agregaron productos al carrito.");
        } else {
            System.out.println(listaProductos);
            System.out.printf("Total a pagar: $%.2f\n", totalCompra);
        }
    }
    
}
