
/**
 * Classe criada para gerar o objeto polimorfico Forno que irá preparar
 * TODO e QUALQUER tipo de Pizza
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 30/10/2025
 */
public class Forno {

    public void preparar(IPizza pizza) {
        pizza.montar();
        pizza.assar();
        pizza.cobrar();
    }
    
} // fim da classe
