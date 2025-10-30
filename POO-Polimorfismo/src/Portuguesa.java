/**
 * Classe criada para implementar TODOS os metodos abstratos da Interface IPizza
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 30/10/2025
 */
public class Portuguesa implements IPizza{

    @Override
    public void montar() {
        System.out.println("Pizza Portuguesa");
        System.out.println("Ingredientes: Presunto, Ovo cozido, Mussarela, Cebola, Azeitonas Pretas ");
    }

    @Override
    public void assar() {
        System.out.println("15 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("R$ 59,00");
    }

} // fim da classe
