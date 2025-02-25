
package ejercicios_basicos;
import java.util.Scanner;

public class Ejercicio_con12 {
    Scanner op = new Scanner(System.in);
    private double totalCompra;
    

    // 🔹 Constructor: Inicializa el total de la compra y el Scanner
    public Ejercicio_con12() {
        this.totalCompra = 0;
        
    }

    // 🔹 Método 1: Agregar un producto a la compra
    private void agregarProducto() {
        System.out.print("\nIngrese el precio del producto: $");
        double precio = op.nextDouble();

        System.out.print("Ingrese la cantidad: ");
        int cantidad = op.nextInt();

        if (precio <= 0 || cantidad <= 0) {
            System.out.println(" Precio o cantidad inválidos. Intente de nuevo.");
            return;
        }

        double costo = precio * cantidad;
        totalCompra += costo;
        System.out.println(" Producto agregado. Costo parcial: $" + costo);
    }

    // 🔹 Método 2: Mostrar el total de la compra
    private void mostrarTotal() {
        System.out.println(" El total de su compra es: $" + totalCompra);
    }

    // 🔹 Método 3: Iniciar la simulación de la tienda
    public void iniciarTienda() {
        boolean seguirComprando = true;

        while (seguirComprando) {
            agregarProducto();
            System.out.print("¿Desea agregar otro producto? (s/n): ");
            String respuesta = op.next().toLowerCase();
            seguirComprando = respuesta.equals("s");
        }

        mostrarTotal();
        System.out.println("?️ ¡Gracias por su compra!");
    }
}
