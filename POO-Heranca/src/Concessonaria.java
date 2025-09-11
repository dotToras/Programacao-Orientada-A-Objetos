/**
 * Classe criada para instanciar objetos do tipo Carro
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 11/09/2025
 */
public class Concessonaria {

    public static void main(String[] args) {
        
        //Carro carro = new Carro("Mercedes", "CLA250", "Rosa", 2026, (float)345000, 250, true);
        Carro carro = new Carro();
        // carro.exibirDadosCarro();
        carro.exibirDadosCarroGUI();
        
        //Caminhao caminhao = new Caminhao("Scania", "770s", "Azul", 2026, 1169400.00f, "Báu", 700.3f, 2);
        Caminhao caminhao = new Caminhao();
        //caminhao.exibirDadosCaminhao();
        caminhao.exibirDadosCaminhaoGUI();
    }
    
} // fim da classe
