/*Crea un programa que simule un sensor de temperatura ambiente. El usuario ingresa la
temperatura actual y el programa verifica si la temperatura está dentro de un rango aceptable
(por ejemplo, entre 18°C y 25°C). Si está dentro del rango, muestra un mensaje indicando que
la temperatura es adecuada. Si no, muestra un mensaje de que la temperatura está fuera del
rango deseado.*/
package ejercicios_basicos;
import java.util.Scanner;


public class Ejercicio_con3 {
Scanner op = new Scanner(System.in);

private double temperaturaActual;
private double temperaturaMinima;
private double temperaturaMaxima;




public Ejercicio_con3 (double temperaturaMinima, double temperatutaMaxima){
    
    this.temperaturaActual= 0.0;
    this.temperaturaMinima = temperaturaMinima;
    this.temperaturaMaxima = temperatutaMaxima;
    
}

private void datosTemp(){
    System.out.println("ingrese la temperaatura acutal");
     temperaturaActual = op.nextDouble();
    
    
}

private boolean calcularTemp (){
    
    return temperaturaActual  >= temperaturaMinima && temperaturaActual <= temperaturaMaxima; 
}

private void datoFinal (){
    
    if(calcularTemp()){
        
        System.out.println("la temperatura es adecuada");
        
    }
    else {
        System.out.println("la temperatura esta fuera del rango deseado");
    }
}
public void iniciar(){
datosTemp();
datoFinal();
}




}
