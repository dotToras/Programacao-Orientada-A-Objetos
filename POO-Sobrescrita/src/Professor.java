/**
 * Classe criada para herdar todos os atributos e metodos da superclasse Pessoa e
 * promovendo a sobrescrita de alguns métodos
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 25/09/2025
 */
public class Professor extends Pessoa{
    
    int codigo;
    String disciplina;
    private float salario;

    // Construtor do objeto Professor em memória
    public Professor(String nome, int idade, float altura, int codigo, String disciplina, float salario) {
        super(nome, idade, altura);
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.salario = salario;
    }
    
    // Sobreescrita é a mesma assinatura
    // o Override é apenas para saber que é sobreescrita, mas não precisa dele para sobreescrever
    @Override
    public void exibirDados(){
        System.out.println("\nO professor " + nome + 
                           " ministra a disciplina " + disciplina + 
                           " e tem o salário de R$" + salario);
    }
    
    // Sobrecarga não tem a mesma assinatura, obviamente
    public void exibirDados(boolean resp){
        super.exibirDados(); // exibir dados da Pessoa (superclasse)
        System.out.println("Salario: " + salario);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Código de funcionário: " + codigo);
    }

    public void exibirDados(int x){
        System.out.println("Professor: " + nome);
        System.out.println("Salario: " + salario);
    }
    
} // fim da classe
