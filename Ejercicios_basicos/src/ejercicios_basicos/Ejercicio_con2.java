/*Desarrolla un programa que simule un ascensor que tiene un límite de peso. El usuario ingresa
su peso y el piso al que desea ir. El programa debe verificar si el peso está dentro del límite
permitido. Si es así, el ascensor se mueve al piso deseado. Si no, muestra un mensaje de que
el ascensor está sobrecargado.*/


package ejercicios_basicos;
import java.util.Scanner;


public class Ejercicio_con2 {
Scanner op = new Scanner(System.in);

    private int pisoActual;
    private int pisoMinimo;
    private int pisoMaximo;
    private int pesoMaximo;
    
    
    
    
    
    
    public void datosAscensor(){
        
        System.out.println("piso actual " + pisoActual);
        System.out.println("piso al que desea dirigirse ");
        int pisoDeseado = op.nextInt();
        moverAscensor(pisoDeseado);
        
    }
    
    
    public Ejercicio_con2 (int pisoMinimo, int pisoMaximo, int pesoMaximo){
        
        this.pisoActual =1;
        this.pisoMinimo=pisoMinimo;
        this.pisoMaximo=pisoMaximo;
        this.pesoMaximo = pesoMaximo;
        
        
        
    }
    
    private boolean esPesoValido(double peso) {
        return peso <= pesoMaximo;
    }
    
    private boolean pisoValido(int piso){
        
        return piso >= pisoMinimo && piso <=pisoMaximo;
    }
    
    private void moverAscensor(int pisoDeseado){
        
        if(pisoValido(pisoDeseado)){
            System.out.println("Moviendo ascensor al piso " + pisoDeseado);
            pisoActual=pisoDeseado;
            
            System.out.println("BIENVENIDO AL PISO " + pisoActual);
        }
        else{
            System.out.println("Acceso DENEGADO a este piso");
           
    }
    
    }
    
    public void inicio() {
       
        System.out.println("El ascensor está actualmente en el piso " + pisoActual);
        System.out.print("Ingrese su peso en kg: ");
        double pesoUsuario = op.nextDouble();

        if (!esPesoValido(pesoUsuario)) {
            System.out.println("¡Error! El ascensor está sobrecargado. Peso máximo permitido: " + pesoMaximo + " kg.");
            
            return;
        }
        datosAscensor();
        
        
        }
}
   
    
