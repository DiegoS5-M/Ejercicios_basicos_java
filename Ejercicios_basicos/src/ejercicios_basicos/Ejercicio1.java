
package ejercicios_basicos;
import java.util.Scanner;

//1. crear la clase
public class Ejercicio1 {
    // 2. crear atributos
    //crear constructor
    // da el estado inicial del objeto
    
    public Ejercicio1(){
        
    }
    //crear metodos
    public boolean tomarDatos (){
        Scanner objTeclado = new Scanner(System.in);
        System.out.println("escriba el nombre del cliente");
        String nombreCliente = objTeclado.nextLine();
        System.out.println("escriba el apellido del cliente");
        String apellidoCliente = objTeclado.nextLine();
        
        //Ejercicio1 objAux=new Ejercicio1();
        Ejercicio1.calcularDatos(nombreCliente,apellidoCliente);
        return true;
    }
    private static void calcularDatos(String datoNombre,String datoApellido){
        System.out.println("nombre cliente " + datoNombre);
        System.out.println("apellido cliente " + datoApellido);
        
    }
    public void mostrarResultados(){
        
    }
}
