
import java.awt.Toolkit;


/**
 * Classe criada para gerar objetos do tipo Microondas que implementar
 * TODOS os metodos da interface Eletrodomestico
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 23/10/2025
 */
public class Microondas implements Eletrodomestico{

    String marca;
    int litros;
    int potencia;
    boolean ligado;
    
    // construtor da classe Microondas
    public Microondas(String marca, int litros, int potencia) {
        this.marca = marca;
        this.litros = litros;
        this.potencia = potencia;
        this.ligado = false;
    }

    @Override
    public void ligar() {
        this.ligado = true;
        System.out.print("O microondas " + this.marca + " está ligado\n");
        
    }

    @Override
    public void desligar() {
        this.ligado = false;
        Toolkit.getDefaultToolkit().beep();
        System.out.println("aparelho desligado");
    }

    public void timer(int tempo) throws InterruptedException {
        while(tempo > 0) {
            Thread.sleep(1000);
            System.out.println("Está aquecendo..." + "Tempo restante:" + tempo + "s");
            tempo--;
        }
        desligar();
    }
    
    
    public void pipoca() throws InterruptedException {
        
        int tempo = 3;
        
        ligar();
        
        while(tempo > 0) {
            Thread.sleep(3000); // 3s o da pipoca
            System.out.println("Está aquecendo..." + "Tempo restante: " + tempo + "s");  
            tempo--; 
        }
        
        System.out.println("A pipoca está pronta!!");
        desligar();
    }
    
    int tempo = 0;
    public void mais30seg() throws InterruptedException {
    
        tempo += 30;
        System.out.println("Você adicionou mais 30s");
        ligar();
        while(tempo > 0) {
            Thread.sleep(1000);
            System.out.println("Está aquecendo...Tempo restante: " + tempo + "s");
            tempo--;
        }
        
        desligar();
    }
    
    
    
} // fim da classe
