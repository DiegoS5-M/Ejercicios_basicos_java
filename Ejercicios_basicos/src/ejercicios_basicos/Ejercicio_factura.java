
package ejercicios_basicos;
import java.util.Scanner;


public class Ejercicio_factura {
    
    private String nombre;
    private String apellido;
    private String producto;
    private int cantidad;
    private double precioUnitario;
    private boolean esEstudiante;
    private char tipoCliente;
    
    public Ejercicio_factura(String nombre, String apellido, String producto, int cantidad, double precioUnitario, boolean esEstudiante, char tipoCliente){
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.esEstudiante = esEstudiante;
        this.tipoCliente = tipoCliente;
        
    }
    
    
    public static Ejercicio_factura datos_cliente(){
        Scanner op = new Scanner(System.in);
        System.out.println("Nombre Cliente");
        String nombre = op.nextLine();
        System.out.println("Apellido cliente");
        String apellido = op.nextLine();
        System.out.println("Nombre del producto");
        String producto = op.nextLine();
        System.out.println("Ingrese Cantidad");
        int cantidad = op.nextInt();
        System.out.println("Ingrese precio unitario");
        double precioUnitario = op.nextDouble();
        System.out.print("¿Es estudiante? (true/false): ");
        boolean esEstudiante = op.nextBoolean();
        System.out.println("Ingrese el tipo de cliente");
        char tipoCliente = op.next().charAt(0);
        
        
        return new Ejercicio_factura(nombre,apellido,producto,cantidad,precioUnitario,esEstudiante,tipoCliente);
    }
    
    public double calcularSubtotal(){
        return cantidad * precioUnitario;
        
    }
    public double calcularImpuesto(){
        double impuesto;
        if (esEstudiante){
            impuesto = 0.05;
        } else{
            impuesto = 0.13;
            
        }
        return calcularSubtotal()*impuesto;
         
        }
    
    public double precioTotal(){
        return calcularSubtotal()+ calcularImpuesto();
    }
    
    public void mostrarFactura(){
        
        System.out.println("===========FACTURA==========");
        System.out.println("cliente " + nombre + apellido);
        System.out.println("Nombre Producto " + producto);
        System.out.println("Cantidad seleccionada " + cantidad );
        System.out.println("Precio por unidad " + precioUnitario);
        System.out.println("¿Es estudiante? " + esEstudiante);
        System.out.println("Tipo Cliente " + tipoCliente);
        System.out.println("Subtotal : " + calcularSubtotal());
        System.out.println("Impuesto " + calcularImpuesto());
        System.out.println("TOTAL: " + precioTotal());
        
        
    }
    
            
        }
        
    
