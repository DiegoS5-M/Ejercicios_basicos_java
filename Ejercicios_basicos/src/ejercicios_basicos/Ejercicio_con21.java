
package ejercicios_basicos;
import java.util.Scanner;

public class Ejercicio_con21 {
    Scanner op = new Scanner(System.in);
    private String listaTareas; // Acumulador de texto para almacenar las tareas

    
    public Ejercicio_con21() {
        
        this.listaTareas = "";
    }

    
    public void agregarTareas() {
        char continuar;
        do {
            System.out.print("Ingrese la descripción de la tarea: ");
            op.nextLine(); // Limpiar buffer
            String descripcion = op.nextLine();

            System.out.print("Ingrese la fecha de vencimiento (dd/mm/aaaa): ");
            String fecha = op.next();

            // Agregar tarea al acumulador de texto
            listaTareas += "? " + descripcion + " - Fecha límite: " + fecha + "\n";

            System.out.print("¿Desea agregar otra tarea? (S/N): ");
            continuar = op.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        mostrarTareas();
    }

    
    private void mostrarTareas() {
        if (listaTareas.isEmpty()) {
            System.out.println("️ No hay tareas registradas.");
        } else {
            System.out.println(" **Lista de Tareas:**");
            System.out.println(listaTareas);
        }
    }
}
