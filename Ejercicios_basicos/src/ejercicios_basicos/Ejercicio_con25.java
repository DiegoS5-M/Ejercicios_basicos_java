
package ejercicios_basicos;
import java.util.Scanner;

public class Ejercicio_con25 {
    Scanner op = new Scanner(System.in);
    private String listaContactos; 

    
    public Ejercicio_con25() {
        
        this.listaContactos = "";
    }

    
    public void agregarContactos() {
        char continuar;

        do {
            System.out.print("Ingrese el nombre del contacto: ");
            String nombre = op.nextLine();

            System.out.print("Ingrese el número de teléfono: ");
            String telefono = op.nextLine();

            
            listaContactos +=   nombre + " - " + telefono + "\n";

            
            System.out.print("¿Desea agregar otro contacto? (S/N): ");
            continuar = op.nextLine().toUpperCase().charAt(0);

        } while (continuar == 'S');

        mostrarAgenda();
    }

    
    private void mostrarAgenda() {
        System.out.println(" **Agenda de Contactos:**");
        if (listaContactos.isEmpty()) {
            System.out.println("️ No se han registrado contactos.");
        } else {
            System.out.println(listaContactos);
        }
    }
}
