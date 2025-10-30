
/**
 * Classe criada para implementar TODOS os metodos abstratos da Interface IPizza
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 30/10/2025
 */
public class RomeuJulieta implements IPizza{

    @Override
    public void montar() {
        System.out.println("Pizza Romeu & Julieta");
        System.out.println("Ingredientes: queijo, goiabada, leite condensado");
        
    }

    @Override
    public void assar() {
        System.out.println("Tempo de Forno: 7 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("R$ 60,00");
    }

    
    public void adicionarIngredientes() {  
        System.out.println("Informe o que você deseja a mais");
    }
} // fim da classe
