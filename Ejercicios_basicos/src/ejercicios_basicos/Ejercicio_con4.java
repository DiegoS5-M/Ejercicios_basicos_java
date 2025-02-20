/*Escribe un programa que simule un sensor de temperatura ambiente y un umbral de alerta. El
usuario ingresa la temperatura actual, y el programa verifica si la temperatura está por encima
del umbral de alerta. Si es así, muestra un mensaje de alerta. Si no, muestra un mensaje de
que la temperatura es normal.*/

package ejercicios_basicos;
import java.util.Scanner;


public class Ejercicio_con4 {
Scanner op = new Scanner(System.in);

private double tempAmbiente;
private double tempMaxima;



public  Ejercicio_con4 ( double tempMaxima){
 this.tempAmbiente = 0.0;
 this.tempMaxima = tempMaxima;
 
}

private void datosTempe(){
    System.out.println("ingrese la temperatura ambiente acutal");
    tempAmbiente = op.nextDouble();
    
}

private boolean calcularTemp(){
    
    return tempAmbiente <= tempMaxima;
    
}

private void datosFinal(){
    if(calcularTemp()){
        System.out.println("temperatura normal");
    }
    else {
        System.out.println("¡ALERTA! TEMPERATURA EXCEDIO EL RANGO");
    }
    
}

public void iniciar(){
    datosTempe();
    datosFinal();
    
}


}


