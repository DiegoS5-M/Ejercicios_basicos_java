
package ejercicios_basicos;
import java.util.Scanner;


public class Ejercicio_con7 {
    Scanner op= new Scanner(System.in);
    
    private double peso;
    private double altura;
    private double imc;
    private String categoria;
    
    

    // 🔹 Constructor vacío
    public Ejercicio_con7() {}

    // 🔹 Método 1: Solicitar datos al usuario
    public void solicitarDatos() {
        System.out.print("Ingrese su peso en kg: ");
        peso = op.nextDouble();
        
        System.out.print("Ingrese su altura en metros: ");
        altura = op.nextDouble();

        if (peso <= 0 || altura <= 0) {
            System.out.println("❌ Error: Peso y altura deben ser valores positivos.");
            return;
        }
    }

    // 🔹 Método 2: Calcular IMC
    public void calcularIMC() {
        if (peso > 0 && altura > 0) {
            imc = peso / (altura * altura);
            if (imc < 18.5) {
                categoria = "Bajo peso";
            } else if (imc < 24.9) {
                categoria = "Peso normal";
            } else if (imc < 29.9) {
                categoria = "Sobrepeso";
            } else {
                categoria = "Obesidad";
            }
        }
    }

    // 🔹 Método 3: Mostrar resultado
    public void mostrarResultado() {
        if (peso > 0 && altura > 0) {
            System.out.println(" Resultado de IMC ");
            System.out.println("IMC calculado: " + String.format("%.2f", imc));
            System.out.println("Categoría: " + categoria);
        }
    }
    
}
