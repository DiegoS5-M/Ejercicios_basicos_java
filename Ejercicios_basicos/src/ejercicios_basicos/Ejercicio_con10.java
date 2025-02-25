
package ejercicios_basicos;
import java.util.Scanner;


public class Ejercicio_con10 {
    Scanner op = new Scanner(System.in);
    private final String[] platos = {"Pizza", "Hamburguesa", "Ensalada", "Refresco", "Café"};
    private final double[] precios = {8.50, 6.75, 5.00, 2.00, 1.50};
    private double total;
    

    // 🔹 Constructor: Inicializa el escáner y el total
    public Ejercicio_con10() {
        total = 0;
    }

    // 🔹 Método 1: Mostrar el menú
    public void mostrarMenu() {
        System.out.println("\n🍽️ MENÚ DEL RESTAURANTE 🍽️");
        for (int i = 0; i < platos.length; i++) {
            System.out.println((i + 1) + ". " + platos[i] + " - $" + precios[i]);
        }
        seleccionarPlatos();
    }

    // 🔹 Método 2: Seleccionar platos y calcular subtotal
    private void seleccionarPlatos() {
        while (true) {
            System.out.print("\nIngrese el número del plato (0 para finalizar): ");
            int opcion = op.nextInt();

            if (opcion == 0) {
                break;
            } else if (opcion >= 1 && opcion <= platos.length) {
                total += precios[opcion - 1];
                System.out.println("✅ " + platos[opcion - 1] + " añadido. Total actual: $" + total);
            } else {
                System.out.println("⚠️ Opción no válida.");
            }
        }

        calcularTotal();
    }

    // 🔹 Método 3: Calcular total con descuento
    private void calcularTotal() {
        System.out.println("\nMétodos de pago:");
        System.out.println("1. Efectivo (10% de descuento)");
        System.out.println("2. Tarjeta de crédito (5% de descuento)");
        System.out.println("3. Cheque (sin descuento)");
        System.out.print("Seleccione el método de pago: ");
        int metodoPago = op.nextInt();

        double descuento = (metodoPago == 1) ? total * 0.10 : (metodoPago == 2) ? total * 0.05 : 0;
        double totalFinal = total - descuento;

        System.out.println("\n💰 TOTAL A PAGAR 💰");
        System.out.println("Subtotal: $" + total);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total final: $" + totalFinal);
    }
    
}
