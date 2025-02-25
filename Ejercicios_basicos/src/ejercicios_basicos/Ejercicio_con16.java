
package ejercicios_basicos;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio_con16 {
    Scanner op = new Scanner(System.in);
    
    private int numeroSecreto;
    
   
    public Ejercicio_con16() {
        
        this.numeroSecreto = new Random().nextInt(100) + 1; // Número entre 1 y 100
    }

    
    private int solicitarNumero() {
        System.out.print("Ingresa un número entre 1 y 100: ");
        return op.nextInt();
    }

    
    private boolean verificarNumero(int numeroUsuario) {
        if (numeroUsuario > numeroSecreto) {
            System.out.println(" El número es menor.");
        } else if (numeroUsuario < numeroSecreto) {
            System.out.println(" El número es mayor.");
        } else {
            System.out.println("🎉 ¡Felicidades! Adivinaste el número: " + numeroSecreto);
            return true;
        }
        return false;
    }

    
    public void iniciarJuego() {
        System.out.println(" ¡Bienvenido al juego de adivinanza!");

        int intento;
        boolean adivinado = false;

        while (!adivinado) {
            intento = solicitarNumero();
            adivinado = verificarNumero(intento);
        }
        
        System.out.println(" Juego terminado. ¡Gracias por jugar!");
    }

    
}
