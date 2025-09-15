/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe criada para instanciar objetos do tipo Pessoa
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 04/09/2025
 */
public class Objetos {

    // assinatura do metodo main, args - argumentos, e voce pode botar o nome q vc qusier pq eh o nome de um atributo
    public static void main(String []args){ // static quer dizer que ele pode ser executado sem uma instancia
        
        Pessoa pessoa, y, w, p1, p2;// Ex: Pessoa (classe) e x(variável que vai referenciar a instância, não é a instância).
        p1 = new Pessoa();
        p2 = new Pessoa();
        
        Analise analise = new Analise();
       // pessoa = new Pessoa("Matheus", 20, 1.70f, 60f ); // ou (float) 1.60 ou 1.60f, aqui é criado o objeto
       // Pessoa pessoa2 = new Pessoa("Otavio", 20, 1.80f, 50f);
       // Pessoa pessoa = new Pessoa("Ivo", 250, 1.78f); 
       // w = pessoa; // aqui se fosse x, apontaria pra pessoa "Ivo" e não "Azuma". O "Azuma" viraria lixo de memória
       
       // p1.exibirDadosPessoa();
       // p2.exibirDadosPessoa();
       
       p1.exibirDadosPessoasGui();
       p2.exibirDadosPessoasGui();
       
       // invokes dos metodos da classe Analise
       System.out.println(analise.analisarAltura(p2));
       System.out.println(analise.analisarIdade(p2));
       System.out.println(analise.compararIdades(p1, p2));

     /*  y.exibirDadosPessoa();
       x = pessoa;
       x.exibirDadosPessoa();
       pessoa.exibirDadosPessoa();
      */
     
     
    }
} // fim da classe
