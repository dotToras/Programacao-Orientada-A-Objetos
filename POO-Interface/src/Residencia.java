
/**
 * Classe criada para instanciar objetos do tipo Eletrodomestico e testar suas
 * funcionalidades
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 23/10/2025
 */
public class Residencia {
 
    public static void main(String[] args) throws InterruptedException {
        
        Televisao TV = new Televisao("LG", 65, false);
        Microondas MO = new Microondas("Philco", 15, 74 );
 //       TV.ligar();
 //       TV.desligar();
 //      TV.desligar(10);
        
        //MO.timer(6);
        //MO.pipoca();
        MO.mais30seg();
    }
    
} // fim da classe
