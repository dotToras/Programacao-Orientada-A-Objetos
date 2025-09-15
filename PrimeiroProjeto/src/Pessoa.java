
// Sessão de importação
import javax.swing.JOptionPane;

/**
 * Classe criada para...
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 04/09/2025
 */
public class Pessoa {

    String nome; // importante ressaltar que string n é um tipo, é uma classe
    int idade;
    float altura;
    float peso;
    
    // Metodo Constructor do Objeto - responsável por construir um objeto na memória
    public Pessoa(String nome, int idade, float altura, float peso){
        this.nome = nome; // o this serve para falar que é um atributo e não o parametro do mesmo nome
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }
    
    //Metodo Constructor para a a entrada de dados por meio de GUI
    public Pessoa(){
        this.nome = JOptionPane.showInputDialog("Nome: ");
        this.idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
        this.altura = Float.parseFloat(JOptionPane.showInputDialog("Altura: "));
        this.peso = Float.parseFloat(JOptionPane.showInputDialog("Peso: "));
    }
    
    // Metodo comum para exibir os dados de uma Pessoa
    public void exibirDadosPessoa(){
        System.out.println("Nome: " + nome); // na concatenação, tudo é transformado em string
        System.out.println("Idade: " + idade); // na concatenação, tudo é transformado em string
        System.out.println("Altura: " + altura); // na concatenação, tudo é transformado em string
        System.out.println("Peso: " + peso);
        System.out.println("IMC: " + calcularIMC() + classificarIMC());
        
    }
    
    // Metodo comum para exibir os dados de uma pessoa por meio de GUI
    public void exibirDadosPessoasGui(){
        String msg;
        msg = "Nome " + this.nome;
        msg = msg + "\nIdade: " + this.idade;
        msg = msg + "\nPeso: " + this.peso;
        msg = msg + "\nAltura: " + this.altura;
        msg = msg + "\nIMC: " + calcularIMC() + classificarIMC();
        
        JOptionPane.showMessageDialog(null, msg, "Dados Pessoais",-1);
    }
    
    // Metodo comum para calcular o IMC de uma Pessoa
    public float calcularIMC(){
        return peso / (altura * altura);
    }
    
    // Metodo comum para classificar o IMC
    public String classificarIMC(){
        
       float imc = calcularIMC();
       
       if(imc < 16.0)
           return " Muito abaixo do peso";
       else if(imc < 18.0)
           return " Magro";
       else if(imc < 25.0)
           return " Peso normal";
       else if(imc < 30.0)
           return " Sobrepeso";
       else if(imc < 35.0)
           return " Obesidade I - Leve";
       else if(imc < 40.0)
           return " Obesidade II - Severa";
       else
           return " Obesidade III - Mórbida";
        
    }
} // fim da classe
