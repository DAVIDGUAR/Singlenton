package ejemplosingleton;

/**
 *
 * @author david
 */
public class EjemploSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Singlenton obx1 = Singlenton.getInstance();
        
        Singlenton obx2 = Singlenton.getInstance();
        
        Singlenton obx3 = Singlenton.getInstance();
        
        Singlenton obx4 = Singlenton.getInstance();
   
        System.out.println("obx1---"+obx1.toString());
         System.out.println("obx2---"+obx2.toString());
          System.out.println("obx3---"+obx3.toString());
           System.out.println("obx4---"+obx4.toString());
           System.out.println("Cambiamos nombre a obx1");
           obx1.setNombre("juan");
           obx2.setNumero(5);
           System.out.println("obx1---"+obx1.toString());
         System.out.println("obx2---"+obx2.toString());
          System.out.println("obx3---"+obx3.toString());
           System.out.println("obx4---"+obx4.toString());
    }
    
}
