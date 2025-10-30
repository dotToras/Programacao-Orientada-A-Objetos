
/**
 * Classe criada para todos os metodos abstratos da interface IPizza
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 30/10/2025
 */
public class CincoQueijos implements IPizza{

    @Override
    public void montar() {
        System.out.println("Pizza de Cinco Queijos");
        System.out.println("Ingredientes: mussarela, provolone, gorgonzola, cheddar, parmesão, tomate, orégano");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 9 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("R$ 70,00");
    }

    
    
} // fim da classe
