/**
 * Classe criada para instanciar um objeto do tipo PaoCaseiro para ser 
 * preparado pelo objeto polimórfico Forno
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 30/10/2025
 */

// N é uma pizza, mas vai ter os mesmos metodos
public class PaoCaseiro implements IPizza{

    @Override
    public void montar() {
        System.out.println("Pão Caseiro");
        System.out.println("Ingredientes: Farinha, leite, ovos, fermento, sal, açúcar, óleo");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 40 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("R$ 15,00");
    }

    
    
} // fim da classe
