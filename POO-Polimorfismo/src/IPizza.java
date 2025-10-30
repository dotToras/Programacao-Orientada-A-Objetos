/**
 * Interface para servir de padrão para todo e qualquer tipo de Pizza
 * Possui as funcionalidades "montar, assar e cobrar"
 * @author Matheus Ferreira Gonçalves
 * @since Interface criada em 30/10/2025
 */

public interface IPizza {

    // Metodo para montar a pizza com os ingredientes
    public void montar();
    
    // Metodo para o tempo que a pizza ficará no forno
    public void assar();
    
    // Metodo para cobrar o valor de acordo com o sabor
    public void cobrar();
    
    
}
