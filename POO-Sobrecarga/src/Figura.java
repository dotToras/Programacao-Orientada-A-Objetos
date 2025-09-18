
import javax.swing.JOptionPane;


/**
 * Classe criada para demonstrar o recurso de sobrecarga de metódos
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 18/09/2025
 */
public class Figura {

    // classe Integer
    Integer a, b, c, d;
    
    // Construtor para um ponto
    public Figura(int a){
        this.a = a;
    }
    
    // Construtor para uma linha
    public Figura(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    // Construtor para um triangulo
    public Figura(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    // Construtor para um quadrado
    public Figura(int a, int b, int c, int d){   
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;    
    }
    // Documentação para os metodos
    /** Metodo genérico para exibir qualquer tipo de figura
     *  Este método identificará automaticamente qual é o tipo
     *  de Figura que foi instanciada
     *  
     *  
     */
    public void exibirFigura(){
        // inicialmente usamos int para comparar com null mas nao da para comparar tipos primitivos com null
        // ai mudamos para a classe Integer, porque objetos podem ser comparados
        if(a != null && b == null && c == null && d == null){
            exibirFigura(3); // valor passado meramente para diferenciar os exibir Figura
        }
        else if(a != null && b != null && c == null && d == null){
            exibirFigura("Teste");
        }
        else if(a != null && b != null && c != null && d == null){
            exibirFigura(true);
        }
        else if(a != null && b != null && c != null && d != null){
            exibirFigura(80f);
        }
    }
    
    /** Metodo comum para exibir os dados do ponto
        Deverá se passado um número inteiro para retornar o valor de um Ponto
        *@param x
       * @return Um objeto do tipo Ponto
    */
    public void exibirFigura(int x){
        JOptionPane.showMessageDialog(null, "É um ponto de valor: " + a, "PONTO", -1);
    }
     
    // Metodo comum para exibir os dados de uma linha
    public void exibirFigura(String k){
        JOptionPane.showMessageDialog(null, "É uma linha de coordenadas " + a + " e " + b, "LINHA", -1);
    }
    
    // Metodo comum para exibir os dados de um triangulo
    public void exibirFigura(boolean u){
        JOptionPane.showMessageDialog(null, "É um triangulo de coodernadas " + a + " e " + b + " e " + c, "Triangulo", -1);
    }
    
    // Metodo comum para exibir os dados de um quadrado
    public void exibirFigura(float k){
        JOptionPane.showMessageDialog(null, "É um quadrado de coordernadas: " + "+x:"+ a + " -x:" + b + " +y:" + c + " -y:" + d, "Quadrado", -1);
    }
    
    
} // fim da classe
