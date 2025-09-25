/**
 * Classe criada para demonstrar o recurso de sobrescrita de métodos
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 25/09/2025
 */
public class Pessoa {

    String nome;
    int idade;
    float altura;

    // Construtor do objeto Pessoa em memória
    public Pessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    
    // Metodo para exibir os dados de Pessoa
    public void exibirDados(){
        System.out.println("Nome da Pessoa: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }
    
    
    
} // fim da classe
