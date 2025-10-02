
/**
 * Classe criada para criar instâncias de Conta Corrente e
 * testar o encapsulamento
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 02/10/2025
 */
public class Movimentacao {
    
    public static void main(String args[]){
        
        Conta cc = new Conta("Tutancamon II", 1400f, 489032);
        
        
        // voce nao pode dar total acesso a um atributo fora da classe dela
        // ex : cc.saldo = cc.saldo - 100;
        // se sim, é informação prostituida
        
        cc.exibirMenu();

        
    } // fim do main
    
} // fim da classe
