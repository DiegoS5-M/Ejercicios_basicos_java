
package ejercicios_basicos;
import java.util.Scanner;

public class Ejercicio_con19 {
    Scanner op = new Scanner(System.in);
    private final double TEMP_MIN = 18.0;
    private final double TEMP_MAX = 25.0;

    
    public Ejercicio_con19() {
        
    }

   
    private double solicitarTemperatura() {
        System.out.print(" Ingrese la temperatura actual: ");
        return op.nextDouble();
    }

    
    private boolean esTemperaturaValida(double temperatura) {
        return temperatura >= TEMP_MIN && temperatura <= TEMP_MAX;
    }

   
    public void ejecutarSensor() {
        double temperatura;
        do {
            temperatura = solicitarTemperatura();
            if (!esTemperaturaValida(temperatura)) {
                System.out.println(" Alerta: Temperatura fuera del rango aceptable (" + TEMP_MIN + "°C - " + TEMP_MAX + "°C).");
            }
        } while (!esTemperaturaValida(temperatura));

        System.out.println(" La temperatura está dentro del rango aceptable. ");
    }
    
}
