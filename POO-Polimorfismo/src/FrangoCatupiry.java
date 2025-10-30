
/**
 * Classe criada para gerar um objeto do tipo Pizza
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 30/10/2025
 */
public class FrangoCatupiry implements IPizza {

    @Override
    public void montar() {
        System.out.println("Pizza de Frango com Catupiry");
        System.out.println("Ingredientes: molho de tomate, frango, catupiry e azeitonas verdes");
        
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 12 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor: R$ 55,00");
    }

    
    
} // fim da classe
