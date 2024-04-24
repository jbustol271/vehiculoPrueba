
package vehiculo;

/**
 *
 * @author 
 */
public class Main {
    
      public static void main(String[] args) {
        Vehiculo2324 miVehiculo2324;
        int stockActual;
        
        miVehiculo2324 = new Vehiculo2324("Seat",18000,100);
        oprativaVehiculo2324(miVehiculo2324, 50); 
        stockActual = miVehiculo2324.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

    public static void oprativaVehiculo2324(Vehiculo2324 miVehiculo2324, Integer cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculo2324.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculo2324.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
