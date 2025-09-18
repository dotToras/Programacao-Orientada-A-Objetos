
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe criada para exibir um Menu de opções par ao usuário
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 18/09/2025
 */
public class Menu {

    int opc;
    String msg; 
    Figura figura;
    int a, b, c, d;
   
    boolean flag = true;
    public Menu(){
        msg = "1 - Ponto\n2 - Linha\n3 - Triangulo\n4 - Retangulo";
        msg = msg + "\n5 - Finalizar o programa";
        
        do
        {
            opc = Integer.parseInt(JOptionPane.showInputDialog(msg));

            switch(opc){
                case 1:
                    a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do Ponto:"));
                    figura = new Figura(a);
                    break;
                case 2:
                    a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor inicial da linha:"));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor final da linha:"));
                    figura = new Figura(a, b);
                    break;
                case 3:
                    System.out.println("Construindo um Triangulo...");                
                    a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor inicial da linha:"));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor da linha:"));
                    c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor final da linha:")); 
                    figura = new Figura(a, b, c);
                    break;
                case 4:
                    System.out.println("Construindo um quadrado...");                
                    a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor inicial da linha:"));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor da linha:"));
                    c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor da linha:"));
                    d = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor final da linha:")); 
                    figura = new Figura(a, b, c, d);                
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saindo...", "SAIR", 1);
                    flag = false;
                    System.exit(0);
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida", "OPÇÃO INVÁLIDA", -1);                    
            } // fim do switch
            
            if(flag != false)
            {
                figura.exibirFigura();
            } 
            
        } while(true);// fim do Do-While
    } // fim do construtor
    
} // fim da classe
