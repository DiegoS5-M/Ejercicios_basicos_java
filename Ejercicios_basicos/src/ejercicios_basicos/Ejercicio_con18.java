
package ejercicios_basicos;
import java.util.Scanner;


public class Ejercicio_con18 {
    Scanner op = new Scanner(System.in);
    private double totalPedido;

    
    public Ejercicio_con18() {
        
        this.totalPedido = 0;
    }

    
    private void mostrarMenu() {
        System.out.println(" MENÚ DE COMIDA RÁPIDA ");
        System.out.println("Hamburguesa - $5.00");
        System.out.println("Pizza - $8.00");
        System.out.println("Papas Fritas - $3.50");
        System.out.println("Refresco - $2.00");
        System.out.println("Finalizar pedido");
        System.out.print("️ Seleccione una opción: ");
    }

    
    public void tomarPedido() {
        int opcion;
        do {
            mostrarMenu();
            opcion = op.nextInt();

            switch (opcion) {
                case 1:
                    totalPedido += 5.00;
                    System.out.println("️ Hamburguesa añadida.");
                    break;
                case 2:
                    totalPedido += 8.00;
                    System.out.println("️ Pizza añadida.");
                    break;
                case 3:
                    totalPedido += 3.50;
                    System.out.println("️ Papas Fritas añadidas.");
                    break;
                case 4:
                    totalPedido += 2.00;
                    System.out.println(" Refresco añadido.");
                    break;
                case 5:
                    System.out.println(" Finalizando pedido...");
                    break;
                default:
                    System.out.println(" Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 5);

        mostrarTotal();
    }

   
    private void mostrarTotal() {
        System.out.printf(" Total a pagar: $%.2f", totalPedido);
        System.out.println(" ¡Gracias por su compra!");
    }
    
}
