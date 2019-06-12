package ejemplosingleton;

/**
 *
 * @author david
 */
public class Singlenton {

     private static Singlenton varSinglenton; // = null;
    
     private String nombre = "david";
     
     
     private int numero = 2;
     
     private float decimales =  4.5f;

    public static Singlenton getVarSinglenton() {
        return varSinglenton;
    }

    public static void setVarSinglenton(Singlenton varSinglenton) {
        Singlenton.varSinglenton = varSinglenton;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getDecimales() {
        return decimales;
    }

    public void setDecimales(float decimales) {
        this.decimales = decimales;
    }
     
     
    private  Singlenton() {
        
        
        
    }
    
    public static Singlenton getInstance(){
    
    if (varSinglenton == null){
    varSinglenton = new Singlenton();
    
    } 
    
    return varSinglenton;
            
    }

    @Override
    public String toString() {
        return "Singlenton{" + "nombre=" + nombre + ", numero=" + numero + ", decimales=" + decimales + '}';
    }
    
    
    
}
