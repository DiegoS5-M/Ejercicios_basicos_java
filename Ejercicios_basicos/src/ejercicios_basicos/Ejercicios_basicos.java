
package ejercicios_basicos;
import java.util.Scanner;

public class Ejercicios_basicos {

    
    public static void main(String[] args) {
        Scanner op= new Scanner(System.in);
        
        System.out.println("Seleccione el ejercicio a ejecutar");
        System.out.println("1. EJERCICIO 1");
        System.out.println("2. EJERCICIO 2");
        System.out.println("3. EJERCICIO 3");
        
        
        int seleccion =op.nextInt();
        
        switch(seleccion){
            
            case 1:
                Ejercicio_factura factura = Ejercicio_factura.datos_cliente();
                factura.mostrarFactura();
                break;
            case 2:
                Ejercicio_con1 ascensor = new Ejercicio_con1(1, 10); 
                ascensor.datosAscensor(); 
                break;
                
            case 3:
                
                Ejercicio_con2 ascensor2 = new Ejercicio_con2(1, 10, 150); 
                 ascensor2.inicio();
                break;
                
            default:
                System.out.println("Seleccione una opcion valida");
        }
        
        
        
      // 5. llamar objeto  
       // Ejercicio1 objEjercicio1 = new Ejercicio1();
      // 6. llamar metodo
            
       /* boolean aux=objEjercicio1.tomarDatos();
        System.out.println("estado del cliente " + aux);*/
        
       /*Ejercicio_factura factura = Ejercicio_factura.datos_cliente();
       
       factura.mostrarFactura();*/
       
       
       /*Ejercicio_con1 ascensor = new Ejercicio_con1(1, 10); 
        ascensor.datosAscensor();*/
        
        
       
       
       
    }
    
}
