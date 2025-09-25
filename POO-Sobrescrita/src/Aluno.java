
/**
 * Classe criada para...
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 25/09/2025
 */
public class Aluno extends Pessoa{

    long RA;
    float media;
    int qtdFaltas;
    boolean dependencia;

    public Aluno(String nome, int idade, float altura, long RA, float media, int qtdFaltas, boolean dependencia) {
        super(nome, idade, altura);
        this.RA = RA;
        this.media = media;
        this.qtdFaltas = qtdFaltas;
        this.dependencia = dependencia;
    }
    
    @Override
    public void exibirDados(){
       
        System.out.println("RA: " + RA +
                            " Média: " + media +
                            " Quantidade de Faltas: " + qtdFaltas +
                            " Dependência: " + (dependencia ?"Sim":"Não"));
    }
    
    // Metodo com sobrecarga escrito para pegar a quantidade de faltas de um Aluno
    public void exibirDados(int RA){
        super.exibirDados();
        System.out.println("Qtd de Faltas: " + qtdFaltas);
    }
    
    // Metodo com sobrecarga escrito para buscar se um Aluno tem dependência
    public void exibirDados(boolean x, String k){
        System.out.println("RA: " + RA +
                           " Dependências: " + (dependencia ?"Sim":"Não"));
    }
    
    
    
} // fim da classe
