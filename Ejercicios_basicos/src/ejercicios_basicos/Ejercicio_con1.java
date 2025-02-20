package ejercicios_basicos;
import java.util.Scanner;

public class Ejercicio_con1 {
    private int pisoActual ;
    private int pisoMinimo;
    private int pisoMaximo;
    
    
    public void datosAscensor(){
        Scanner op = new Scanner(System.in);
        System.out.println("piso actual " + pisoActual);
        System.out.println("piso al que desea dirigirse ");
        int pisoDeseado = op.nextInt();
        
        moverAscensor(pisoDeseado);
        
        
        
    }
    
    
    
    public Ejercicio_con1 (int pisoMinimo, int pisoMaximo){
        
        this.pisoActual =1;
        this.pisoMinimo = pisoMinimo;
        this.pisoMaximo = pisoMaximo;
        
        
    }
    
    private boolean pisoValido (int piso){
        return piso >= pisoMinimo && piso<=pisoMaximo;
        
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
    
        
        
            
        
        
        
        
    }
    
    
            
    

