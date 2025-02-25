
package ejercicios_basicos;
import java.util.Scanner;

public class Ejercicio_con8 {
    Scanner op = new Scanner(System.in);
    private int edad;
    private String categoria;
    private String recomendacion;
    
     

    // 🔹 Constructor vacío
    public Ejercicio_con8() {}

    // 🔹 Método 1: Solicitar la edad del usuario
    public void solicitarEdad() {
        System.out.print("Ingrese su edad: ");
        edad = op.nextInt();
        
        if (edad < 0) {
            System.out.println("❌ Error: La edad no puede ser negativa.");
            return;
        }
    }

    // 🔹 Método 2: Determinar la categoría de edad y recomendación
    public void determinarCategoria() {
        if (edad < 7) {
            categoria = "Niños pequeños";
            recomendacion = "Películas animadas y educativas: 'Coco', 'Frozen', 'Toy Story'.";
        } else if (edad >= 7 && edad <= 17) {
            categoria = "Niños y adolescentes";
            recomendacion = "Películas familiares y de aventuras: 'Spider-Man', 'Jumanji', 'Encanto'.";
        } else if (edad >= 18 && edad <= 30) {
            categoria = "Adultos jóvenes";
            recomendacion = "Géneros variados: 'Inception', 'John Wick', 'Interestelar'.";
        } else {
            categoria = "Personas mayores";
            recomendacion = "Películas clásicas y dramas: 'El Padrino', 'Forrest Gump', 'Titanic'.";
        }
    }

    // 🔹 Método 3: Mostrar la recomendación
    public void mostrarRecomendacion() {
        if (edad >= 0) {
            System.out.println("️ Recomendación de Cine ️");
            System.out.println("Categoría: " + categoria);
            System.out.println("Sugerencias de películas: " + recomendacion);
        }
    }
    
}
