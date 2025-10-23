/**
 * Classe criada para instanciar objetos do tipo TV que implementarao
 * TODOS os métodos da interface Eletrodomestico
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 23/10/2025
 */
public class Televisao implements Eletrodomestico {

    String marca;
    int polegada;
    boolean ligado;

    public Televisao(String marca, int polegada, boolean ligado) {
        this.marca = marca;
        this.polegada = polegada;
        this.ligado = ligado;
    }

    @Override
    public void ligar() {
        System.out.println("A TV " + marca + " foi ligada");
        this.ligado = true;
    }

    @Override
    public void desligar() {
        System.out.println("A TV está desligada");
        this.ligado = false;
    }
    
    public void desligar(int tempo) throws InterruptedException {
        while(tempo > 0) {
            Thread.sleep(1000); // equivale a 1s
            System.out.println("Desligando em:" + tempo);
            tempo--;
        }
        desligar();
    }
    
    
} // fim da classe
