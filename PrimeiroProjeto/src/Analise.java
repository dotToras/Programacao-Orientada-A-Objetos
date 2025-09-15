
/**
 * Classe criada para analisar um objeto do tipo Pessoa
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 04/09/2025
 */
public class Analise {

    //Metodo comum para analisar uma pessoa
    public String analisarIdade(Pessoa p){

        if(p.idade < 2)
            return p.nome + " é uma Bebê";
        else if(p.idade < 13)
            return p.nome + " é uma Criança";
        else if(p.idade < 20)
            return "Adolescente";
        else if(p.idade <= 60)
            return "Adulto";
        else if(p.idade <= 85)
            return "Idoso";
        else
            return "Matusalém";
    }
    
    public String analisarAltura(Pessoa p){
        
        if(p.altura < 1.50)
            return "Baixissima Estatura";
        else if(p.altura < 1.70)
            return "Baixa Estatura";
        else if(p.altura < 1.80)
            return "Média Estatura";
        else
            return "Alta Estatura";
        
    }
    
    public String compararIdades(Pessoa p, Pessoa p2){
        
        if(p.idade > p2.idade)
            return p.nome + " é mais velho e " + p2.nome + " é mais novo";
        else if(p.idade == p2.idade)
            return "As pessoas tem a mesma idade";
        else
            return p2.nome + " é mais velho e " + p.nome + " é mais novo" ;
    }
    
    //quando nao se bota construtor, o java bota automatico
} // fim da classe
