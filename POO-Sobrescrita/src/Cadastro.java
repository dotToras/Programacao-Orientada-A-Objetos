/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe criada para instanciar objetos do tipo Pessoa e Professor
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 25/09/2025
 */
public class Cadastro {

    public static void main(String []args){
        
        Pessoa p = new Pessoa("Yojimbo", 46, 1.70f);
        Professor prof = new Professor("Tetsuo", 54, 1.74f, 98212, "Algébra Linear", 7500f);
        Aluno alu = new Aluno("Sanjimbo", 22, 1.60f, 2830482411099L, 7.83f, 10, false);
        //p.exibirDados();
        //prof.exibirDados();
        //prof.exibirDados(true);
        prof.exibirDados(0);
        alu.exibirDados();
       
    } // fim do main
    
} // fim da classe
