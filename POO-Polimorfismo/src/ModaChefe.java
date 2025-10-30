/**
 * Classe criada para implementar TODOS os metodos abstratos da Interface IPizza
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 30/10/2025
 */
public class ModaChefe implements IPizza {

    @Override
    public void montar() {
        System.out.println("Pizza á Moda do Chefe");
        System.out.println("Ingredientes: Lombo, milho, catupiry, azeitonas verdes");
    }

    @Override
    public void assar() {
        System.out.println("15 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("R$ 50,00");
    }

} // fim da classe
