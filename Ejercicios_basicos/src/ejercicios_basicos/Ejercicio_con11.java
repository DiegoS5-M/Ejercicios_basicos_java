
package ejercicios_basicos;
import java.util.Scanner;


public class Ejercicio_con11 {
    Scanner op = new Scanner(System.in);
    private double saldo;
    

    // 🔹 Constructor: Inicializa el saldo y el Scanner
    public Ejercicio_con11(double saldoInicial) {
        this.saldo = saldoInicial;
        
    }

    // 🔹 Método 1: Mostrar el saldo actual
    public void mostrarSaldo() {
        System.out.println(" Su saldo actual es: $" + saldo);
    }

    // 🔹 Método 2: Realizar un retiro
    public void retirarDinero() {
        System.out.print("\nIngrese el monto que desea retirar: ");
        double monto = op.nextDouble();

        if (monto > saldo) {
            System.out.println("️ Saldo insuficiente. No puede retirar más de $" + saldo);
        } else if (monto <= 0) {
            System.out.println("️ Monto inválido. Ingrese un valor mayor a 0.");
        } else {
            saldo -= monto;
            System.out.println(" Retiro exitoso. Nuevo saldo: $" + saldo);
        }
    }

    // 🔹 Método 3: Iniciar la simulación del cajero
    public void iniciarCajero() {
        while (true) {
            System.out.println(" BIENVENIDO AL CAJERO AUTOMÁTICO ");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = op.nextInt();

            switch (opcion) {
                case 1 -> mostrarSaldo();
                case 2 -> retirarDinero();
                case 3 -> {
                    System.out.println("? Gracias por usar el cajero. ¡Hasta pronto!");
                    return;
                }
                default -> System.out.println("⚠️ Opción inválida. Intente de nuevo.");
            }
        }
    }
}
