
package ejercicios_basicos;
import java.util.Scanner;


public class Ejercicio_con9 {
    Scanner op = new Scanner(System.in);
    private int puntos;
    private int partidosJugados;
    

    // 🔹 Constructor: Inicializa los puntos y partidos jugados
    public Ejercicio_con9() {
        this.puntos = 0;
        this.partidosJugados = 0;
    }

    // 🔹 Método 1: Registrar el resultado del partido
    public void registrarPartido() {
        System.out.println("\nIngrese el resultado del partido:");
        System.out.println("G - Ganado (+3 puntos)");
        System.out.println("E - Empatado (+1 punto)");
        System.out.println("P - Perdido (+0 puntos)");
        System.out.print("Resultado: ");
        char resultado = op.next().toUpperCase().charAt(0);

        actualizarPuntos(resultado);
    }

    // 🔹 Método 2: Actualizar los puntos según el resultado
    private void actualizarPuntos(char resultado) {
        switch (resultado) {
            case 'G':
                puntos += 3;
                partidosJugados++;
                System.out.println(" Partido ganado. Se suman 3 puntos.");
                break;
            case 'E':
                puntos += 1;
                partidosJugados++;
                System.out.println(" Partido empatado. Se suma 1 punto.");
                break;
            case 'P':
                partidosJugados++;
                System.out.println(" Partido perdido. No se suman puntos.");
                break;
            default:
                System.out.println(" Opción no válida. Intente nuevamente.");
                return;
        }

        mostrarClasificacion();
    }

    // 🔹 Método 3: Mostrar la clasificación actual
    public void mostrarClasificacion() {
        System.out.println("Clasificación actual:");
        System.out.println("Partidos jugados: " + partidosJugados);
        System.out.println("Puntos acumulados: " + puntos);
    }
    
}
