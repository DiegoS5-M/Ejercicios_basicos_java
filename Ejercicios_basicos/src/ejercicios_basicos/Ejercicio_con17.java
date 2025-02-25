
package ejercicios_basicos;
import java.util.Scanner;

public class Ejercicio_con17 {
    Scanner op = new Scanner(System.in);
    private StringBuilder listaLibros;

    
    public Ejercicio_con17() {
        
        this.listaLibros = new StringBuilder();
    }

    
    private String ingresarLibro() {
        System.out.print(" Ingrese el título del libro: ");
        String titulo = op.nextLine();

        System.out.print("️ Ingrese el autor del libro: ");
        String autor = op.nextLine();

        System.out.print(" Ingrese el número de páginas: ");
        int paginas = op.nextInt();
        op.nextLine(); // Limpiar el buffer

        return " Título: " + titulo + " | ️ Autor: " + autor + " |  Páginas: " + paginas ;
    }

    
    public void registrarLibros() {
        System.out.println(" Bienvenido al Registro de Biblioteca\n");
        char continuar;

        do {
            // Agrega el libro al acumulador
            listaLibros.append(ingresarLibro());

            System.out.print(" ¿Desea registrar otro libro? (S/N): ");
            continuar = op.nextLine().toUpperCase().charAt(0);

        } while (continuar == 'S');

        mostrarListaLibros();
    }

    
    private void mostrarListaLibros() {
        System.out.println(" Lista de libros registrados:\n" + listaLibros);
        System.out.println(" Registro finalizado. ¡Gracias por usar el sistema!");
    }
}
