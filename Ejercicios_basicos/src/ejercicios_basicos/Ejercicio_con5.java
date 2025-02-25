/*Combina las dos simulaciones anteriores. El programa debe simular un ascensor que lleva al
usuario a un piso deseado. Antes de moverse, el programa verifica si la temperatura ambiente
está dentro del rango aceptable. Si la temperatura está dentro del rango, el ascensor se mueve
al piso deseado. Si la temperatura está fuera del rango, muestra un mensaje de que la
temperatura no es adecuada y no permite el movimiento del ascensor*/


package ejercicios_basicos;
import java.util.Scanner;

public class Ejercicio_con5 {
    Scanner op = new Scanner(System.in);
    
    private int pisoActual;
    private int pisoMinimo;
    private int pisoMaximo;
    private double tempActual;
    private double tempMinimo;
    private double tempMaximo;
    
    
    public Ejercicio_con5 (int pisoMinimo, int pisoMaximo , double tempMinimo , double tempMaximo ){
        this.pisoActual = 1;
        this.pisoMinimo = pisoMinimo;
        this.pisoMaximo = pisoMaximo;
        this.tempMinimo = tempMinimo;
        this.tempMaximo = tempMaximo;
        
    }
    
    private void datosTemp (){
        System.out.println("ingrese temperatura actual");
        this.tempActual = op.nextDouble();
        
        
    }
    
    private boolean tempValida (){
        return tempActual >= tempMinimo && tempActual <= tempMaximo;
        
    }
    
    private boolean pisoValido (int piso){
        
        return piso >= pisoMinimo && piso <= pisoMaximo;
        
        
    }
    
    private void moverAscensor (){
        
        System.out.println("seleccion piso");
        int pisoDeseado = op.nextInt();
        
        if(!pisoValido(pisoDeseado)){
            
            System.out.println("piso invalido");
            return;
        }
        System.out.println("moviendo ascensor a piso " + pisoDeseado);
        pisoActual=pisoDeseado;
        System.out.println("llego al piso "+ pisoActual);
    }
    
    public void iniciar(){
        
        datosTemp();
        
        if(!tempValida()){
            System.out.println("temperatura fuera del rango");
            return;

        }
        
        System.out.println("temperatura adecuada");
        
        moverAscensor();
    }
   
    
   
       
   
}
