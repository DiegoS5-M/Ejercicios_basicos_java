
package ejercicios_basicos;
import java.util.Scanner;


public class Ejercicio_con6 {
    Scanner op = new Scanner(System.in);
    
    private char tipoProducto;
    private int cantidad;
    private double precioUnitario;
    private double costoSinDescuento;
    private double costoConDescuento;
    
    private final double PRECIO_A = 10.0, PRECIO_V = 20.0, PRECIO_E = 50.0;
    private final double DESCUENTO_A = 0.10, DESCUENTO_V = 0.05;
    
    
    public Ejercicio_con6(){
        
    }
    
    public void solicitarDatos(){
        System.out.println("ingrese tipo productos (A - alimento , v - vestimenta , E - electronicos");
        tipoProducto = op.next().toUpperCase().charAt(0);
        
        System.out.println("ingrese cantidad de unidades");
        cantidad = op.nextInt();
        
        if(cantidad <=0){
            System.out.println("numero invalido, cantidad debe ser positiva");
            return;
        }

    }
    
    public void calcularCostoTotal(){
        double descuento = 0;
        
        switch (tipoProducto) {
            case 'A': precioUnitario = PRECIO_A; descuento = DESCUENTO_A;
                break;
                
            case 2 : precioUnitario = PRECIO_V; descuento = DESCUENTO_V;
                break;
                
            case 3 : precioUnitario = PRECIO_E;
                break;
            default:
                System.out.println("ERROR!! - tipo de prodcuto no valido");
        }
        costoSinDescuento = cantidad * precioUnitario;
        costoConDescuento = costoSinDescuento * ( 1 - descuento);
        
    }
    
    public void mostrarFactura() {
        if (cantidad > 0 && (tipoProducto == 'A' || tipoProducto == 'V' || tipoProducto == 'E')) {
            System.out.println(" Factura");
            System.out.println("Producto: " + tipoProducto);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Costo sin descuento: " + costoSinDescuento);
            System.out.println("Costo con descuento: " + costoConDescuento);
        }
}
}