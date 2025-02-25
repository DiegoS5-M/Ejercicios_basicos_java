
package ejercicios_basicos;
import java.util.Scanner;

public class Ejercicio_con23 {
    Scanner op = new Scanner(System.in);
    private String listaVehiculos; 
    private int cantidadVehiculos; 

    
    public Ejercicio_con23() {
        
        this.listaVehiculos = "";
        this.cantidadVehiculos = 0;
    }

    
    public void registrarVehiculos() {
        System.out.print("Ingrese la cantidad de vehículos a registrar: ");
        cantidadVehiculos = op.nextInt();
        op.nextLine(); // Limpiar buffer

        for (int i = 1; i <= cantidadVehiculos; i++) {
            System.out.print("Ingrese la placa del vehículo #" + i + ": ");
            String placa = op.nextLine();

            System.out.print("Ingrese la hora de ingreso (HH:MM): ");
            String horaIngreso = op.nextLine(); // Hora ingresada manualmente

            
            listaVehiculos += " Placa: " + placa + " | Hora de ingreso: " + horaIngreso + "\n";
        }

        mostrarResumen();
    }

    
    private void mostrarResumen() {
        System.out.println(" **Resumen de Vehículos Registrados:**");
        if (listaVehiculos.isEmpty()) {
            System.out.println("⚠️ No se registraron vehículos.");
        } else {
            System.out.println(listaVehiculos);
        }
    }
}
