
import javax.swing.JOptionPane;


/**
 * Classe criada para exemplificar o principio do encapsulamento
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 02/10/2025
 */
public class Conta {

    private String cliente;
    private float saldo;
    private int senha;
    private boolean bloqueada;
    
    // Constrói o objeto em memória
    public Conta(String cliente, float saldo, int senha){
        this.cliente = cliente;
        this.saldo = saldo;
        this.senha = senha;
        this.bloqueada = false;
    }
    
    // Metodo comum para exibir os dados da Conta do cliente
    // Diferença metodo comum para construtor - construtor retorna objeto em memoria
    // Metodo comum retorna String, int, float, boolean, void...
    public void exibirDadosContaCliente(){
        JOptionPane.showMessageDialog(null, "Nome do Cliente: " + getCliente() + 
                                            "\nSaldo: " + getSaldo() +
                                            "\nSenha: " + getSenha());
    }
    
    
    // Metodos acessores - 
    // SET - guarda a informação
    // GET - busca a informação
    
    // qualquer acesso a conta verificar senha - metodo para verificar senha
    // se errou 3 vezes, conta é bloqueada
    // Metodo para modificar o saldo da conta do Cliete
    public void realizarSaque(){

        if(!validarSenha()){
            JOptionPane.showMessageDialog(null, "Não foi possível realizar saque !!");
        }
        else{
            float vlSaque;
            vlSaque = Float.parseFloat(JOptionPane.showInputDialog("Valor a sacar: "));
            setSaldo(getSaldo() - vlSaque);
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!!");
        }
        
    }
    
    // Método para validar a senha em diversas operações
    private boolean validarSenha(){
        
        int pwd, cont = 0;
        
        if(!isBloqueada()){
            while(cont < 3)
            {
                pwd = Integer.parseInt(JOptionPane.showInputDialog("Senha: "));

                if(pwd != getSenha()){
                    JOptionPane.showMessageDialog(null, "Senha inválida!! Tentativa: " + (cont + 1));
                    cont++;
                }
                else
                {
                    return true;
                }                
            } // fim do while
            
            setBloqueada(true);
            JOptionPane.showMessageDialog(null, "Sua conta foi bloqueada, consulte seu gerente");      
            
        } // fim do if
        else{
            JOptionPane.showMessageDialog(null, "Sua conta está bloqueada, voce nao pode realizar essa operação");
        } // fim do else
        

        return false;       
    }
    
    // Metodo para exibir o saldo da conta
    public void exibirSaldo(){
        
        if(!validarSenha()){
            JOptionPane.showMessageDialog(null, "Não foi possível consultar seu saldo");
        }
        else{
            JOptionPane.showMessageDialog(null, "Seu saldo disponível é de: R$" + getSaldo());
        }
        
    }
    
    // Metodo comum para realizar um deposito na conta
    public void realizarDeposito(){
        
        String nome = JOptionPane.showInputDialog(null, "Digite o nome da conta que você deseja depositar: ");
        
        if(!nome.equals(getCliente())){
            JOptionPane.showMessageDialog(null, "Não existe uma conta com esse nome");
        }
        else{
            float vlSacar = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor a depositar: "));
            setSaldo(getSaldo() + vlSacar);    
        }
        
    }
    
    // Metodo comum para alterar a senha
    public void alterarSenha(){
        
        if(!validarSenha()){
            JOptionPane.showMessageDialog(null, "Não foi possível alterar sua senha");
        }
        else{
            int senhaNova = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua nova senha"));
            int senhaConfirmacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Confirme sua nova senha"));
            
            if(senhaNova == senhaConfirmacao){
                setSenha(senhaNova);
                JOptionPane.showMessageDialog(null, "Senha alterada com sucesso");
            }
            else{
                JOptionPane.showMessageDialog(null, "As senhas não coincidem");
            }
            
        }
        
    }
    
    public void exibirMenu(){
        
            
        do{
            
            String msg = "1) Consultar saldo"   +
                         "\n2) Fazer saque"     +
                         "\n3) Fazer deposito"  +
                         "\n4) Alterar senha"   +
                         "\n5) Sair"            +
                         "\nOpcão desejada: ";

            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, msg));

                switch(opcao){
                    case 1:
                        exibirSaldo();
                        break;
                    case 2:
                        realizarSaque();
                        break;
                    case 3:
                        realizarDeposito();
                        break;
                    case 4:
                        alterarSenha();
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida");
                }

            } while(true);
        
    } // fim do metodo de exibir menu
    
    private void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    private float getSaldo(){
        return this.saldo;
    }

    private String getCliente() {
        return cliente;
    }

    private void setCliente(String cliente) {
        this.cliente = cliente;
    }

    private int getSenha() {
        return senha;
    }

    private void setSenha(int senha) {
        this.senha = senha;
    }

    private boolean isBloqueada() {
        return bloqueada;
    }

    private void setBloqueada(boolean bloqueada) {
        this.bloqueada = bloqueada;
    }
    
    
} // fim da classe

// Alterações no código:
// 1) Incluir as seguintes funcionalidades:
//   a) Exibir o saldo    [✔]
//   b) Realizar deposito [✔]
//   c) Trocar senha      [✔]
// O.B.S: Para operações com senha, errou mais de 3 vezes, a conta é bloqueada. [✔]