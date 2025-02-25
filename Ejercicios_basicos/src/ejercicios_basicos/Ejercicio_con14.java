
package ejercicios_basicos;
import java.util.Scanner;

public class Ejercicio_con14 {
   Scanner op = new Scanner(System.in);
    

   
    private double calcularTiempo(double distancia, double velocidad) {
        if (velocidad <= 0) {
            System.out.println("️ La velocidad debe ser mayor a 0.");
            return -1; // Valor inválido
        }
        return distancia / velocidad;
    }

   
    private void simularUnViaje() {
        System.out.print("Ingrese la distancia total del viaje (km): ");
        double distancia = op.nextDouble();

        System.out.print(" Ingrese la velocidad promedio del coche (km/h): ");
        double velocidad = op.nextDouble();

        double tiempo = calcularTiempo(distancia, velocidad);
        if (tiempo != -1) {
            System.out.printf(" Tiempo estimado de viaje: %.2f horas", tiempo);
        }
    }

    
    public void iniciarSimulacion() {
        while (true) {
            simularUnViaje();

            System.out.print("¿Desea calcular otro viaje? (s/n): ");
            String respuesta = op.next().toLowerCase();
            if (!respuesta.equals("s")) {
                break;
            }
        }

        System.out.println("️ ¡Buen viaje! ");
    }
   }
           


