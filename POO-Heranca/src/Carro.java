
import javax.swing.JOptionPane;


/**
 * 
 * Classe criada para herdar TODOS os atributos e metodos da superclasse Veiculo
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 11/09/2025
 */

// essa classe aumenta a funcionalidade da classe Veiculo
public class Carro extends Veiculo{

    int volumePortaMalas;
    boolean conversivel;
    
    // Constructor para um objeto do tipo Carro em memoria
    public Carro(String marca, String modelo, String cor, int ano, float valor, int volumePortaMalas, boolean conversivel){
        // mandando para superclasse (pai) o que é dela, no caso o que o construtor dela pede
        // sempre tem que ser a primeira coisa no constructor
        super(marca, modelo, cor, ano, valor);
        
        this.volumePortaMalas = volumePortaMalas;
        this.conversivel = conversivel;
    }
    
    // Constructor para entrada de dados com GUI
    public Carro(){
        
        this.volumePortaMalas = Integer.parseInt(JOptionPane.showInputDialog("Volume do Porta-malas: "));
        
        /*
        String resp = JOptionPane.showInputDialog("Conversível: ");
        
        if(resp.equals("Sim") || resp.equals("sim")){
            this.conversivel = true;
        }
        else{
            this.conversivel = false;
        }

        */
        
        this.conversivel = JOptionPane.showInputDialog("Conversivel").equalsIgnoreCase("Sim");
    }
    
    // Metodo para exibir os dados de Carro por meio de GUI
    public void exibirDadosCarroGUI(){
        
        String msg = "\nVolume porta-malas: " + volumePortaMalas;
               msg = msg + "\nConversível: " + (conversivel?"Sim":"Não");
        
        String msgV = super.exibirDadosVeiculoGUI();
        
        msg = msgV + msg;
        
        JOptionPane.showMessageDialog(null, msg, "Dados do Carro", - 1);
        
    }
    
    // Metodo comum para exibir os dados do Carro
    public void exibirDadosCarro(){
        
        super.exibirDadosVeiculo();
        System.out.println("Volume do porta-malas: " + volumePortaMalas);
        System.out.println("É conversível: " + (conversivel?"Sim":"Não"));
        
    }
    
    
} // fim da classe
