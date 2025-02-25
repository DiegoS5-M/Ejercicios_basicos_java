
package ejercicios_basicos;
import java.util.Scanner;

public class Ejercicio_con20 {
    Scanner op = new Scanner(System.in);
    private double sumaNotas;
    private int cantidadNotas;
    private final double NOTA_APROBACION = 6.0; // Nota mínima para aprobar

    
    public Ejercicio_con20() {
        
        this.sumaNotas = 0;
        this.cantidadNotas = 0;
    }

    
    public void ingresarNotas() {
        char continuar;
        do {
            System.out.print("Ingrese la calificación del examen: ");
            double nota =op.nextDouble();
            sumaNotas += nota;
            cantidadNotas++;

            System.out.print("¿Desea ingresar otra calificación? (S/N): ");
            continuar = op.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        calcularPromedio();
    }

    
    private void calcularPromedio() {
        if (cantidadNotas == 0) {
            System.out.println("️ No se ingresaron calificaciones.");
            return;
        }

        double promedio = sumaNotas / cantidadNotas;
        System.out.println("Promedio final: " + promedio);

        if (promedio >= NOTA_APROBACION) {
            System.out.println(" ¡Felicidades! Has aprobado. ");
        } else {
            System.out.println(" Lo siento, has reprobado. ");
        }
    }
}
