/**
 * Classe criada para implementar TODOS os metodos abstratos da Interface IPizza
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 30/10/2025
 */
public class Caipira implements IPizza{

    @Override
    public void montar() {
        System.out.println("Pizza Caipira");
        System.out.println("Ingredientes: Frango, Catupiry, Milho, Ervilha, Azeitonas");
    }

    @Override
    public void assar() {
        System.out.println("16 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("R$ 55,00");
    }

} // fim da classe
