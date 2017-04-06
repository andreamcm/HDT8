/*Andrea Cordón, 16076
Daniel Rodriguez, 15796
Fecha: 5 de abril de 2017
JUnit.java*/


package JUnit;
import org.junit.*;
import java.util.Vector;

/**
 *
 * @author cesaraugustocordonbalcarcel
 */
public class JUnit {
    
    @Test
    public void agregar(){
        System.out.println("Agregar: \n");
        String valor = "A";
        VectorHeap<E> instance = new VectorHeap<E>();
        instance.add(valor);
    }
    
    @Test
    public void quitar(){
        System.out.println("Quitar: \n");
        String valor2 = "C";
        String valor3 = "B";
        VectorHeap<E> instance = new VectorHeap<E>();
        instance.add(valor2);
        instance.add(valor3);
        String resultado = instance.remove("B");
    }
    
    
}

