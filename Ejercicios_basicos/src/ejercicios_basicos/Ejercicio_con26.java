
package ejercicios_basicos;
import java.util.Scanner;

public class Ejercicio_con26 {
    Scanner op = new Scanner(System.in);
    private double sumaTotal; 

    
    public Ejercicio_con26() {
        
        this.sumaTotal = 0;
    }

    
    public void ingresarNumeros() {
        char continuar;

        do {
            System.out.print("Ingrese un número: ");
            // Validar si la entrada es un número
            while (!op.hasNextDouble()) {
                System.out.println("⚠️ Entrada inválida. Intente de nuevo.");
                op.next(); // Limpiar entrada incorrecta
            }
            double numero = op.nextDouble();
            op.nextLine(); // Consumir el salto de línea

            sumaTotal += numero; 

            
            System.out.print("¿Desea ingresar otro número? (S/N): ");
            continuar = op.nextLine().toUpperCase().charAt(0);

        } while (continuar == 'S');

        mostrarResultado();
    }

    
    private void mostrarResultado() {
        System.out.println("\n🔢 La suma total de los números ingresados es: " + sumaTotal);
    }

}
