
import javax.swing.JOptionPane;

/**
 * Classe criada para apresentar ao cliente um menu de opções com os 
 * diversos sabores de Pizza e o Pão
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 30/10/2025
 */
public class Menu {

    IPizza pizza;
    Forno forno = new Forno();
    String mensagem;
    public Menu() {
        int opc;
        mensagem = "1) Frango com Catupiry\n" +
                   "2) Calabresa \n" +
                   "3) Cinco Queijos\n" +
                   "4) Caipira\n" + 
                   "5) Portuguesa\n" +
                   "6) Moda do Chefe\n" +
                   "7) Calzone\n" + 
                   "8) Romeu e Julieta\n" +
                   "9) Pão Caseiro\n" +
                   "10) Sair";
        
        opc = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
        
        switch(opc) {
            case 1:
                pizza = new FrangoCatupiry();
                break;
            case 2:
                pizza = new Calabresa();
                break;
            case 3:
                pizza = new CincoQueijos();
                break;
            case 4: 
                pizza = new Caipira();
                break;
            case 5:
                pizza = new Portuguesa();
                break;
            case 6:
                pizza = new ModaChefe();
                break;
            case 7: 
                pizza = new Calzone();
                break;
            case 8:
                pizza = new RomeuJulieta();
                break;
            case 9: 
                pizza = new PaoCaseiro();
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "Você escolheu encerrar o programa");
                System.exit(0);
                
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!!");
            
        }
        
        
        // objeto polimórfico
        forno.preparar(pizza);
    } // fim do construtor
    
    
} // fim da classe
