


/**
 * Classe criada para instanciar os objetos do tipo Thread e propor o
 * paralelismo 
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 06/11/2025
 */
public class testaThread {

    public static void main(String args[]) {
        while(true) {
            
            Threads t1 = new Threads("Matheus"); 
            Threads t2 = new Threads("Jãobrunco"); 
            Threads t3= new Threads("Macarrão com Salsicha"); 
            Threads t4 = new Threads("Hoje está muito arroz com feijão"); 

            t1.start();
            t2.start();
            t3.start();
            t4.start();
            
        }      
    }    
} // fim da classe
