/**
 * Classe criada para implementar TODOS os metodos abstratos da Interface IPizza
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 30/10/2025
 */
public class Calzone implements IPizza {

    @Override
    public void montar() {
        System.out.println("Pizza de Calzone");
        System.out.println("Ingredientes: presunto, calabresa, palmito, catupiry");
    }

    @Override
    public void assar() {
        System.out.println("18 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("R$ 54,00");
    }

} // fim da classe
