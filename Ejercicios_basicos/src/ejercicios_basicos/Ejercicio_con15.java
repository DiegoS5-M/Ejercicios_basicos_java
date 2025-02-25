
package ejercicios_basicos;
import java.util.Scanner;


public class Ejercicio_con15 {
    Scanner op = new Scanner(System.in);
    private int numero;

    
    public Ejercicio_con15() {
        
    }

    
    private void solicitarNumero() {
        System.out.print(" Ingrese un número entero positivo: ");
        numero = op.nextInt();

        while (numero < 0) {
            System.out.print("️ Número inválido. Ingrese un número positivo: ");
            numero = op.nextInt();
        }
    }

    
    private void iniciarCuentaRegresiva() {
        System.out.println(" Iniciando cuenta regresiva...");
        while (numero >= 0) {
            System.out.println( numero);
            numero--;  // Restar 1 en cada iteración
        }
        System.out.println(" ¡Tiempo cumplido!");
    }

    
    public void ejecutar() {
        solicitarNumero();
        iniciarCuentaRegresiva();
    }
    
}
