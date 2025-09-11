
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe criada para...
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 11/09/2025
 */
public class Caminhao extends Veiculo {

    String carroceria;
    float tara;
    int eixos;
    
    
    public Caminhao(String marca, String modelo, String cor, int ano, float valor, String carroceria, float tara, int eixos){
       
        super(marca, modelo, cor, ano, valor);
        
        this.carroceria = carroceria;
        this.tara = tara;
        this.eixos = eixos;
        
    }
    
    
    // Construtor com GUI
    public Caminhao(){
        this.carroceria = JOptionPane.showInputDialog("Carroceria: ");
        this.tara = Float.parseFloat(JOptionPane.showInputDialog("Tara: "));
        this.eixos = Integer.parseInt(JOptionPane.showInputDialog("Eixos: "));
    }
    
    // Metodo para exibir dados do caminhão por GUI
    public void exibirDadosCaminhaoGUI(){
        
        String msg = "Carroceria: " + carroceria;
               msg = msg + "\nTara: " + tara +
                           "\nEixos: " + eixos;
               
        String msgV = super.exibirDadosVeiculoGUI();
        
        msg = msgV + msg;
        
        JOptionPane.showMessageDialog(null, msg, "Dados do Caminhão", - 1);
        
    }
    
    public void exibirDadosCaminhao(){
      
        super.exibirDadosVeiculo();
        
        System.out.println("Carroceria: " + carroceria);
        System.out.println("Tara: " + tara);
        System.out.println("Eixos: " + eixos);
    }
    
} // fim da classe
