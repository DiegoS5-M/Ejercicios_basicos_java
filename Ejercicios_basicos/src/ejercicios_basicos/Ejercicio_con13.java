
package ejercicios_basicos;
import java.util.Scanner;

public class Ejercicio_con13 {
    Scanner op = new Scanner(System.in);
    private int papelDisponible;
    

    // 🔹 Constructor: Inicializa la cantidad de papel en la impresora
    public Ejercicio_con13(int cantidadInicial) {
        this.papelDisponible = cantidadInicial;
        
    }

    // 🔹 Método 1: Imprimir páginas
    private void imprimirPaginas(int paginas) {
        if (paginas <= 0) {
            System.out.println("️ La cantidad de páginas debe ser mayor a 0.");
            return;
        }

        if (paginas > papelDisponible) {
            System.out.println(" No hay suficiente papel. Papel disponible: " + papelDisponible);
            return;
        }

        papelDisponible -= paginas;
        System.out.println(" Imprimiendo " + paginas + " páginas... ✅");
        System.out.println("Papel restante: " + papelDisponible);
    }

    // 🔹 Método 2: Mostrar estado de la impresora
    private void mostrarEstado() {
        System.out.println(" Estado de la impresora:");
        System.out.println("Papel disponible: " + papelDisponible);
    }

    // 🔹 Método 3: Iniciar la simulación de impresión
    public void iniciarImpresion() {
        while (papelDisponible > 0) {
            mostrarEstado();
            System.out.print("\nIngrese la cantidad de páginas a imprimir: ");
            int paginas = op.nextInt();
            imprimirPaginas(paginas);

            if (papelDisponible == 0) {
                System.out.println("\n🚨 ¡Se acabó el papel! No se pueden imprimir más páginas.");
                break;
            }

            System.out.print("\n¿Desea imprimir más páginas? (s/n): ");
            String respuesta = op.next().toLowerCase();
            if (!respuesta.equals("s")) {
                break;
            }
        }
    
    }
}
