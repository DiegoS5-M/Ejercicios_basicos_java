
package ejercicios_basicos;
import java.util.Scanner;

public class Ejercicios_basicos {

    
    public static void main(String[] args) {
        Scanner op= new Scanner(System.in);
        
        System.out.println("Seleccione el ejercicio a ejecutar");
        System.out.println("1. EJERCICIO 1");
        System.out.println("2. EJERCICIO 2");
        System.out.println("3. EJERCICIO 3");
        System.out.println("4. EJERCICIO 4");
        System.out.println("5. EJERCICIO 5");
        System.out.println("6. EJERCICIO 6");
        
        
        
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
                
            case 4 :
                
                Ejercicio_con3 temperatura = new Ejercicio_con3(18.5,39.8);
                temperatura.iniciar();
                break;
                
            case 5 :
                
                Ejercicio_con4 temperatura1 = new Ejercicio_con4(30.4);
                temperatura1.iniciar();
                break;
                
            case 6 :
                
                Ejercicio_con5 asctemp = new Ejercicio_con5(1,10,18.4, 28.5);
                asctemp.iniciar();
                break;
                
            case 7 : 
                
                Ejercicio_con6 tienda = new Ejercicio_con6 ();
                tienda.solicitarDatos();
                tienda.calcularCostoTotal();
                tienda.mostrarFactura();
                break;
                
            case 8 :
                
                Ejercicio_con7 calcularPeso = new Ejercicio_con7();
                calcularPeso.solicitarDatos();
                calcularPeso.calcularIMC();
                calcularPeso.mostrarResultado();
                break;
                
            case 9 : 
                
                Ejercicio_con8 cine = new Ejercicio_con8();
                cine.solicitarEdad();
                cine.determinarCategoria();
                cine.mostrarRecomendacion();
                break;
                
            case 10 :
                
                Ejercicio_con9 campeonato = new Ejercicio_con9();
                campeonato.registrarPartido();
                
                while (true) {
            campeonato.registrarPartido();
            System.out.print("¿Registrar otro partido? (S/N): ");
            char continuar = campeonato.op.next().toUpperCase().charAt(0);
            if (continuar != 'S') {
                System.out.println(" ¡Final del campeonato!");
                break;
                
            }
                }
                break;
                
            case 11:
                
                Ejercicio_con10 menu = new Ejercicio_con10();
                
                menu.mostrarMenu();
                break;
                
            case 12 :
                
                Ejercicio_con11 cajero = new Ejercicio_con11(10000.0);
                
                cajero.iniciarCajero();
                break;
                
            case 13 :
                
                Ejercicio_con12 tienda2 = new Ejercicio_con12();
                
                tienda2.iniciarTienda();
                break;
                
            case 14 : 
                
                Ejercicio_con13 impresora = new Ejercicio_con13(10);
                impresora.iniciarImpresion();
                break;
                
            case 15 : 
                
                Ejercicio_con14 viaje = new Ejercicio_con14();
                viaje.iniciarSimulacion();
                break;
                
            case 16 : 
                
                Ejercicio_con15 cuentaRegresiva = new Ejercicio_con15();
                
                cuentaRegresiva.ejecutar();
                break;
                
            case 17 : 
                
                Ejercicio_con16 adivinar = new Ejercicio_con16();
                
                adivinar.iniciarJuego();
                break;
                
            case 18 : 
                
                Ejercicio_con17 biblio = new Ejercicio_con17();
                
                biblio.registrarLibros();
                break;
                
            case 19 :
                
                Ejercicio_con18 comidaRapida = new Ejercicio_con18();
                
                comidaRapida.tomarPedido();
                break;
                
            case 20 :
                
                Ejercicio_con19 sensor = new Ejercicio_con19();
                
                sensor.ejecutarSensor();
                break;
                
            case 21 : 
                
                Ejercicio_con20 notas = new Ejercicio_con20();
                
                notas.ingresarNotas();
                break;
                
            case 22 : 
                
                Ejercicio_con21 gestionTareas = new Ejercicio_con21();
                
                gestionTareas.agregarTareas();
                break;
                
            case 23 :
                
                Ejercicio_con22 registroVentas = new Ejercicio_con22();
                registroVentas.registrarVentas();
                break;
                
            case 24 :
                
                Ejercicio_con23 parking = new Ejercicio_con23();
                
                parking.registrarVehiculos();
                break;
                
            case 25 :
                
                Ejercicio_con24 tiendaVirtual = new Ejercicio_con24();
                tiendaVirtual.realizarCompra();
                break;
                
            case 26 :
                
                Ejercicio_con25 agenda = new Ejercicio_con25();
                agenda.agregarContactos();
                break;
                
            case 27 :
                
                Ejercicio_con26 num = new Ejercicio_con26();
                num.ingresarNumeros();
                break;
                
            case 28 :
                
                 Ejercicio_con27 Ventas = new Ejercicio_con27();
                Ventas.registrarVentas();
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
