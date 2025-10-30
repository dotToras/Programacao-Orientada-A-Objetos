
/**
 * Classe criada para instanciar objetos do tipo Pizza e submeter ao objeto polimórfico Forno para
 * ser preparada
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 30/10/2025
 */
public class Pizzaria {

    public static void main(String args[]) {
        // Aqui de acordo com o polimorfimo, vc diz que essa variavel é uma pizza mas chama o construtor do sabor (Calabresa)
        // IPizza pizza1 = new Calabresa();
        // IPizza pizza2 = new CincoQueijos();
        // IPizza pizza3 = new FrangoCatupiry();
        // IPizza pizza4 = new RomeuJulieta();
        // IPizza pao = new PaoCaseiro();
        // Forno forno = new Forno();
        
        // Importante ressaltar que como está usando a interface IPizza, n dá para usar os metodos ÚNICOS de cada classe de sabor de pizza
        // Só temos acesso ao assar, montar, cobrar
        // Só teriamos acesso se invés de IPizza fosse o nome da classe normal
        
        // Comportamento polimorfo, o preparo vai se acordo com a pizza que eu passar
        // forno.preparar(pizza3);
        // forno.preparar(pizza1);
        //forno.preparar(pao);
        
        while(true) {
            Menu menu = new Menu();
        }
       
    }
    
} // fim da classe
