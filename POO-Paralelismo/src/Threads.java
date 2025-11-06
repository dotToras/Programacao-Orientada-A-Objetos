
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Classe criada para gerar Threads que executam uma determinada tarefa
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 06/11/2025
 */

// Generic, map, hash...
public class Threads extends Thread {

    int sleepTime;
 
    public Threads(String nome) {
        super(nome);
        sleepTime = (int)(Math.random() * 80000);
        System.out.println("A Thread " + getName() + " vai dormir por " + sleepTime + " ms");
    }
   
    @Override
   public void run(){
        try {  
            Thread.sleep(sleepTime);
        } catch (InterruptedException ex) {
            System.out.println("A Thread " + getName() + " foi interrompida");
        }
        System.err.println("A Thread " + getName() + " ======> ACORDOU");
   }
    
} // fim da classe
