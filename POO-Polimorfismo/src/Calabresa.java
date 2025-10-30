
/**
 * Classe criada para implementar TODOS os metodos abstratos da Interface IPizza
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 30/10/2025
 */
public class Calabresa implements IPizza {

    @Override
    public void montar() {
        System.out.println("Pizza de Calabresa");
        System.out.println("Ingredientes: Tomate, Cebola, Calabresa, Azeitonas Pretas");
        
    }

    @Override
    public void assar() {
        System.out.println("15 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("R$ 45,00");
    }

    
} // fim da classe
